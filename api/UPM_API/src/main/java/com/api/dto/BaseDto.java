package com.api.dto;

import java.io.Serializable;

/**
 * 基础数据传输对象
 * 
 * @author HCK
 *
 */
public class BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 唯一编码
	 */
	private String id;

	/**
	 * 创建时间
	 */
	private String createDateTime;

	/**
	 * 创建者
	 */
	private String createLoginUserName;

	/**
	 * 获取唯一编码
	 *
	 * @return id 唯一编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置唯一编码
	 * 
	 * @param id
	 *            唯一编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取创建时间
	 *
	 * @return createDateTime 创建时间
	 */
	public String getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createDateTime
	 *            创建时间
	 */
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	/**
	 * 获取创建者
	 *
	 * @return createLoginUserName 创建者
	 */
	public String getCreateLoginUserName() {
		return createLoginUserName;
	}

	/**
	 * 设置创建者
	 *
	 * @param createLoginUserName
	 *            创建者
	 */
	public void setCreateLoginUserName(String createLoginUserName) {
		this.createLoginUserName = createLoginUserName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseDto [id=" + id + ", createDateTime=" + createDateTime + ", createLoginUserName="
				+ createLoginUserName + "]";
	}

}
