package com.api.entity;

import java.io.Serializable;

/**
 * 服务定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionServEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 服务定义编码
	 */
	private String id;

	/**
	 * 服务定义名称
	 */
	private String name;

	/**
	 * 服务图标
	 */
	private String icon;

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
	 * 获取name
	 *
	 * @return name name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取icon
	 *
	 * @return icon icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置icon
	 * 
	 * @param icon
	 *            icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionServEntity [id=" + id + ", name=" + name + ", icon=" + icon + "]";
	}

}
