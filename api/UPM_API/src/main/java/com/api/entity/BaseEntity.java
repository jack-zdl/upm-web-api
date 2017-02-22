package com.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 * 
 * @author HCK
 *
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 创建时间
	 */
	private Date createDateTime;

	/**
	 * 创建者
	 */
	private String createLoginUserName;

	/**
	 * 获取创建时间
	 *
	 * @return createDateTime 创建时间
	 */
	public Date getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createDateTime
	 *            创建时间
	 */
	public void setCreateDateTime(Date createDateTime) {
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
		return "BaseEntity [createDateTime=" + createDateTime + ", createLoginUserName=" + createLoginUserName + "]";
	}

}
