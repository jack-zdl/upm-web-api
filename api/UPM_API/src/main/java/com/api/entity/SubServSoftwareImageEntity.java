package com.api.entity;

import java.io.Serializable;

/**
 * 子服务软件镜像实体类
 * 
 * @author HCK
 *
 */
public class SubServSoftwareImageEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务软件镜像编码
	 */
	private String id;

	/**
	 * 所属子服务软件定义
	 */
	private DefinitionSubServSoftwareEntity definitionSubServSoftware;

	/**
	 * 修订版本号
	 */
	private Integer patchVersion;

	/**
	 * 所属站点
	 */
	private SiteEntity site;

	/**
	 * 是否可用
	 */
	private boolean enabled;

	/**
	 * 关联编码
	 */
	private String relateId;

	/**
	 * 获取子服务软件镜像编码
	 *
	 * @return id 子服务软件镜像编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置子服务软件镜像编码
	 * 
	 * @param id
	 *            子服务软件镜像编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取所属子服务软件定义
	 *
	 * @return definitionSubServSoftware 所属子服务软件定义
	 */
	public DefinitionSubServSoftwareEntity getDefinitionSubServSoftware() {
		return definitionSubServSoftware;
	}

	/**
	 * 设置所属子服务软件定义
	 * 
	 * @param definitionSubServSoftware
	 *            所属子服务软件定义
	 */
	public void setDefinitionSubServSoftware(DefinitionSubServSoftwareEntity definitionSubServSoftware) {
		this.definitionSubServSoftware = definitionSubServSoftware;
	}

	/**
	 * 获取修订版本号
	 *
	 * @return patchVersion 修订版本号
	 */
	public Integer getPatchVersion() {
		return patchVersion;
	}

	/**
	 * 设置修订版本号
	 * 
	 * @param patchVersion
	 *            修订版本号
	 */
	public void setPatchVersion(Integer patchVersion) {
		this.patchVersion = patchVersion;
	}

	/**
	 * 获取所属站点
	 *
	 * @return site 所属站点
	 */
	public SiteEntity getSite() {
		return site;
	}

	/**
	 * 设置所属站点
	 * 
	 * @param site
	 *            所属站点
	 */
	public void setSite(SiteEntity site) {
		this.site = site;
	}

	/**
	 * 是否可用
	 *
	 * @return enabled 是否可用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * 设置是否可用
	 * 
	 * @param enabled
	 *            是否可用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取关联编码
	 *
	 * @return relateId 关联编码
	 */
	public String getRelateId() {
		return relateId;
	}

	/**
	 * 设置关联编码
	 * 
	 * @param relateId
	 *            关联编码
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
		return "SubServSoftwareImageEntity [id=" + id + ", definitionSubServSoftware=" + definitionSubServSoftware
				+ ", patchVersion=" + patchVersion + ", site=" + site + ", enabled=" + enabled + ", relateId="
				+ relateId + "]";
	}

}
