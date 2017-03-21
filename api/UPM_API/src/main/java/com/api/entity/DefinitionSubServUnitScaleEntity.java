package com.api.entity;

import java.io.Serializable;

/**
 * 子服务单元规模定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServUnitScaleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务单元规模定义编码
	 */
	private String id;

	/**
	 * 子服务单元规模定义名称
	 */
	private String name;

	/**
	 * 子服务定义名称
	 */
	private String definitionSubServName;

	/**
	 * cpu数目
	 */
	private Integer cpuNum;

	/**
	 * 内存容量
	 */
	private Integer memSize;

	/**
	 * IO权重
	 */
	private Integer ioWeight;

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
	 * 获取cpuNum
	 *
	 * @return cpuNum cpuNum
	 */
	public Integer getCpuNum() {
		return cpuNum;
	}

	/**
	 * 设置cpuNum
	 * 
	 * @param cpuNum
	 *            cpuNum
	 */
	public void setCpuNum(Integer cpuNum) {
		this.cpuNum = cpuNum;
	}

	/**
	 * 获取memSize
	 *
	 * @return memSize memSize
	 */
	public Integer getMemSize() {
		return memSize;
	}

	/**
	 * 设置memSize
	 * 
	 * @param memSize
	 *            memSize
	 */
	public void setMemSize(Integer memSize) {
		this.memSize = memSize;
	}

	/**
	 * 获取ioWeight
	 *
	 * @return ioWeight ioWeight
	 */
	public Integer getIoWeight() {
		return ioWeight;
	}

	/**
	 * 设置ioWeight
	 * 
	 * @param ioWeight
	 *            ioWeight
	 */
	public void setIoWeight(Integer ioWeight) {
		this.ioWeight = ioWeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionSubServUnitScaleEntity [id=" + id + ", name=" + name + ", definitionSubServName="
				+ definitionSubServName + ", cpuNum=" + cpuNum + ", memSize=" + memSize + ", ioWeight=" + ioWeight
				+ "]";
	}

}
