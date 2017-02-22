package com.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 字典类型实例类
 * 
 * @author HCK
 *
 */
public class DictTypeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 字典类型项代码
	 */
	private String code;
	/**
	 * 字典类型项名称
	 */
	private String name;
	/**
	 * 字典类型集合
	 */
	private List<DictEntity> dictList;

	/**
	 * 获取字典类型项代码
	 *
	 * @return code 字典类型项代码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置字典类型项代码
	 *
	 * @param code
	 *            字典类型项代码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取字典类型项名称
	 *
	 * @return name 字典类型项名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置字典类型项名称
	 *
	 * @param name
	 *            字典类型项名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取字典类型集合
	 *
	 * @return dictList 字典类型集合
	 */
	public List<DictEntity> getDictList() {
		return dictList;
	}

	/**
	 * 设置字典类型集合
	 *
	 * @param dictList
	 *            字典类型集合
	 */
	public void setDictList(List<DictEntity> dictList) {
		this.dictList = dictList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DictTypeEntity [code=" + code + ", name=" + name + ", dictList=" + dictList + "]";
	}

}
