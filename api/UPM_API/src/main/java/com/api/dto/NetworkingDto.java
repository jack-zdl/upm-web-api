package com.api.dto;

import java.io.Serializable;

/**
 * 网段数据传输对象
 * 
 * @author HCK
 *
 */
public class NetworkingDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 网段名称
	 */
	private String name;

	/**
	 * 起始ip
	 */
	private String startIp;

	/**
	 * 结束ip
	 */
	private String endIp;

	/**
	 * 标记vlanID
	 */
	private String vlanId;

	/**
	 * 掩码
	 */
	private String prefix;

	/**
	 * 网关
	 */
	private String gateway;

	/**
	 * 区域编码
	 */
	private String areaId;

	/**
	 * 区域名称
	 */
	private String areaName;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

	/**
	 * 是否可用(文字显示)
	 */
	private String enabledText;

	/**
	 * 获取网段名称
	 *
	 * @return name 网段名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置网段名称
	 * 
	 * @param name
	 *            网段名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取起始IP
	 *
	 * @return startIp 起始IP
	 */
	public String getStartIp() {
		return startIp;
	}

	/**
	 * 设置起始IP
	 * 
	 * @param startIp
	 *            起始IP
	 */
	public void setStartIp(String startIp) {
		this.startIp = startIp;
	}

	/**
	 * 获取结束IP
	 *
	 * @return endIp 结束IP
	 */
	public String getEndIp() {
		return endIp;
	}

	/**
	 * 设置结束IP
	 * 
	 * @param endIp
	 *            结束IP
	 */
	public void setEndIp(String endIp) {
		this.endIp = endIp;
	}

	/**
	 * 获取标记vlanID
	 *
	 * @return vlanId 标记vlanID
	 */
	public String getVlanId() {
		return vlanId;
	}

	/**
	 * 设置标记vlanID
	 * 
	 * @param vlanId
	 *            标记vlanID
	 */
	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	/**
	 * 获取掩码
	 *
	 * @return prefix 掩码
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * 设置掩码
	 * 
	 * @param prefix
	 *            掩码
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * 获取网关
	 *
	 * @return gateway 网关
	 */
	public String getGateway() {
		return gateway;
	}

	/**
	 * 设置网关
	 * 
	 * @param gateway
	 *            网关
	 */
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	/**
	 * 获取areaId
	 *
	 * @return areaId areaId
	 */
	public String getAreaId() {
		return areaId;
	}

	/**
	 * 设置areaId
	 * 
	 * @param areaId
	 *            areaId
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	/**
	 * 获取areaName
	 *
	 * @return areaName areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * 设置areaName
	 * 
	 * @param areaName
	 *            areaName
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * 获取enabled
	 *
	 * @return enabled enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * 设置enabled
	 *
	 * @param enabled
	 *            enabled
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取enabledText
	 *
	 * @return enabledText enabledText
	 */
	public String getEnabledText() {
		return enabledText;
	}

	/**
	 * 设置enabledText
	 *
	 * @param enabledText
	 *            enabledText
	 */
	public void setEnabledText(String enabledText) {
		this.enabledText = enabledText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NetworkingDto [name=" + name + ", startIp=" + startIp + ", endIp=" + endIp + ", vlanId=" + vlanId
				+ ", prefix=" + prefix + ", gateway=" + gateway + ", areaId=" + areaId + ", areaName=" + areaName
				+ ", enabled=" + enabled + ", enabledText=" + enabledText + "]";
	}

}
