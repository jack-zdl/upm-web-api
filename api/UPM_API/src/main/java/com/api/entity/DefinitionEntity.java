package com.api.entity;

import java.io.Serializable;

/**
 * 定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String dictCode;
	private String code;

	/**
	 * 获取dictCode
	 *
	 * @return dictCode dictCode
	 */
	public String getDictCode() {
		return dictCode;
	}

	/**
	 * 设置dictCode
	 *
	 * @param dictCode
	 *            dictCode
	 */
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	/**
	 * 获取code
	 *
	 * @return code code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置code
	 *
	 * @param code
	 *            code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionEntity [dictCode=" + dictCode + ", code=" + code + "]";
	}

}
