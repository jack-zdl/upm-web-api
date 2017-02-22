package com.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * 
 * @author HCK
 *
 */
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 登录用户名
	 */
	private String loginName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 联系电话
	 */
	private String telephone;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 所属单位
	 */
	private String company;

	/**
	 * 所属组别
	 */
	private UserGroupEntity userGroup;

	/**
	 * 所属用户角色
	 */
	private UserRoleEntity userRole;

	/**
	 * 用户是否有效
	 */
	private boolean validate;

	/**
	 * 最近登陆时间
	 */
	private Date latestLoginDateTime;

	/**
	 * 获取登录用户名
	 *
	 * @return loginName 登录用户名
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * 设置登录用户名
	 *
	 * @param loginName
	 *            登录用户名
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * 获取密码
	 *
	 * @return password 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置密码
	 *
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取联系电话
	 *
	 * @return telephone 联系电话
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置联系电话
	 *
	 * @param telephone
	 *            联系电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * 获取邮箱
	 *
	 * @return email 邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置邮箱
	 *
	 * @param email
	 *            邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取所属单位
	 *
	 * @return company 所属单位
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * 设置所属单位
	 *
	 * @param company
	 *            所属单位
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * 获取所属组别
	 *
	 * @return userGroup 所属组别
	 */
	public UserGroupEntity getUserGroup() {
		return userGroup;
	}

	/**
	 * 设置所属组别
	 *
	 * @param userGroup
	 *            所属组别
	 */
	public void setUserGroup(UserGroupEntity userGroup) {
		this.userGroup = userGroup;
	}

	/**
	 * 获取所属用户角色
	 *
	 * @return userRole 所属用户角色
	 */
	public UserRoleEntity getUserRole() {
		return userRole;
	}

	/**
	 * 设置所属用户角色
	 *
	 * @param userRole
	 *            所属用户角色
	 */
	public void setUserRole(UserRoleEntity userRole) {
		this.userRole = userRole;
	}

	/**
	 * 获取用户是否有效
	 *
	 * @return validate 用户是否有效
	 */
	public boolean isValidate() {
		return validate;
	}

	/**
	 * 设置用户是否有效
	 *
	 * @param validate
	 *            用户是否有效
	 */
	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	/**
	 * 获取最近登陆时间
	 *
	 * @return latestLoginDateTime 最近登陆时间
	 */
	public Date getLatestLoginDateTime() {
		return latestLoginDateTime;
	}

	/**
	 * 设置最近登陆时间
	 *
	 * @param latestLoginDateTime
	 *            最近登陆时间
	 */
	public void setLatestLoginDateTime(Date latestLoginDateTime) {
		this.latestLoginDateTime = latestLoginDateTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEntity [loginName=" + loginName + ", password=" + password + ", telephone=" + telephone + ", email="
				+ email + ", company=" + company + ", userGroup=" + userGroup + ", userRole=" + userRole
				+ ", validate=" + validate + ", latestLoginDateTime=" + latestLoginDateTime + "]";
	}

}
