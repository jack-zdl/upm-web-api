package com.api.entity;

import java.io.Serializable;

/**
 * 子订单用户实体类
 * 
 * @author HCK
 *
 */
public class SubOrderUserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子订单用户编码
	 */
	private String id;

	/**
	 * 所属子订单
	 */
	private SubOrderEntity subOrder;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 用户角色定义编码
	 */
	private DefinitionUserRoleEntity definitionUserRole;

	/**
	 * 映射子订单用户编码
	 */
	private String mappingSubOrderUserId;

	/**
	 * 所属者
	 */
	private String owner;

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
	 * 获取username
	 *
	 * @return username username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 设置username
	 *
	 * @param username
	 *            username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取password
	 *
	 * @return password password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置password
	 *
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取definitionUserRole
	 *
	 * @return definitionUserRole definitionUserRole
	 */
	public DefinitionUserRoleEntity getDefinitionUserRole() {
		return definitionUserRole;
	}

	/**
	 * 设置definitionUserRole
	 *
	 * @param definitionUserRole
	 *            definitionUserRole
	 */
	public void setDefinitionUserRole(DefinitionUserRoleEntity definitionUserRole) {
		this.definitionUserRole = definitionUserRole;
	}

	/**
	 * 获取mappingSubOrderUserId
	 *
	 * @return mappingSubOrderUserId mappingSubOrderUserId
	 */
	public String getMappingSubOrderUserId() {
		return mappingSubOrderUserId;
	}

	/**
	 * 设置mappingSubOrderUserId
	 *
	 * @param mappingSubOrderUserId
	 *            mappingSubOrderUserId
	 */
	public void setMappingSubOrderUserId(String mappingSubOrderUserId) {
		this.mappingSubOrderUserId = mappingSubOrderUserId;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubOrderUserEntity [id=" + id + ", subOrder=" + subOrder + ", username=" + username + ", password="
				+ password + ", definitionUserRole=" + definitionUserRole + ", mappingSubOrderUserId="
				+ mappingSubOrderUserId + ", owner=" + owner + "]";
	}

}
