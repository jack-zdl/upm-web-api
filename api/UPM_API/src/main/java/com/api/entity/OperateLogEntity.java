package com.api.entity;

import java.io.Serializable;

/**
 * 操作日志实体类
 * 
 * @author HCK
 *
 */
public class OperateLogEntity extends BaseEntity implements Serializable {

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
	private String modelName;

	/**
	 * 操作动作
	 */
	private String action;

	/**
	 * 操作对象编码
	 */
	private String objId;

	/**
	 * 操作对象名称
	 */
	private String objName;

	/**
	 * 操作结果信息
	 */
	private String msg;

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
	 * @return modelName 操作模块名称
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * 设置操作模块名称
	 * 
	 * @param modelName
	 *            操作模块名称
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * 获取操作动作
	 *
	 * @return action 操作动作
	 */
	public String getAction() {
		return action;
	}

	/**
	 * 设置操作动作
	 * 
	 * @param action
	 *            操作动作
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * 获取操作对象编码
	 *
	 * @return objId 操作对象编码
	 */
	public String getObjId() {
		return objId;
	}

	/**
	 * 设置操作对象编码
	 * 
	 * @param objId
	 *            操作对象编码
	 */
	public void setObjId(String objId) {
		this.objId = objId;
	}

	/**
	 * 获取操作对象名称
	 *
	 * @return objName 操作对象名称
	 */
	public String getObjName() {
		return objName;
	}

	/**
	 * 设置操作对象名称
	 * 
	 * @param objName
	 *            操作对象名称
	 */
	public void setObjName(String objName) {
		this.objName = objName;
	}

	/**
	 * 获取操作结果信息
	 *
	 * @return msg 操作结果信息
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * 设置操作结果信息
	 * 
	 * @param msg
	 *            操作结果信息
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperateLogEntity [id=" + id + ", modelName=" + modelName + ", action=" + action + ", objId=" + objId
				+ ", objName=" + objName + ", msg=" + msg + "]";
	}

}
