package com.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 服务实体类
 * 
 * @author HCK
 *
 */
public class ServEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 服务编码
	 */
	private String id;

	/**
	 * 所属服务定义
	 */
	private DefinitionServEntity definitionServ;

	/**
	 * 订单
	 */
	private OrderEntity order;

	/**
	 * 所属区域
	 */
	private AreaEntity area;

	/**
	 * 服务业务编码
	 */
	private String servBusinessCode;

	/**
	 * 服务业务名称
	 */
	private String servBusinessName;

	/**
	 * 订单类型
	 */
	private String owner;

	/**
	 * 包含子订单
	 */
	private List<SubServEntity> subServList;

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
	 * 获取definitionServ
	 *
	 * @return definitionServ definitionServ
	 */
	public DefinitionServEntity getDefinitionServ() {
		return definitionServ;
	}

	/**
	 * 设置definitionServ
	 *
	 * @param definitionServ
	 *            definitionServ
	 */
	public void setDefinitionServ(DefinitionServEntity definitionServ) {
		this.definitionServ = definitionServ;
	}

	/**
	 * 获取order
	 *
	 * @return order order
	 */
	public OrderEntity getOrder() {
		return order;
	}

	/**
	 * 设置order
	 *
	 * @param order
	 *            order
	 */
	public void setOrder(OrderEntity order) {
		this.order = order;
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

	/**
	 * 获取servBusinessCode
	 *
	 * @return servBusinessCode servBusinessCode
	 */
	public String getServBusinessCode() {
		return servBusinessCode;
	}

	/**
	 * 设置servBusinessCode
	 *
	 * @param servBusinessCode
	 *            servBusinessCode
	 */
	public void setServBusinessCode(String servBusinessCode) {
		this.servBusinessCode = servBusinessCode;
	}

	/**
	 * 获取servBusinessName
	 *
	 * @return servBusinessName servBusinessName
	 */
	public String getServBusinessName() {
		return servBusinessName;
	}

	/**
	 * 设置servBusinessName
	 *
	 * @param servBusinessName
	 *            servBusinessName
	 */
	public void setServBusinessName(String servBusinessName) {
		this.servBusinessName = servBusinessName;
	}

	/**
	 * 获取owner
	 *
	 * @return owner owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * 设置owner
	 *
	 * @param owner
	 *            owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * 获取subServList
	 *
	 * @return subServList subServList
	 */
	public List<SubServEntity> getSubServList() {
		return subServList;
	}

	/**
	 * 设置subServList
	 *
	 * @param subServList
	 *            subServList
	 */
	public void setSubServList(List<SubServEntity> subServList) {
		this.subServList = subServList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServEntity [id=" + id + ", definitionServ=" + definitionServ + ", order=" + order + ", area=" + area
				+ ", servBusinessCode=" + servBusinessCode + ", servBusinessName=" + servBusinessName + ", owner="
				+ owner + "]";
	}

}
