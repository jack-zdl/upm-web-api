package com.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 订单实体类
 * 
 * @author HCK
 *
 */
public class OrderEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单编码
	 */
	private String id;

	/**
	 * 所属服务定义
	 */
	private DefinitionServEntity definitionServ;

	/**
	 * 所属站点
	 */
	private SiteEntity site;

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
	private String type;

	/**
	 * 订单状态
	 */
	private String status;

	/**
	 * 订单状态信息
	 */
	private String msg;

	/**
	 * 关联订单编码
	 */
	private String associateOrderId;

	/**
	 * 包含子订单
	 */
	private List<SubOrderEntity> subOrderList;

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
	 * 获取site
	 *
	 * @return site site
	 */
	public SiteEntity getSite() {
		return site;
	}

	/**
	 * 设置site
	 * 
	 * @param site
	 *            site
	 */
	public void setSite(SiteEntity site) {
		this.site = site;
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
	 * 获取type
	 *
	 * @return type type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置type
	 * 
	 * @param type
	 *            type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取status
	 *
	 * @return status status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取msg
	 *
	 * @return msg msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * 设置msg
	 *
	 * @param msg
	 *            msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 获取associateOrderId
	 *
	 * @return associateOrderId associateOrderId
	 */
	public String getAssociateOrderId() {
		return associateOrderId;
	}

	/**
	 * 设置associateOrderId
	 * 
	 * @param associateOrderId
	 *            associateOrderId
	 */
	public void setAssociateOrderId(String associateOrderId) {
		this.associateOrderId = associateOrderId;
	}

	/**
	 * 获取subOrderList
	 *
	 * @return subOrderList subOrderList
	 */
	public List<SubOrderEntity> getSubOrderList() {
		return subOrderList;
	}

	/**
	 * 设置subOrderList
	 *
	 * @param subOrderList
	 *            subOrderList
	 */
	public void setSubOrderList(List<SubOrderEntity> subOrderList) {
		this.subOrderList = subOrderList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", definitionServ=" + definitionServ + ", site=" + site + ", area=" + area
				+ ", servBusinessCode=" + servBusinessCode + ", servBusinessName=" + servBusinessName + ", type=" + type
				+ ", status=" + status + ", msg=" + msg + ", associateOrderId=" + associateOrderId + ", subOrderList="
				+ subOrderList + "]";
	}

}
