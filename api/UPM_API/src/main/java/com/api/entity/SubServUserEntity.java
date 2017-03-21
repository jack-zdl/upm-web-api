package com.api.entity;

import java.io.Serializable;

/**
 * 子服务用户实体类
 * 
 * @author HCK
 *
 */
public class SubServUserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务用户编码
	 */
	private String id;

	/**
	 * 所属子服务
	 */
	private SubServEntity subServ;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubServUserEntity [id=" + id + ", subServ=" + subServ + ", username=" + username + ", password="
				+ password + ", definitionUserRole=" + definitionUserRole + ", mappingSubOrderUserId="
				+ mappingSubOrderUserId + "]";
	}

}
