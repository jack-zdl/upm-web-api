package com.api.entity;

import java.io.Serializable;

/**
 * 子订单网卡实体类
 * 
 * @author HCK
 *
 */
public class SubOrderNicEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子订单网卡编码
	 */
	private String id;

	/**
	 * 所属子订单
	 */
	private SubOrderEntity subOrder;

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
	 * 设置id
	 *
	 * @param id
	 *            id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取subOrder
	 *
	 * @return subOrder subOrder
	 */
	public SubOrderEntity getSubOrder() {
		return subOrder;
	}

	/**
	 * 设置subOrder
	 *
	 * @param subOrder
	 *            subOrder
	 */
	public void setSubOrder(SubOrderEntity subOrder) {
		this.subOrder = subOrder;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubOrderNicEntity [id=" + id + ", subOrder=" + subOrder + ", nicPhyType=" + nicPhyType + ", nicHaType="
				+ nicHaType + ", networkBandWidth=" + networkBandWidth + "]";
	}

}
