package com.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作日志实体类
 * 
 * @author HCK
 *
 */
public class OperateLogEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 操作日志编码
	 */
	private String id;

	/**
	 * 操作模块名称
	 */
	private String operateModelName;

	/**
	 * 操作动作
	 */
	private String operateAction;

	/**
	 * 操作对象编码
	 */
	private String operateObjId;

	/**
	 * 操作对象名称
	 */
	private String operateObjName;

	/**
	 * 操作者
	 */
	private String operateLoginName;

	/**
	 * 操作时间
	 */
	private Date operateDateTime;

	/**
	 * 操作状态
	 */
	private Integer operateStatus;

	/**
	 * 获取操作日志编码
	 *
	 * @return id 操作日志编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置操作日志编码
	 *
	 * @param id
	 *            操作日志编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取操作模块名称
	 *
	 * @return operateModelName 操作模块名称
	 */
	public String getOperateModelName() {
		return operateModelName;
	}

	/**
	 * 设置操作模块名称
	 *
	 * @param operateModelName
	 *            操作模块名称
	 */
	public void setOperateModelName(String operateModelName) {
		this.operateModelName = operateModelName;
	}

	/**
	 * 获取操作动作
	 *
	 * @return operateAction 操作动作
	 */
	public String getOperateAction() {
		return operateAction;
	}

	/**
	 * 设置操作动作
	 *
	 * @param operateAction
	 *            操作动作
	 */
	public void setOperateAction(String operateAction) {
		this.operateAction = operateAction;
	}

	/**
	 * 获取操作对象编码
	 *
	 * @return operateObjId 操作对象编码
	 */
	public String getOperateObjId() {
		return operateObjId;
	}

	/**
	 * 设置操作对象编码
	 *
	 * @param operateObjId
	 *            操作对象编码
	 */
	public void setOperateObjId(String operateObjId) {
		this.operateObjId = operateObjId;
	}

	/**
	 * 获取操作对象名称
	 *
	 * @return operateObjName 操作对象名称
	 */
	public String getOperateObjName() {
		return operateObjName;
	}

	/**
	 * 设置操作对象名称
	 *
	 * @param operateObjName
	 *            操作对象名称
	 */
	public void setOperateObjName(String operateObjName) {
		this.operateObjName = operateObjName;
	}

	/**
	 * 获取操作者
	 *
	 * @return operateLoginName 操作者
	 */
	public String getOperateLoginName() {
		return operateLoginName;
	}

	/**
	 * 设置操作者
	 *
	 * @param operateLoginName
	 *            操作者
	 */
	public void setOperateLoginName(String operateLoginName) {
		this.operateLoginName = operateLoginName;
	}

	/**
	 * 获取操作时间
	 *
	 * @return operateDateTime 操作时间
	 */
	public Date getOperateDateTime() {
		return operateDateTime;
	}

	/**
	 * 设置操作时间
	 *
	 * @param operateDateTime
	 *            操作时间
	 */
	public void setOperateDateTime(Date operateDateTime) {
		this.operateDateTime = operateDateTime;
	}

	/**
	 * 获取操作状态
	 *
	 * @return operateStatus 操作状态
	 */
	public Integer getOperateStatus() {
		return operateStatus;
	}

	/**
	 * 设置操作状态
	 *
	 * @param operateStatus
	 *            操作状态
	 */
	public void setOperateStatus(Integer operateStatus) {
		this.operateStatus = operateStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperateLogEntity [id=" + id + ", operateModelName=" + operateModelName + ", operateAction="
				+ operateAction + ", operateObjId=" + operateObjId + ", operateObjName=" + operateObjName
				+ ", operateLoginName=" + operateLoginName + ", operateDateTime=" + operateDateTime + ", operateStatus="
				+ operateStatus + "]";
	}

}
