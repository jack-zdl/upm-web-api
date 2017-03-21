package com.api.dto;

import java.io.Serializable;

/**
 * SELECT数据传输对象
 * 
 * @author HCK
 *
 */
public class SelectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 编码
	 */
	private String id;

	/**
	 * 显示内容
	 */
	private String text;

	/**
	 * 显示图标
	 */
	private String icon;

	/**
	 * 获取编码
	 *
	 * @return id 编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置编码
	 * 
	 * @param id
	 *            编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取显示内容
	 *
	 * @return text 显示内容
	 */
	public String getText() {
		return text;
	}

	/**
	 * 设置显示内容
	 * 
	 * @param text
	 *            显示内容
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * 获取显示图标
	 *
	 * @return icon 显示图标
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置显示图标
	 * 
	 * @param icon
	 *            显示图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SelectDto [id=" + id + ", text=" + text + ", icon=" + icon + "]";
	}

}
