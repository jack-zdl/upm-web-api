package com.api.entity;

import java.io.Serializable;

/**
 * 用户角色实体类
 * 
 * @author HCK
 *
 */
public class UserRoleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 角色代码
	 */
	private String code;

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 角色级别
	 */
	private String level;

	/**
	 * 角色描述
	 */
	private String description;

	/**
	 * 角色是否可见
	 */
	private boolean visible;

	/**
	 * 获取角色代码
	 *
	 * @return code 角色代码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置角色代码
	 *
	 * @param code
	 *            角色代码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取角色名称
	 *
	 * @return name 角色名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置角色名称
	 *
	 * @param name
	 *            角色名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取角色级别
	 *
	 * @return level 角色级别
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 设置角色级别
	 *
	 * @param level
	 *            角色级别
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * 获取角色描述
	 *
	 * @return description 角色描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置角色描述
	 *
	 * @param description
	 *            角色描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取角色是否可见
	 *
	 * @return visible 角色是否可见
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * 设置角色是否可见
	 *
	 * @param visible
	 *            角色是否可见
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRolesEntity [code=" + code + ", name=" + name + ", level=" + level + ", description=" + description
				+ ", visible=" + visible + "]";
	}

}
