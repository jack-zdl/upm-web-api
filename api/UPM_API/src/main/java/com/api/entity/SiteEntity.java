package com.api.entity;

import java.io.Serializable;

/**
 * 站点实体类
 * 
 * @author HCK
 *
 */
public class SiteEntity extends BaseEntity implements Serializable {

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
	 * consul集群地址
	 */
	private String consulIps;

	/**
	 * consul集群端口
	 */
	private Integer consulPort;

	/**
	 * consul通讯令牌
	 */
	private String consulToken;

	/**
	 * 资源管理服务（mgm）认证证书
	 */
	private String mgmCa;

	/**
	 * 监控管理服务（horus server）认证证书
	 */
	private String horusServerCa;

	/**
	 * 资源管理过滤条件
	 */
	private String mgmPrefix;

	/**
	 * 监控管理过滤条件
	 */
	private String horusServerPrefix;

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
	 * 获取consul集群地址
	 *
	 * @return consulIps consul集群地址
	 */
	public String getConsulIps() {
		return consulIps;
	}

	/**
	 * 设置consul集群地址
	 *
	 * @param consulIps
	 *            consul集群地址
	 */
	public void setConsulIps(String consulIps) {
		this.consulIps = consulIps;
	}

	/**
	 * 获取consul集群端口
	 *
	 * @return consulPort consul集群端口
	 */
	public Integer getConsulPort() {
		return consulPort;
	}

	/**
	 * 设置consul集群端口
	 *
	 * @param consulPort
	 *            consul集群端口
	 */
	public void setConsulPort(Integer consulPort) {
		this.consulPort = consulPort;
	}

	/**
	 * 获取consul通讯令牌
	 *
	 * @return consulToken consul通讯令牌
	 */
	public String getConsulToken() {
		return consulToken;
	}

	/**
	 * 设置consul通讯令牌
	 *
	 * @param consulToken
	 *            consul通讯令牌
	 */
	public void setConsulToken(String consulToken) {
		this.consulToken = consulToken;
	}

	/**
	 * 获取资源管理服务（mgm）认证证书
	 *
	 * @return mgmCa 资源管理服务（mgm）认证证书
	 */
	public String getMgmCa() {
		return mgmCa;
	}

	/**
	 * 设置资源管理服务（mgm）认证证书
	 *
	 * @param mgmCa
	 *            资源管理服务（mgm）认证证书
	 */
	public void setMgmCa(String mgmCa) {
		this.mgmCa = mgmCa;
	}

	/**
	 * 获取监控管理服务（horus server）认证证书
	 *
	 * @return hoursServerCa 监控管理服务（horus server）认证证书
	 */
	public String getHorusServerCa() {
		return horusServerCa;
	}

	/**
	 * 设置监控管理服务（horus server）认证证书
	 *
	 * @param horusServerCa
	 *            监控管理服务（horus server）认证证书
	 */
	public void setHorusServerCa(String horusServerCa) {
		this.horusServerCa = horusServerCa;
	}

	/**
	 * 获取资源管理过滤条件
	 *
	 * @return mgmPrefix 资源管理过滤条件
	 */
	public String getMgmPrefix() {
		return mgmPrefix;
	}

	/**
	 * 设置资源管理过滤条件
	 *
	 * @param mgmPrefix
	 *            资源管理过滤条件
	 */
	public void setMgmPrefix(String mgmPrefix) {
		this.mgmPrefix = mgmPrefix;
	}

	/**
	 * 获取监控管理过滤条件
	 *
	 * @return horusServerPrefix 监控管理过滤条件
	 */
	public String getHorusServerPrefix() {
		return horusServerPrefix;
	}

	/**
	 * 设置监控管理过滤条件
	 *
	 * @param horusServerPrefix
	 *            监控管理过滤条件
	 */
	public void setHorusServerPrefix(String horusServerPrefix) {
		this.horusServerPrefix = horusServerPrefix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiteEntity [id=" + id + ", name=" + name + ", regionCode=" + regionCode + ", consulIps=" + consulIps
				+ ", consulPort=" + consulPort + ", consulToken=" + consulToken + ", mgmCa=" + mgmCa
				+ ", horusServerCa=" + horusServerCa + ", mgmPrefix=" + mgmPrefix + ", horusServerPrefix="
				+ horusServerPrefix + "]";
	}

}
