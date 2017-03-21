package com.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 子任务实体类
 * 
 * @author HCK
 *
 */
public class SubTaskEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子任务编码
	 */
	private String id;

	/**
	 * 子任务操作对象类型
	 */
	private String objType;

	/**
	 * 子任务操作对象编码
	 */
	private String objId;

	/**
	 * 子任务操作动作类型
	 */
	private String actionType;

	/**
	 * 是否异步任务
	 */
	private boolean async;

	/**
	 * 子任务开始时间
	 */
	private Date startDateTime;

	/**
	 * 子任务结束时间
	 */
	private Date endDateTime;

	/**
	 * 子任务状态
	 */
	private String status;

	private String url;
	private String methodType;
	private String param;

	/**
	 * 关联任务编码
	 */
	private String relateTaskId;

	/**
	 * 关联任务状态
	 */
	private Integer relateTaskStatus;

	/**
	 * 关联任务回执
	 */
	private String relateTaskMsg;

	/**
	 * 子任务优先级
	 */
	private Integer priority;

	/**
	 * 所属任务
	 */
	private TaskEntity task;

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
	 * 获取async
	 *
	 * @return async async
	 */
	public boolean isAsync() {
		return async;
	}

	/**
	 * 设置async
	 * 
	 * @param async
	 *            async
	 */
	public void setAsync(boolean async) {
		this.async = async;
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
	 * 获取url
	 *
	 * @return url url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置url
	 *
	 * @param url
	 *            url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取methodType
	 *
	 * @return methodType methodType
	 */
	public String getMethodType() {
		return methodType;
	}

	/**
	 * 设置methodType
	 *
	 * @param methodType
	 *            methodType
	 */
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	/**
	 * 获取param
	 *
	 * @return param param
	 */
	public String getParam() {
		return param;
	}

	/**
	 * 设置param
	 *
	 * @param param
	 *            param
	 */
	public void setParam(String param) {
		this.param = param;
	}

	/**
	 * 获取relateTaskId
	 *
	 * @return relateTaskId relateTaskId
	 */
	public String getRelateTaskId() {
		return relateTaskId;
	}

	/**
	 * 设置relateTaskId
	 * 
	 * @param relateTaskId
	 *            relateTaskId
	 */
	public void setRelateTaskId(String relateTaskId) {
		this.relateTaskId = relateTaskId;
	}

	/**
	 * 获取relateTaskStatus
	 *
	 * @return relateTaskStatus relateTaskStatus
	 */
	public Integer getRelateTaskStatus() {
		return relateTaskStatus;
	}

	/**
	 * 设置relateTaskStatus
	 * 
	 * @param relateTaskStatus
	 *            relateTaskStatus
	 */
	public void setRelateTaskStatus(Integer relateTaskStatus) {
		this.relateTaskStatus = relateTaskStatus;
	}

	/**
	 * 获取relateTaskMsg
	 *
	 * @return relateTaskMsg relateTaskMsg
	 */
	public String getRelateTaskMsg() {
		return relateTaskMsg;
	}

	/**
	 * 设置relateTaskMsg
	 * 
	 * @param relateTaskMsg
	 *            relateTaskMsg
	 */
	public void setRelateTaskMsg(String relateTaskMsg) {
		this.relateTaskMsg = relateTaskMsg;
	}

	/**
	 * 获取priority
	 *
	 * @return priority priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 设置priority
	 * 
	 * @param priority
	 *            priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * 获取task
	 *
	 * @return task task
	 */
	public TaskEntity getTask() {
		return task;
	}

	/**
	 * 设置task
	 * 
	 * @param task
	 *            task
	 */
	public void setTask(TaskEntity task) {
		this.task = task;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubTaskEntity [id=" + id + ", objType=" + objType + ", objId=" + objId + ", actionType=" + actionType
				+ ", async=" + async + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + ", status="
				+ status + ", url=" + url + ", methodType=" + methodType + ", param=" + param + ", relateTaskId="
				+ relateTaskId + ", relateTaskStatus=" + relateTaskStatus + ", relateTaskMsg=" + relateTaskMsg
				+ ", priority=" + priority + ", task=" + task + "]";
	}

}
