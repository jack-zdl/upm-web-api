package com.api.entity;

import java.io.Serializable;

/**
 * 用户组别实体类
 * 
 * @author HCK
 *
 */
public class UserGroupEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 组别代码
	 */
	private String id;

	/**
	 * 组别名称
	 */
	private String name;

	/**
	 * 获取组别代码
	 *
	 * @return id 组别代码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置组别代码
	 *
	 * @param id
	 *            组别代码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取组别名称
	 *
	 * @return name 组别名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置组别名称
	 *
	 * @param name
	 *            组别名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserGroupEntity [id=" + id + ", name=" + name + "]";
	}

}
