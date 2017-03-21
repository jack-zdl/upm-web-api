package com.api.dto;

import java.io.Serializable;

/**
 * 站点数据传输对象
 * 
 * @author HCK
 *
 */
public class SiteDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 站点编码
	 */
	private String id;

	/**
	 * 站点名称
	 */
	private String name;

	/**
	 * 地域编码
	 */
	private String regionCode;

	/**
	 * 地域名称
	 */
	private String regionText;

	/**
	 * mgm状态编码
	 */
	private String mgmStatusCode;

	/**
	 * mgm状态显示
	 */
	private String mgmStatusText;

	/**
	 * horus_server状态编码
	 */
	private String hsStatusCode;

	/**
	 * horus_server状态显示
	 */
	private String hsStatusText;

	/**
	 * 获取站点编码
	 *
	 * @return id 站点编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置站点编码
	 *
	 * @param id
	 *            站点编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取站点名称
	 *
	 * @return name 站点名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置站点名称
	 *
	 * @param name
	 *            站点名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取地域编码
	 *
	 * @return regionCode 地域编码
	 */
	public String getRegionCode() {
		return regionCode;
	}

	/**
	 * 设置地域编码
	 *
	 * @param regionCode
	 *            地域编码
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	/**
	 * 获取地域名称
	 *
	 * @return regionText 地域名称
	 */
	public String getRegionText() {
		return regionText;
	}

	/**
	 * 设置地域名称
	 *
	 * @param regionText
	 *            地域名称
	 */
	public void setRegionText(String regionText) {
		this.regionText = regionText;
	}

	/**
	 * 获取mgm状态编码
	 *
	 * @return mgmStatusCode mgm状态编码
	 */
	public String getMgmStatusCode() {
		return mgmStatusCode;
	}

	/**
	 * 设置mgm状态编码
	 *
	 * @param mgmStatusCode
	 *            mgm状态编码
	 */
	public void setMgmStatusCode(String mgmStatusCode) {
		this.mgmStatusCode = mgmStatusCode;
	}

	/**
	 * 获取mgm状态显示
	 *
	 * @return mgmStatusText mgm状态显示
	 */
	public String getMgmStatusText() {
		return mgmStatusText;
	}

	/**
	 * 设置mgm状态显示
	 *
	 * @param mgmStatusText
	 *            mgm状态显示
	 */
	public void setMgmStatusText(String mgmStatusText) {
		this.mgmStatusText = mgmStatusText;
	}

	/**
	 * 获取horus_server状态编码
	 *
	 * @return hsStatusCode horus_server状态编码
	 */
	public String getHsStatusCode() {
		return hsStatusCode;
	}

	/**
	 * 设置horus_server状态编码
	 *
	 * @param hsStatusCode
	 *            horus_server状态编码
	 */
	public void setHsStatusCode(String hsStatusCode) {
		this.hsStatusCode = hsStatusCode;
	}

	/**
	 * 获取horus_server状态显示
	 *
	 * @return hsStatusText horus_server状态显示
	 */
	public String getHsStatusText() {
		return hsStatusText;
	}

	/**
	 * 设置horus_server状态显示
	 *
	 * @param hsStatusText
	 *            horus_server状态显示
	 */
	public void setHsStatusText(String hsStatusText) {
		this.hsStatusText = hsStatusText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteDto [id=" + id + ", name=" + name + ", regionCode=" + regionCode + ", regionText=" + regionText
				+ ", mgmStatusCode=" + mgmStatusCode + ", mgmStatusText=" + mgmStatusText + ", hsStatusCode="
				+ hsStatusCode + ", hsStatusText=" + hsStatusText + "]";
	}

}
