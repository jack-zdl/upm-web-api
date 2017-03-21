package com.api.dto;

import java.io.Serializable;

/**
 * 区域数据传输对象
 * 
 * @author HCK
 *
 */
public class AreaDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 区域名称
	 */
	private String name;

	/**
	 * 区域描述
	 */
	private String description;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

	/**
	 * 是否可用(文字显示)
	 */
	private String enabledText;

	/**
	 * 获取区域名称
	 *
	 * @return name 区域名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置区域名称
	 * 
	 * @param name
	 *            区域名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取区域描述
	 *
	 * @return description 区域描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 设置区域描述
	 * 
	 * @param description
	 *            区域描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取enabled
	 *
	 * @return enabled enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * 设置enabled
	 *
	 * @param enabled
	 *            enabled
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取enabledText
	 *
	 * @return enabledText enabledText
	 */
	public String getEnabledText() {
		return enabledText;
	}

	/**
	 * 设置enabledText
	 *
	 * @param enabledText
	 *            enabledText
	 */
	public void setEnabledText(String enabledText) {
		this.enabledText = enabledText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AreaDto [name=" + name + ", description=" + description + ", enabled=" + enabled + ", enabledText="
				+ enabledText + "]";
	}

}
