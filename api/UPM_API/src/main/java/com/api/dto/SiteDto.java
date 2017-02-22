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
	private String regionName;

	/**
	 * mgm状态编码
	 */
	private int mgmStatusCode;

	/**
	 * mgm状态名称
	 */
	private String mgmStatusName;

	/**
	 * horus_server状态编码
	 */
	private int hsStatusCode;

	/**
	 * horus_server状态名称
	 */
	private String hsStatusName;

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
	 * @return regionName 地域名称
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * 设置地域名称
	 *
	 * @param regionName
	 *            地域名称
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * 获取mgm状态编码
	 *
	 * @return mgmStatusCode mgm状态编码
	 */
	public int getMgmStatusCode() {
		return mgmStatusCode;
	}

	/**
	 * 设置mgm状态编码
	 *
	 * @param mgmStatusCode
	 *            mgm状态编码
	 */
	public void setMgmStatusCode(int mgmStatusCode) {
		this.mgmStatusCode = mgmStatusCode;
	}

	/**
	 * 获取mgm状态名称
	 *
	 * @return mgmStatusName mgm状态名称
	 */
	public String getMgmStatusName() {
		return mgmStatusName;
	}

	/**
	 * 设置mgm状态名称
	 *
	 * @param mgmStatusName
	 *            mgm状态名称
	 */
	public void setMgmStatusName(String mgmStatusName) {
		this.mgmStatusName = mgmStatusName;
	}

	/**
	 * 获取horus_server状态编码
	 *
	 * @return hsStatusCode horus_server状态编码
	 */
	public int getHsStatusCode() {
		return hsStatusCode;
	}

	/**
	 * 设置horus_server状态编码
	 *
	 * @param hsStatusCode
	 *            horus_server状态编码
	 */
	public void setHsStatusCode(int hsStatusCode) {
		this.hsStatusCode = hsStatusCode;
	}

	/**
	 * 获取horus_server状态名称
	 *
	 * @return hsStatusName horus_server状态名称
	 */
	public String getHsStatusName() {
		return hsStatusName;
	}

	/**
	 * 设置horus_server状态名称
	 *
	 * @param hsStatusName
	 *            horus_server状态名称
	 */
	public void setHsStatusName(String hsStatusName) {
		this.hsStatusName = hsStatusName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteDto [id=" + id + ", name=" + name + ", regionCode=" + regionCode + ", regionName=" + regionName
				+ ", mgmStatusCode=" + mgmStatusCode + ", mgmStatusName=" + mgmStatusName + ", hsStatusCode="
				+ hsStatusCode + ", hsStatusName=" + hsStatusName + "]";
	}

}
