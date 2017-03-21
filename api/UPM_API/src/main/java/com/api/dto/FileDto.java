package com.api.dto;

/**
 * 文件信息数据传输对象
 * 
 * @author HCK
 *
 */
public class FileDto {

	/**
	 * 文件名
	 */
	private String name;

	/**
	 * 文件大小
	 */
	private String size;

	/**
	 * 获取文件名
	 *
	 * @return name 文件名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置文件名
	 * 
	 * @param name
	 *            文件名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取文件大小
	 *
	 * @return size 文件大小
	 */
	public String getSize() {
		return size;
	}

	/**
	 * 设置文件大小
	 * 
	 * @param size
	 *            文件大小
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileDto [name=" + name + ", size=" + size + "]";
	}

}
