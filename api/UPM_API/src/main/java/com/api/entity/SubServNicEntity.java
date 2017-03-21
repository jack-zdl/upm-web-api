package com.api.entity;

import java.io.Serializable;

/**
 * 子服务网卡实体类
 * 
 * @author HCK
 *
 */
public class SubServNicEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务网卡编码
	 */
	private String id;

	/**
	 * 所属子服务
	 */
	private SubServEntity subServ;

	/**
	 * 网卡类型
	 */
	private String nicPhyType;

	/**
	 * 网卡高可用类型
	 */
	private String nicHaType;

	/**
	 * 网络带宽
	 */
	private Integer networkBandWidth;

	/**
	 * 获取id
	 *
	 * @return id id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 获取subServ
	 *
	 * @return subServ subServ
	 */
	public SubServEntity getSubServ() {
		return subServ;
	}

	/**
	 * 设置subServ
	 *
	 * @param subServ
	 *            subServ
	 */
	public void setSubServ(SubServEntity subServ) {
		this.subServ = subServ;
	}

	/**
	 * 获取nicPhyType
	 *
	 * @return nicPhyType nicPhyType
	 */
	public String getNicPhyType() {
		return nicPhyType;
	}

	/**
	 * 设置nicPhyType
	 *
	 * @param nicPhyType
	 *            nicPhyType
	 */
	public void setNicPhyType(String nicPhyType) {
		this.nicPhyType = nicPhyType;
	}

	/**
	 * 获取nicHaType
	 *
	 * @return nicHaType nicHaType
	 */
	public String getNicHaType() {
		return nicHaType;
	}

	/**
	 * 设置nicHaType
	 *
	 * @param nicHaType
	 *            nicHaType
	 */
	public void setNicHaType(String nicHaType) {
		this.nicHaType = nicHaType;
	}

	/**
	 * 获取networkBandWidth
	 *
	 * @return networkBandWidth networkBandWidth
	 */
	public Integer getNetworkBandWidth() {
		return networkBandWidth;
	}

	/**
	 * 设置networkBandWidth
	 *
	 * @param networkBandWidth
	 *            networkBandWidth
	 */
	public void setNetworkBandWidth(Integer networkBandWidth) {
		this.networkBandWidth = networkBandWidth;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubServNicEntity [id=" + id + ", subServ=" + subServ + ", nicPhyType=" + nicPhyType + ", nicHaType="
				+ nicHaType + ", networkBandWidth=" + networkBandWidth + "]";
	}

}
