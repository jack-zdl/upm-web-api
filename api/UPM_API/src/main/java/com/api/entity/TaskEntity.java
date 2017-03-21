package com.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 任务实体类
 * 
 * @author HCK
 *
 */
public class TaskEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 任务编码
	 */
	private String id;

	/**
	 * 任务操作对象类型
	 */
	private String objType;

	/**
	 * 任务操作对象编码
	 */
	private String objId;

	/**
	 * 任务操作动作类型
	 */
	private String actionType;

	/**
	 * 任务开始时间
	 */
	private Date startDateTime;

	/**
	 * 任务结束时间
	 */
	private Date endDateTime;

	/**
	 * 任务状态
	 */
	private String status;

	/**
	 * 任务回执
	 */
	private String msg;

	/**
	 * 包含子任务
	 */
	private List<SubTaskEntity> subTaskList;

	/**
	 * 操作日志
	 */
	private OperateLogEntity operateLog;

	/**
	 * 任务创建者
	 */
	private String createUserLoginName;

	/**
	 * 获取id
	 *
	 * @return id id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取objType
	 *
	 * @return objType objType
	 */
	public String getObjType() {
		return objType;
	}

	/**
	 * 设置objType
	 * 
	 * @param objType
	 *            objType
	 */
	public void setObjType(String objType) {
		this.objType = objType;
	}

	/**
	 * 获取objId
	 *
	 * @return objId objId
	 */
	public String getObjId() {
		return objId;
	}

	/**
	 * 设置objId
	 * 
	 * @param objId
	 *            objId
	 */
	public void setObjId(String objId) {
		this.objId = objId;
	}

	/**
	 * 获取actionType
	 *
	 * @return actionType actionType
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * 设置actionType
	 * 
	 * @param actionType
	 *            actionType
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/**
	 * 获取startDateTime
	 *
	 * @return startDateTime startDateTime
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * 设置startDateTime
	 * 
	 * @param startDateTime
	 *            startDateTime
	 */
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * 获取endDateTime
	 *
	 * @return endDateTime endDateTime
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * 设置endDateTime
	 * 
	 * @param endDateTime
	 *            endDateTime
	 */
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	/**
	 * 获取status
	 *
	 * @return status status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取msg
	 *
	 * @return msg msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * 设置msg
	 * 
	 * @param msg
	 *            msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 获取subTaskList
	 *
	 * @return subTaskList subTaskList
	 */
	public List<SubTaskEntity> getSubTaskList() {
		return subTaskList;
	}

	/**
	 * 设置subTaskList
	 * 
	 * @param subTaskList
	 *            subTaskList
	 */
	public void setSubTaskList(List<SubTaskEntity> subTaskList) {
		this.subTaskList = subTaskList;
	}

	/**
	 * 获取operateLog
	 *
	 * @return operateLog operateLog
	 */
	public OperateLogEntity getOperateLog() {
		return operateLog;
	}

	/**
	 * 设置operateLog
	 * 
	 * @param operateLog
	 *            operateLog
	 */
	public void setOperateLog(OperateLogEntity operateLog) {
		this.operateLog = operateLog;
	}

	/**
	 * 获取createUserLoginName
	 *
	 * @return createUserLoginName createUserLoginName
	 */
	public String getCreateUserLoginName() {
		return createUserLoginName;
	}

	/**
	 * 设置createUserLoginName
	 * 
	 * @param createUserLoginName
	 *            createUserLoginName
	 */
	public void setCreateUserLoginName(String createUserLoginName) {
		this.createUserLoginName = createUserLoginName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaskEntity [id=" + id + ", objType=" + objType + ", objId=" + objId + ", actionType=" + actionType
				+ ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + ", status=" + status + ", msg="
				+ msg + ", subTaskList=" + subTaskList + ", operateLog=" + operateLog + ", createUserLoginName="
				+ createUserLoginName + "]";
	}

}
