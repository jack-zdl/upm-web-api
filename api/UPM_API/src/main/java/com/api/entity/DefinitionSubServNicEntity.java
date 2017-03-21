package com.api.entity;

import java.io.Serializable;

/**
 * 子服务网卡实体类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServNicEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务网卡定义编码
	 */
	private String id;

	/**
	 * 所属子服务定义
	 */
	private DefinitionSubServEntity definitionSubServ;

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
	 * 获取definitionSubServ
	 *
	 * @return definitionSubServ definitionSubServ
	 */
	public DefinitionSubServEntity getDefinitionSubServ() {
		return definitionSubServ;
	}

	/**
	 * 设置definitionSubServ
	 *
	 * @param definitionSubServ
	 *            definitionSubServ
	 */
	public void setDefinitionSubServ(DefinitionSubServEntity definitionSubServ) {
		this.definitionSubServ = definitionSubServ;
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
		return "DefinitionSubServNicEntity [id=" + id + ", definitionSubServ=" + definitionSubServ + ", nicPhyType="
				+ nicPhyType + ", nicHaType=" + nicHaType + ", networkBandWidth=" + networkBandWidth + "]";
	}

}
