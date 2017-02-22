package com.api.entity;

import java.io.Serializable;

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
	private String hoursServerCa;

	/**
	 * 资源管理过滤条件
	 */
	private String msgPrefix;

	/**
	 * 监控管理过滤条件
	 */
	private String hoursServerPrefix;

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
	public String getHoursServerCa() {
		return hoursServerCa;
	}

	/**
	 * 设置监控管理服务（horus server）认证证书
	 *
	 * @param hoursServerCa
	 *            监控管理服务（horus server）认证证书
	 */
	public void setHoursServerCa(String hoursServerCa) {
		this.hoursServerCa = hoursServerCa;
	}

	/**
	 * 获取资源管理过滤条件
	 *
	 * @return msgPrefix 资源管理过滤条件
	 */
	public String getMsgPrefix() {
		return msgPrefix;
	}

	/**
	 * 设置资源管理过滤条件
	 *
	 * @param msgPrefix
	 *            资源管理过滤条件
	 */
	public void setMsgPrefix(String msgPrefix) {
		this.msgPrefix = msgPrefix;
	}

	/**
	 * 获取监控管理过滤条件
	 *
	 * @return hoursServerPrefix 监控管理过滤条件
	 */
	public String getHoursServerPrefix() {
		return hoursServerPrefix;
	}

	/**
	 * 设置监控管理过滤条件
	 *
	 * @param hoursServerPrefix
	 *            监控管理过滤条件
	 */
	public void setHoursServerPrefix(String hoursServerPrefix) {
		this.hoursServerPrefix = hoursServerPrefix;
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
				+ ", hoursServerCa=" + hoursServerCa + ", msgPrefix=" + msgPrefix + ", hoursServerPrefix="
				+ hoursServerPrefix + "]";
	}

}
