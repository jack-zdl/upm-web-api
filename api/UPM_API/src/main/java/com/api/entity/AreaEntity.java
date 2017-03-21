package com.api.entity;

import java.io.Serializable;

/**
 * 站点实体类
 * 
 * @author HCK
 *
 */
public class AreaEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 区域编码
	 */
	private String id;

	/**
	 * 区域名称
	 */
	private String name;

	/**
	 * 区域描述
	 */
	private String description;

	/**
	 * 是否可用
	 */
	private boolean enabled;

	/**
	 * 所属站点
	 */
	private SiteEntity site;

	/**
	 * 获取区域编码
	 *
	 * @return id 区域编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置区域编码
	 * 
	 * @param id
	 *            区域编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取区域名称
	 *
	 * @return name 区域名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置区域名称
	 * 
	 * @param name
	 *            区域名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取区域描述
	 *
	 * @return description 区域描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置区域描述
	 * 
	 * @param description
	 *            区域描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取区域是否可用
	 *
	 * @return enabled 区域是否可用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * 设置区域是否可用
	 * 
	 * @param enabled
	 *            区域是否可用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取所属站点
	 *
	 * @return site 所属站点对象
	 */
	public SiteEntity getSite() {
		return site;
	}

	/**
	 * 设置所属站点
	 * 
	 * @param site
	 *            所属站点对象
	 */
	public void setSite(SiteEntity site) {
		this.site = site;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AreaEntity [id=" + id + ", name=" + name + ", description=" + description + ", enabled=" + enabled
				+ ", site=" + site + "]";
	}

}
