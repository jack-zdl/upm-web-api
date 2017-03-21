package com.api.entity;

import java.io.Serializable;

/**
 * SAN实体类
 * 
 * @author HCK
 *
 */
public class SanEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 存储编码
	 */
	private String id;

	/**
	 * 所属站点
	 */
	private SiteEntity site;

	/**
	 * 存储名称
	 */
	private String name;

	/**
	 * 关联编码
	 */
	private String relateId;

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
	 * 获取site
	 *
	 * @return site site
	 */
	public SiteEntity getSite() {
		return site;
	}

	/**
	 * 设置site
	 * 
	 * @param site
	 *            site
	 */
	public void setSite(SiteEntity site) {
		this.site = site;
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
	 * 获取relateId
	 *
	 * @return relateId relateId
	 */
	public String getRelateId() {
		return relateId;
	}

	/**
	 * 设置relateId
	 * 
	 * @param relateId
	 *            relateId
	 */
	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SanEntity [id=" + id + ", site=" + site + ", name=" + name + ", relateId=" + relateId + "]";
	}

}
