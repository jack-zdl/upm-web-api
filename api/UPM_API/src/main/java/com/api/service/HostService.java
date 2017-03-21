package com.api.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.constant.DictConstants;
import com.api.constant.DictTypeConstants;
import com.api.constant.SysConstants;
import com.api.dao.HostDao;
import com.api.dao.SubTaskDao;
import com.api.dao.TaskDao;
import com.api.dto.HostDto;
import com.api.entity.ClusterEntity;
import com.api.entity.HostEntity;
import com.api.entity.OperateLogEntity;
import com.api.entity.SanEntity;
import com.api.entity.SubTaskEntity;
import com.api.entity.TaskEntity;
import com.api.entity.UserEntity;
import com.api.exception.APIException;
import com.api.util.DateUtils;
import com.api.util.HttpClientUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;
import com.api.util.SpringContextUtils;

/**
 * 主机管理业务处理类
 * 
 * @author HCK
 *
 */
@Service
public class HostService extends BaseService {

	@Resource
	private HostDao hostDao;
	
	@Resource
	private TaskDao taskDao;
	
	@Resource
	private SubTaskDao subTaskDao;

	/**
	 * 获取主机列表
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	public RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			List<HostEntity> hostList = hostDao.list(param);
			String siteId = (String) param.get("siteId");
			HttpSession session = request.getSession();
			JSONArray jsonArray = new JSONArray();
			boolean dataFromOtherAPI = false;
			for (HostEntity host : hostList) {
				HostDto hostDto = new HostDto();
				hostDto.setId(host.getId());
				hostDto.setName(host.getName());
				hostDto.setSshIp(host.getSshIp());
				hostDto.setAreaId(host.getCluster().getArea().getId());
				hostDto.setAreaName(host.getCluster().getArea().getName());
				hostDto.setClusterId(host.getCluster().getId());
				hostDto.setClusterName(host.getCluster().getName());
				hostDto.setSshUser(host.getSshUser());
				hostDto.setSshPassword("******");
				hostDto.setMaxContainer(host.getMaxContainer());
				hostDto.setRoom(host.getRoom());
				hostDto.setSeat(host.getSeat());
				hostDto.setHddDev(host.getHddDev());
				hostDto.setSsdDev(host.getSsdDev());
				hostDto.setNicPhyType(host.getNicPhyType());
				hostDto.setNicPhyTypeText(getTextByCode(DictTypeConstants.NIC_PHY_TYPE, hostDto.getNicPhyType()));
				TaskEntity task = taskDao.getLatestTaskByObjId(host.getId());
				if (task != null) {
					hostDto.setStatus(task.getStatus());
					hostDto.setStatusText(getTextByCode(DictTypeConstants.TASK_STATUS, hostDto.getStatus()));
				} else {
					hostDto.setStatus(DictConstants.TASK_STATUS_INPUT_NO);
					hostDto.setStatusText(getTextByCode(DictTypeConstants.TASK_STATUS, hostDto.getStatus()));
				}
				hostDto.setRelateId(host.getRelateId());
				dataFromOtherAPI = true;
				hostDto.setCreateDateTime(DateUtils.dateTimeToString(host.getCreateDateTime()));
				hostDto.setCreateLoginUserName(host.getCreateUserLoginName());
				jsonArray.add(hostDto);
			}
			
			if (dataFromOtherAPI) {
				String url = "/" + SysConstants.URL_VERSION + "/hosts";
				RespJson httpRespJson = sendHttpGet(session, siteId, SysConstants.URL_TYPE_MANAGE, url);
				if (httpRespJson.getResult() == RespJson.SUCCESS) {
					JSONArray resJsonArray = (JSONArray)httpRespJson.getData();
					for (int i = 0; i < resJsonArray.size(); i++) {
						JSONObject resJsonObject = resJsonArray.getJSONObject(i);
						for (int j = 0; j < jsonArray.size(); j++) { 
							HostDto host = (HostDto)jsonArray.get(j);
							if (resJsonObject.getString("id").equals(host.getRelateId())) {
								host.setEnabled(resJsonObject.getBoolean("enabled"));
								host.setEnabledText(getTextByCode(DictTypeConstants.STATUS_ENABLED, String.valueOf(host.getEnabled())));
								break;
							}
						}
					}
				} else {
					throw new APIException(httpRespJson.getMsg());
				}
			}
			
			return RespJsonFactory.buildSuccess(jsonArray);
		} catch (Exception e) {
			logger.error("主机查询异常", e);
			throw new APIException("主机查询异常:" + e.getMessage());
		}

	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 主机注册
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);

			// 主机编码
			String hostId = PrimaryKeyUtils.uniqueId();
			// 主机名称
			String hostName = (String) param.get("name");
			// 所属集群编码
			String clusterId = (String) param.get("clusterId");
			// ssh登陆IP地址
			String sshIp = (String) param.get("sshIp");
			// ssh登陆用户
			String sshUser = (String) param.get("sshUser");
			// ssh登陆密码
			String sshPassword = (String) param.get("sshPassword");
			// 机房名称
			String room = (String) param.get("room");
			// 机位名称
			String seat = (String) param.get("seat");
			// 容器上限
			Integer maxContainer = (Integer) param.get("maxContainer");
			// 本地hdd设备
			String hddDev = (String) param.get("hddDev");
			// 本地ssd设备
			String ssdDev = (String) param.get("ssdDev");
			// 关联san编码
			String sanId = (String) param.get("sanId");
			// 网卡类型
			String nicPhyType = (String) param.get("nicPhyType");

			// 保存操作日志
			OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_MODEL_HOST,
					DictConstants.OPERATE_ACTION_REGISTER, hostId, hostName, user.getLoginName());

			HostEntity host = new HostEntity();
			host.setId(hostId);
			ClusterEntity cluster = new ClusterEntity();
			cluster.setId(clusterId);
			host.setCluster(cluster);
			host.setName(hostName);
			host.setSshIp(sshIp);
			host.setSshUser(sshUser);
			host.setSshPassword(sshPassword);
			host.setRoom(room);
			host.setSeat(seat);
			host.setMaxContainer(maxContainer);
			host.setHddDev(hddDev);
			host.setSsdDev(ssdDev);
			SanEntity san = new SanEntity();
			san.setId(sanId);
			host.setSan(san);
			host.setNicPhyType(nicPhyType);
			host.setCreateDateTime(operateLog.getCreateDateTime());
			host.setCreateUserLoginName(user.getLoginName());
			
			hostDao.save(host);

			return RespJsonFactory.buildSuccess();
		} catch (Exception e) {
			logger.error("主机注册异常", e);
			throw new APIException("主机注册异常:" + e.getMessage());
		}
	}
	
	/**
	 * 主机入库
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param hostId
	 *            主机编码
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Transactional(rollbackFor = APIException.class)
	public RespJson input(HttpServletRequest request, String hostId) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);
			String loginName = user.getLoginName();
			
			HostEntity host = hostDao.get(hostId);
			if (host == null) {
				return RespJsonFactory.buildFailure("该主机已被其他用户删除");
			} else {
				String siteId = host.getCluster().getArea().getSite().getId();
				String objName = host.getName();
				
				// 保存操作日志
				OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_ACTION_INPUT,
						DictConstants.OPERATE_ACTION_ADD, hostId, objName, loginName);
				
				logger.info("【(" + loginName + ")主机入库_" + objName + "】-保存操作日志。。。");
				
				TaskEntity task = new TaskEntity();
				task.setId(PrimaryKeyUtils.uniqueId());
				task.setObjType(DictConstants.TASK_OBJ_TYPE_HOST);
				task.setObjId(hostId);
				task.setActionType(DictConstants.TASK_ACTION_TYPE_INPUT);
				task.setStartDateTime(operateLog.getCreateDateTime());
				task.setStatus(DictConstants.TASK_STATUS_INPUT_NO);
				task.setOperateLog(operateLog);
				task.setCreateUserLoginName(user.getLoginName());
				taskDao.save(task);
				
				logger.info("【(" + loginName + ")主机入库_" + objName + "】-创建任务。。。");
				
				SubTaskEntity subTask = new SubTaskEntity();
				subTask.setId(PrimaryKeyUtils.uniqueId());
				subTask.setObjType(DictConstants.TASK_OBJ_TYPE_HOST);
				subTask.setObjId(hostId);
				subTask.setActionType(DictConstants.TASK_ACTION_TYPE_INPUT);
				subTask.setAsync(true);
				subTask.setStartDateTime(task.getStartDateTime());
				subTask.setStatus(DictConstants.TASK_STATUS_INPUT_NO);
				String url = "/" + SysConstants.URL_VERSION + "/hosts";
				subTask.setUrl(url);
				JSONArray jsonArr = new JSONArray();
				JSONObject jsonParam = new JSONObject();
				jsonParam.put("cluster_id", host.getCluster().getRelateId());
				jsonParam.put("addr", host.getSshIp());
				jsonParam.put("username", host.getSshUser());
				jsonParam.put("password", host.getSshPassword());
				if (host.getHddDev() != null) {
					jsonParam.put("hdd", host.getHddDev().split(","));
				} 
				if (host.getSsdDev() != null) {
					jsonParam.put("ssd", host.getSsdDev().split(","));
				} 
				jsonParam.put("max_container", host.getMaxContainer());
				jsonParam.put("room", host.getRoom());
				jsonParam.put("seat", host.getSeat());
				jsonParam.put("nfs_ip", host.getCluster().getNfsBackup().getNfsIp());
				jsonParam.put("nfs_dir", host.getCluster().getNfsBackup().getNfsDir());
				jsonParam.put("nfs_mount_dir", host.getCluster().getNfsBackup().getNfsMountDir());
				jsonParam.put("nfs_mount_opts", host.getCluster().getNfsBackup().getNfsMountOpts());
				jsonArr.add(jsonParam);
				subTask.setParam(jsonArr.toJSONString());
				subTask.setMethodType(HttpClientUtils.METHOD_POST);
				subTask.setPriority(1);
				subTask.setTask(task);
				subTaskDao.save(subTask);
				
				logger.info("【(" + loginName + ")主机入库_" + objName + "】-创建子任务。。。");
				
				
				ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) SpringContextUtils.getBeanById("threadPool");
				taskExecutor.execute(new Runnable() {
					@Override
					public void run() {
						logger.info("【(" + loginName + ")主机入库_" + objName + "】-开启任务线程【创建】。。。");
						
						RespJson httpRespJson_create = null;
						try {
							subTask.setStatus(DictConstants.TASK_STATUS_CREATE_RUNNING);
							subTaskDao.update(subTask);
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-更新子任务状态(入库中)。。。");
							
							task.setStatus(DictConstants.TASK_STATUS_CREATE_RUNNING);
							taskDao.update(task);
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-更新任务状态(入库中)。。。");
							
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用创建接口。。。");
							httpRespJson_create = sendHttpPost(session, siteId, SysConstants.URL_TYPE_MANAGE, url, jsonArr.toJSONString());
							if (httpRespJson_create.getResult() == RespJson.SUCCESS) {
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用创建接口成功。。。");
								
								JSONArray resJson_create = ((JSONArray)httpRespJson_create.getData());
								String relateId = resJson_create.getJSONObject(0).getString("id");
								String relateTaskId = resJson_create.getJSONObject(0).getString("task_id");
								host.setRelateId(relateId);
								hostDao.update(host);
								
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
										+ "更新主机表_更新关联编码【relateId = " + relateId + "】。。。");
								
								subTask.setRelateTaskId(relateTaskId);
								subTaskDao.update(subTask);
								
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
										+ "更新子任务表_更新关联任务编码【relateTaskId = " + relateTaskId +"】");
								
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
										+ "【轮询关联任务状态，更新响应的子任务状态】。。。");
								
								RespJson httpRespJson_task = null;
								int relateTaskStatus = DictConstants.SUBTASK_STATUS_RUNNING;
								String taskUrl = "/" + SysConstants.URL_VERSION + "/tasks/" + relateTaskId;
								// 成功
								while (relateTaskStatus == DictConstants.SUBTASK_STATUS_RUNNING) {
									logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用任务查询接口。。。");
									httpRespJson_task = sendHttpGet(session, siteId, SysConstants.URL_TYPE_MANAGE, taskUrl);
									if (httpRespJson_task.getResult() == RespJson.SUCCESS) {
										logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用任务查询接口成功。。。");
										
										JSONObject resJson_task = ((JSONObject)httpRespJson_task.getData());
										
										relateTaskStatus = resJson_task.getIntValue("status");
										subTask.setRelateTaskStatus(relateTaskStatus);
										subTask.setRelateTaskMsg(resJson_task.getString("errors"));
										subTaskDao.update(subTask);
										
										logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
												+ "更新子任务表_更新子任务关联状态【relateTaskStatus = " + relateTaskStatus + "】。。。:");
										if (relateTaskStatus == DictConstants.SUBTASK_STATUS_RUNNING) {
											Thread.sleep(SysConstants.SEARCH_FREQUENCY_HOST_INPUT);
										}
									} else {
										logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用任务查询接口异常。。。");
										break;
									}
								}
								
								subTask.setEndDateTime(new Date());
								subTask.setRelateTaskStatus(relateTaskStatus);
								task.setEndDateTime(subTask.getEndDateTime());
								if (relateTaskStatus == DictConstants.SUBTASK_STATUS_DONE) {
									logger.info("【(" + loginName + ")主机入库_" + objName + "】-创建成功。。。");
									
									subTask.setStatus(DictConstants.TASK_STATUS_INPUT_SUCCESS);
									task.setStatus(DictConstants.TASK_STATUS_INPUT_SUCCESS);
									
								} else {
									logger.info("【(" + loginName + ")主机入库_" + objName + "】-创建失败。。。");
									
									subTask.setStatus(DictConstants.TASK_STATUS_INPUT_FAILURE);
									task.setStatus(DictConstants.TASK_STATUS_INPUT_FAILURE);
								}
								subTaskDao.update(subTask);
								
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
										+ "更新子任务表_更新子任务状态，完成时间【status = " + subTask.getStatus() 
										+ "; endDateTime = " + subTask.getEndDateTime() + "】。。。");
								
								taskDao.update(task);
								
								logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
										+ "更新任务表_更新任务状态，完成时间【status = " + task.getStatus() 
												+ "; endDateTime = " + task.getEndDateTime() + "】。。。");
								
							} else {
								throw new Exception(httpRespJson_create.getMsg());
							}
						} catch (Exception e) {
							e.printStackTrace();
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-调用创建接口异常:" + e.getMessage() + "。。。");
							subTask.setStatus(DictConstants.TASK_STATUS_INPUT_FAILURE);
							subTask.setEndDateTime(new Date());
							subTaskDao.update(subTask);
							
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
									+ "更新子任务表_更新子任务状态，完成时间【status = " + subTask.getStatus() 
									+ "; endDateTime = " + subTask.getEndDateTime() + "】。。。");
							
							task.setStatus(DictConstants.TASK_STATUS_INPUT_FAILURE);
							task.setEndDateTime(subTask.getEndDateTime());
							taskDao.update(task);
							
							logger.info("【(" + loginName + ")主机入库_" + objName + "】-"
									+ "更新任务表_更新任务状态，完成时间【status = " + task.getStatus() 
									+ "; endDateTime = " + task.getEndDateTime() + "】。。。");
						} 
					}
				});
				
				return RespJsonFactory.buildSuccess();
			}
		} catch (Exception e) {
			logger.error("主机入库异常", e);
			throw new APIException("主机入库异常:" + e.getMessage());
		}
	}
	
	/**
	 * 主机出库
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Transactional(rollbackFor = APIException.class)
	public RespJson output(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);
			String loginName = user.getLoginName();
			String id = (String) param.get("id");
			HostEntity host = hostDao.get(id);
			if (host == null) {
				return RespJsonFactory.buildWarning("该主机已被其他用户删除");
			} else {
				// 保存操作日志
				OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_MODEL_HOST,
						DictConstants.OPERATE_ACTION_OUTPUT, id, host.getName(), user.getLoginName());
				
				TaskEntity task = new TaskEntity();
				task.setId(PrimaryKeyUtils.uniqueId());
				task.setObjType(DictConstants.TASK_OBJ_TYPE_HOST);
				task.setObjId(id);
				task.setActionType(DictConstants.TASK_ACTION_TYPE_OUTPUT);
				task.setStartDateTime(operateLog.getCreateDateTime());
				// 出库为同步接口，所以状态直接为未入库
				task.setStatus(DictConstants.TASK_STATUS_INPUT_NO);
				task.setOperateLog(operateLog);
				task.setCreateUserLoginName(user.getLoginName());
				taskDao.save(task);
				
				logger.info("【(" + loginName + ")主机入库_" + host.getName() + "】-创建任务。。。");
				
				SubTaskEntity subTask = new SubTaskEntity();
				subTask.setId(PrimaryKeyUtils.uniqueId());
				subTask.setObjType(DictConstants.TASK_OBJ_TYPE_HOST);
				subTask.setObjId(id);
				subTask.setActionType(DictConstants.TASK_ACTION_TYPE_OUTPUT);
				subTask.setAsync(false);
				subTask.setStartDateTime(task.getStartDateTime());
				subTask.setStatus(DictConstants.TASK_STATUS_INPUT_NO);
				String url = null;
				String sshUser = (String) param.get("sshUser");
				String sshPassword = (String) param.get("sshPassword");
				String relateId = host.getRelateId();
				if (relateId != null) {
					url = "/" + SysConstants.URL_VERSION + "/hosts/" + relateId + "?username=" 
							+ sshUser + "&password=" + sshPassword;
				}
				subTask.setUrl(url);
				subTask.setParam(null);
				subTask.setMethodType(HttpClientUtils.METHOD_DELETE);
				subTask.setPriority(1);
				subTask.setTask(task);
				subTaskDao.save(subTask);

				host.setRelateId(null);
				hostDao.update(host);

				if (relateId != null) {
					RespJson httpRespJson = sendHttpDelete(session, host.getCluster().getArea().getSite().getId(),
							SysConstants.URL_TYPE_MANAGE, url);
					if (httpRespJson.getResult() != RespJson.SUCCESS) {
						throw new APIException(httpRespJson.getMsg());
					}
				}
				return RespJsonFactory.buildSuccess("主机出库成功");
			}
		} catch (Exception e) {
			logger.error("主机出库异常", e);
			throw new APIException("主机出库异常:" + e.getMessage());
		}
	}

	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 主机注销
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param id
	 *            主机编码
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson remove(HttpServletRequest request, String id) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);
			HostEntity host = hostDao.get(id);
			if (host == null) {
				return RespJsonFactory.buildWarning("该主机已被其他用户删除");
			} else {
				// 保存操作日志
				saveOperateLog(DictConstants.OPERATE_MODEL_HOST, DictConstants.OPERATE_ACTION_DEREGISTER, id,
						host.getName(), user.getLoginName());

				hostDao.remove(id);
				return RespJsonFactory.buildSuccess("主机注销成功");
			}
		} catch (Exception e) {
			logger.error("主机注销异常", e);
			throw new APIException("主机注销异常:" + e.getMessage());
		}
	}

}
