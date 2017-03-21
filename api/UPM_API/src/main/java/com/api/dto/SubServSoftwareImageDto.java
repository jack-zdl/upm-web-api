package com.api.dto;

import java.io.Serializable;

/**
 * 子服务软件镜像数据传输对象
 * 
 * @author HCK
 *
 */
public class SubServSoftwareImageDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务定义名称
	 */
	private String name;

	/**
	 * 子服务定义图标
	 */
	private String icon;

	/**
	 * 主版本号
	 */
	private String majorVersion;

	/**
	 * 次版本号
	 */
	private String minorVersion;

	/**
	 * 修订版本号
	 */
	private String patchVersion;

	/**
	 * 版本
	 */
	private String version;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

	/**
	 * 是否可用(文字显示)
	 */
	private String enabledText;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 状态(文字显示)
	 */
	private String statusText;

	/**
	 * 获取子服务定义名称
	 *
	 * @return name 子服务定义名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置子服务定义名称
	 * 
	 * @param name
	 *            子服务定义名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取子服务定义图标
	 *
	 * @return icon 子服务定义图标
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置子服务定义图标
	 * 
	 * @param icon
	 *            子服务定义图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 获取主版本号
	 *
	 * @return majorVersion 主版本号
	 */
	public String getMajorVersion() {
		return majorVersion;
	}

	/**
	 * 设置主版本号
	 * 
	 * @param majorVersion
	 *            主版本号
	 */
	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * 获取次版本号
	 *
	 * @return minorVersion 次版本号
	 */
	public String getMinorVersion() {
		return minorVersion;
	}

	/**
	 * 设置次版本号
	 * 
	 * @param minorVersion
	 *            次版本号
	 */
	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	/**
	 * 获取修订版本号
	 *
	 * @return patchVersion 修订版本号
	 */
	public String getPatchVersion() {
		return patchVersion;
	}

	/**
	 * 设置修订版本号
	 * 
	 * @param patchVersion
	 *            修订版本号
	 */
	public void setPatchVersion(String patchVersion) {
		this.patchVersion = patchVersion;
	}

	/**
	 * 获取version
	 *
	 * @return version version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 设置version
	 *
	 * @param version
	 *            version
	 */
	public void setVersion(String version) {
		this.version = version;
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

	/**
	 * 获取status
	 *
	 * @return status status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置status
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取statusText
	 *
	 * @return statusText statusText
	 */
	public String getStatusText() {
		return statusText;
	}

	/**
	 * 设置statusText
	 * 
	 * @param statusText
	 *            statusText
	 */
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubServSoftwareImageDto [name=" + name + ", icon=" + icon + ", majorVersion=" + majorVersion
				+ ", minorVersion=" + minorVersion + ", patchVersion=" + patchVersion + ", version=" + version
				+ ", enabled=" + enabled + ", enabledText=" + enabledText + ", status=" + status + ", statusText="
				+ statusText + "]";
	}

}
