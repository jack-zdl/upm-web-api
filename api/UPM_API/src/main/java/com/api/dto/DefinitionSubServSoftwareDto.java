package com.api.dto;

import java.io.Serializable;

/**
 * 软件列表数据传输对象类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServSoftwareDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务软件定义编码
	 */
	private String id;

	/**
	 * 主版本号
	 */
	private String majorVersion;

	/**
	 * 次版本号
	 */
	private String minorVersion;

	/**
	 * 子服务定义名称
	 */
	private String name;

	/**
	 * 子服务定义图标
	 */
	private String icon;

	/**
	 * 获取子服务软件定义编码
	 *
	 * @return id 子服务软件定义编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置子服务软件定义编码
	 * 
	 * @param id
	 *            子服务软件定义编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取主版本号
	 *
	 * @return majorVersion 主版本号
	 */
	public String getMajorVersion() {
		return majorVersion;
	}

	/**
	 * 设置主版本号
	 * 
	 * @param majorVersion
	 *            主版本号
	 */
	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * 获取次版本号
	 *
	 * @return minorVersion 次版本号
	 */
	public String getMinorVersion() {
		return minorVersion;
	}

	/**
	 * 设置次版本号
	 * 
	 * @param minorVersion
	 *            次版本号
	 */
	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
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
		return "DefinitionSubServSoftwareDto [id=" + id + ", majorVersion=" + majorVersion + ", minorVersion="
				+ minorVersion + ", name=" + name + ", icon=" + icon + "]";
	}

}
