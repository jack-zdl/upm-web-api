package com.api.dto;

import java.io.Serializable;

/**
 * 
 * 
 * @author HCK
 *
 */
public class DefinitionSubServDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务定义编码
	 */
	private String id;

	/**
	 * 子服务定义名称
	 */
	private String name;

	/**
	 * 子服务定义图标
	 */
	private String icon;

	/**
	 * 获取子服务定义编码
	 *
	 * @return id 子服务定义编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置子服务定义编码
	 * 
	 * @param id
	 *            子服务定义编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取子服务定义名称
	 *
	 * @return name 子服务定义名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置子服务定义名称
	 * 
	 * @param name
	 *            子服务定义名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取子服务定义图标
	 *
	 * @return icon 子服务定义图标
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置子服务定义图标
	 * 
	 * @param icon
	 *            子服务定义图标
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
		return "DefinitionSubServDto [id=" + id + ", name=" + name + ", icon=" + icon + "]";
	}

}
