package com.api.entity;

import java.io.Serializable;

/**
 * 字典实例类
 * 
 * @author HCK
 *
 */
public class DictEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 字典类型代码
	 */
	private String code;

	/**
	 * 字典类型名称
	 */
	private String name;

	/**
	 * 获取字典类型代码
	 *
	 * @return code 字典类型代码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置字典类型代码
	 *
	 * @param code
	 *            字典类型代码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取字典类型名称
	 *
	 * @return name 字典类型名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置字典类型名称
	 *
	 * @param name
	 *            字典类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DictEntity [code=" + code + ", name=" + name + "]";
	}

}
