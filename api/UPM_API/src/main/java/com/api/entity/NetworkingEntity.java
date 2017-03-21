package com.api.entity;

import java.io.Serializable;

/**
 * 网段实体类
 * 
 * @author HCK
 *
 */
public class NetworkingEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 网段编码
	 */
	private String id;

	/**
	 * 网段名称
	 */
	private String name;

	/**
	 * 网段类型
	 */
	private String type;

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
	private Integer vlanId;

	/**
	 * 掩码
	 */
	private Integer prefix;

	/**
	 * 网关
	 */
	private String gateway;

	/**
	 * 是否启用
	 */
	private boolean enabled;

	/**
	 * 所属区域
	 */
	private AreaEntity area;

	/**
	 * 获取网段编码
	 *
	 * @return id 网段编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置网段编码
	 * 
	 * @param id
	 *            网段编码
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * 获取网段类型
	 *
	 * @return type 网段类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置网段类型
	 * 
	 * @param type
	 *            网段类型
	 */
	public void setType(String type) {
		this.type = type;
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
	public Integer getVlanId() {
		return vlanId;
	}

	/**
	 * 设置标记vlanID
	 * 
	 * @param vlanId
	 *            标记vlanID
	 */
	public void setVlanId(Integer vlanId) {
		this.vlanId = vlanId;
	}

	/**
	 * 获取掩码
	 *
	 * @return prefix 掩码
	 */
	public Integer getPrefix() {
		return prefix;
	}

	/**
	 * 设置掩码
	 * 
	 * @param prefix
	 *            掩码
	 */
	public void setPrefix(Integer prefix) {
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
	 * 网段是否启用
	 *
	 * @return enabled 网段是否启用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * 设置网段是否启用
	 * 
	 * @param enabled
	 *            网段是否启用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取area
	 *
	 * @return area area
	 */
	public AreaEntity getArea() {
		return area;
	}

	/**
	 * 设置area
	 * 
	 * @param area
	 *            area
	 */
	public void setArea(AreaEntity area) {
		this.area = area;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NetworkingEntity [id=" + id + ", name=" + name + ", type=" + type + ", startIp=" + startIp + ", endIp="
				+ endIp + ", vlanId=" + vlanId + ", prefix=" + prefix + ", gateway=" + gateway + ", enabled=" + enabled
				+ ", area=" + area + "]";
	}

}
