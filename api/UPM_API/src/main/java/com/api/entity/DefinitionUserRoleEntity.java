package com.api.entity;

import java.io.Serializable;

/**
 * 用户角色定义表
 * 
 * @author HCK
 *
 */
public class DefinitionUserRoleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String definitionSubServName;
	private String privilege;
	private boolean visible;

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
	 * 获取name
	 *
	 * @return name name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 *
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取definitionSubServName
	 *
	 * @return definitionSubServName definitionSubServName
	 */
	public String getDefinitionSubServName() {
		return definitionSubServName;
	}

	/**
	 * 设置definitionSubServName
	 *
	 * @param definitionSubServName
	 *            definitionSubServName
	 */
	public void setDefinitionSubServName(String definitionSubServName) {
		this.definitionSubServName = definitionSubServName;
	}

	/**
	 * 获取privilege
	 *
	 * @return privilege privilege
	 */
	public String getPrivilege() {
		return privilege;
	}

	/**
	 * 设置privilege
	 *
	 * @param privilege
	 *            privilege
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	/**
	 * 获取visible
	 *
	 * @return visible visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * 设置visible
	 *
	 * @param visible
	 *            visible
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionUserRoleEntity [id=" + id + ", name=" + name + ", definitionSubServName="
				+ definitionSubServName + ", privilege=" + privilege + ", visible=" + visible + "]";
	}

}
