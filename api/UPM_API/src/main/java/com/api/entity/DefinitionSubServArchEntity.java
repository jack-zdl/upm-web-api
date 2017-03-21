package com.api.entity;

import java.io.Serializable;

/**
 * 子服务架构定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServArchEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务架构定义编码
	 */
	private String id;

	/**
	 * 子服务架构定义代码
	 */
	private String code;

	/**
	 * 子服务架构定义名称
	 */
	private String name;

	private String type;

	/**
	 * 子服务定义名称
	 */
	private String definitionSubServName;

	/**
	 * 高可用指标
	 */
	private Integer highAvailability;

	/**
	 * 一致性指标
	 */
	private Integer consistency;

	/**
	 * 性能效率指标
	 */
	private Integer capability;

	/**
	 * 单元数量
	 */
	private Integer unitNum;

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
	 * 获取highAvailability
	 *
	 * @return highAvailability highAvailability
	 */
	public Integer getHighAvailability() {
		return highAvailability;
	}

	/**
	 * 设置highAvailability
	 * 
	 * @param highAvailability
	 *            highAvailability
	 */
	public void setHighAvailability(Integer highAvailability) {
		this.highAvailability = highAvailability;
	}

	/**
	 * 获取consistency
	 *
	 * @return consistency consistency
	 */
	public Integer getConsistency() {
		return consistency;
	}

	/**
	 * 设置consistency
	 * 
	 * @param consistency
	 *            consistency
	 */
	public void setConsistency(Integer consistency) {
		this.consistency = consistency;
	}

	/**
	 * 获取capability
	 *
	 * @return capability capability
	 */
	public Integer getCapability() {
		return capability;
	}

	/**
	 * 设置capability
	 * 
	 * @param capability
	 *            capability
	 */
	public void setCapability(Integer capability) {
		this.capability = capability;
	}

	/**
	 * 获取unitNum
	 *
	 * @return unitNum unitNum
	 */
	public Integer getUnitNum() {
		return unitNum;
	}

	/**
	 * 设置unitNum
	 * 
	 * @param unitNum
	 *            unitNum
	 */
	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionSubServArchEntity [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type
				+ ", definitionSubServName=" + definitionSubServName + ", highAvailability=" + highAvailability
				+ ", consistency=" + consistency + ", capability=" + capability + ", unitNum=" + unitNum + "]";
	}

}
