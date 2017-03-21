package com.api.entity;

import java.io.Serializable;

/**
 * 子服务软件定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServSoftwareEntity implements Serializable {

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
	private Integer majorVersion;

	/**
	 * 次版本号
	 */
	private Integer minorVersion;

	/**
	 * 所属子服务定义
	 */
	private DefinitionSubServEntity definitionSubServ;

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
	public Integer getMajorVersion() {
		return majorVersion;
	}

	/**
	 * 设置主版本号
	 * 
	 * @param majorVersion
	 *            主版本号
	 */
	public void setMajorVersion(Integer majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * 获取次版本号
	 *
	 * @return minorVersion 次版本号
	 */
	public Integer getMinorVersion() {
		return minorVersion;
	}

	/**
	 * 设置次版本号
	 * 
	 * @param minorVersion
	 *            次版本号
	 */
	public void setMinorVersion(Integer minorVersion) {
		this.minorVersion = minorVersion;
	}

	/**
	 * 获取所属子服务定义
	 *
	 * @return definitionSubServ 所属子服务定义
	 */
	public DefinitionSubServEntity getDefinitionSubServ() {
		return definitionSubServ;
	}

	/**
	 * 设置所属子服务定义
	 * 
	 * @param definitionSubServ
	 *            所属子服务定义
	 */
	public void setDefinitionSubServ(DefinitionSubServEntity definitionSubServ) {
		this.definitionSubServ = definitionSubServ;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionSubServSoftwareEntity [id=" + id + ", majorVersion=" + majorVersion + ", minorVersion="
				+ minorVersion + ", definitionSubServ=" + definitionSubServ + "]";
	}

}
