package com.api.entity;

import java.io.Serializable;

/**
 * 子服务定义实体类
 * 
 * @author HCK
 *
 */
public class DefinitionSubServEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子服务定义编码
	 */
	private String id;

	/**
	 * 子服务定义名称
	 */
	private String name;

	/**
	 * 子服务定义图标
	 */
	private String icon;

	/**
	 * 子服务定义类型
	 */
	private String type;

	/**
	 * 数据目录容量
	 */
	private Integer defaultDataDirSize;

	/**
	 * 数据目录设备类型
	 */
	private String defaultDataDirDeviceType;

	/**
	 * 日志目录容量
	 */
	private Integer defaultLogDirSize;

	/**
	 * 日志目录设备类型
	 */
	private String defaultLogDirDeviceType;

	/**
	 * 最大备份空间
	 */
	private Integer defaultMaxBackupSpace;

	/**
	 * 备份文件保留天数
	 */
	private Integer defaultBackupFilesRetention;

	private boolean userManager;

	private String defaultRootUserRoleId;
	private String defaultRootUsername;
	private String defaultRootPassword;

	private String defaultMonitorUserRoleId;
	private String defaultMonitorUsername;
	private String defaultMonitorPassword;

	private String defaultReplicationUserRoleId;
	private String defaultReplicationUsername;
	private String defaultReplicationPassword;

	/**
	 * 是否为主要子服务
	 */
	private boolean primary;

	/**
	 * 部署优先级
	 */
	private Integer priority;

	/**
	 * 默认子服务架构
	 */
	private DefinitionSubServArchEntity defaultDefinitionSubServArch;

	/**
	 * 默认子服务单元规模
	 */
	private DefinitionSubServUnitScaleEntity defaultDefinitionSubServUnitScale;

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
	 * 获取icon
	 *
	 * @return icon icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置icon
	 *
	 * @param icon
	 *            icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
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

	/**
	 * 获取defaultDataDirSize
	 *
	 * @return defaultDataDirSize defaultDataDirSize
	 */
	public Integer getDefaultDataDirSize() {
		return defaultDataDirSize;
	}

	/**
	 * 设置defaultDataDirSize
	 *
	 * @param defaultDataDirSize
	 *            defaultDataDirSize
	 */
	public void setDefaultDataDirSize(Integer defaultDataDirSize) {
		this.defaultDataDirSize = defaultDataDirSize;
	}

	/**
	 * 获取defaultDataDirDeviceType
	 *
	 * @return defaultDataDirDeviceType defaultDataDirDeviceType
	 */
	public String getDefaultDataDirDeviceType() {
		return defaultDataDirDeviceType;
	}

	/**
	 * 设置defaultDataDirDeviceType
	 *
	 * @param defaultDataDirDeviceType
	 *            defaultDataDirDeviceType
	 */
	public void setDefaultDataDirDeviceType(String defaultDataDirDeviceType) {
		this.defaultDataDirDeviceType = defaultDataDirDeviceType;
	}

	/**
	 * 获取defaultLogDirSize
	 *
	 * @return defaultLogDirSize defaultLogDirSize
	 */
	public Integer getDefaultLogDirSize() {
		return defaultLogDirSize;
	}

	/**
	 * 设置defaultLogDirSize
	 *
	 * @param defaultLogDirSize
	 *            defaultLogDirSize
	 */
	public void setDefaultLogDirSize(Integer defaultLogDirSize) {
		this.defaultLogDirSize = defaultLogDirSize;
	}

	/**
	 * 获取defaultLogDirDeviceType
	 *
	 * @return defaultLogDirDeviceType defaultLogDirDeviceType
	 */
	public String getDefaultLogDirDeviceType() {
		return defaultLogDirDeviceType;
	}

	/**
	 * 设置defaultLogDirDeviceType
	 *
	 * @param defaultLogDirDeviceType
	 *            defaultLogDirDeviceType
	 */
	public void setDefaultLogDirDeviceType(String defaultLogDirDeviceType) {
		this.defaultLogDirDeviceType = defaultLogDirDeviceType;
	}

	/**
	 * 获取defaultMaxBackupSpace
	 *
	 * @return defaultMaxBackupSpace defaultMaxBackupSpace
	 */
	public Integer getDefaultMaxBackupSpace() {
		return defaultMaxBackupSpace;
	}

	/**
	 * 设置defaultMaxBackupSpace
	 *
	 * @param defaultMaxBackupSpace
	 *            defaultMaxBackupSpace
	 */
	public void setDefaultMaxBackupSpace(Integer defaultMaxBackupSpace) {
		this.defaultMaxBackupSpace = defaultMaxBackupSpace;
	}

	/**
	 * 获取defaultBackupFilesRetention
	 *
	 * @return defaultBackupFilesRetention defaultBackupFilesRetention
	 */
	public Integer getDefaultBackupFilesRetention() {
		return defaultBackupFilesRetention;
	}

	/**
	 * 设置defaultBackupFilesRetention
	 *
	 * @param defaultBackupFilesRetention
	 *            defaultBackupFilesRetention
	 */
	public void setDefaultBackupFilesRetention(Integer defaultBackupFilesRetention) {
		this.defaultBackupFilesRetention = defaultBackupFilesRetention;
	}

	/**
	 * 获取userManager
	 *
	 * @return userManager userManager
	 */
	public boolean isUserManager() {
		return userManager;
	}

	/**
	 * 设置userManager
	 *
	 * @param userManager
	 *            userManager
	 */
	public void setUserManager(boolean userManager) {
		this.userManager = userManager;
	}

	/**
	 * 获取defaultRootUserRoleId
	 *
	 * @return defaultRootUserRoleId defaultRootUserRoleId
	 */
	public String getDefaultRootUserRoleId() {
		return defaultRootUserRoleId;
	}

	/**
	 * 设置defaultRootUserRoleId
	 *
	 * @param defaultRootUserRoleId
	 *            defaultRootUserRoleId
	 */
	public void setDefaultRootUserRoleId(String defaultRootUserRoleId) {
		this.defaultRootUserRoleId = defaultRootUserRoleId;
	}

	/**
	 * 获取defaultRootUsername
	 *
	 * @return defaultRootUsername defaultRootUsername
	 */
	public String getDefaultRootUsername() {
		return defaultRootUsername;
	}

	/**
	 * 设置defaultRootUsername
	 *
	 * @param defaultRootUsername
	 *            defaultRootUsername
	 */
	public void setDefaultRootUsername(String defaultRootUsername) {
		this.defaultRootUsername = defaultRootUsername;
	}

	/**
	 * 获取defaultRootPassword
	 *
	 * @return defaultRootPassword defaultRootPassword
	 */
	public String getDefaultRootPassword() {
		return defaultRootPassword;
	}

	/**
	 * 设置defaultRootPassword
	 *
	 * @param defaultRootPassword
	 *            defaultRootPassword
	 */
	public void setDefaultRootPassword(String defaultRootPassword) {
		this.defaultRootPassword = defaultRootPassword;
	}

	/**
	 * 获取defaultMonitorUserRoleId
	 *
	 * @return defaultMonitorUserRoleId defaultMonitorUserRoleId
	 */
	public String getDefaultMonitorUserRoleId() {
		return defaultMonitorUserRoleId;
	}

	/**
	 * 设置defaultMonitorUserRoleId
	 *
	 * @param defaultMonitorUserRoleId
	 *            defaultMonitorUserRoleId
	 */
	public void setDefaultMonitorUserRoleId(String defaultMonitorUserRoleId) {
		this.defaultMonitorUserRoleId = defaultMonitorUserRoleId;
	}

	/**
	 * 获取defaultMonitorUsername
	 *
	 * @return defaultMonitorUsername defaultMonitorUsername
	 */
	public String getDefaultMonitorUsername() {
		return defaultMonitorUsername;
	}

	/**
	 * 设置defaultMonitorUsername
	 *
	 * @param defaultMonitorUsername
	 *            defaultMonitorUsername
	 */
	public void setDefaultMonitorUsername(String defaultMonitorUsername) {
		this.defaultMonitorUsername = defaultMonitorUsername;
	}

	/**
	 * 获取defaultMonitorPassword
	 *
	 * @return defaultMonitorPassword defaultMonitorPassword
	 */
	public String getDefaultMonitorPassword() {
		return defaultMonitorPassword;
	}

	/**
	 * 设置defaultMonitorPassword
	 *
	 * @param defaultMonitorPassword
	 *            defaultMonitorPassword
	 */
	public void setDefaultMonitorPassword(String defaultMonitorPassword) {
		this.defaultMonitorPassword = defaultMonitorPassword;
	}

	/**
	 * 获取defaultReplicationUserRoleId
	 *
	 * @return defaultReplicationUserRoleId defaultReplicationUserRoleId
	 */
	public String getDefaultReplicationUserRoleId() {
		return defaultReplicationUserRoleId;
	}

	/**
	 * 设置defaultReplicationUserRoleId
	 *
	 * @param defaultReplicationUserRoleId
	 *            defaultReplicationUserRoleId
	 */
	public void setDefaultReplicationUserRoleId(String defaultReplicationUserRoleId) {
		this.defaultReplicationUserRoleId = defaultReplicationUserRoleId;
	}

	/**
	 * 获取defaultReplicationUsername
	 *
	 * @return defaultReplicationUsername defaultReplicationUsername
	 */
	public String getDefaultReplicationUsername() {
		return defaultReplicationUsername;
	}

	/**
	 * 设置defaultReplicationUsername
	 *
	 * @param defaultReplicationUsername
	 *            defaultReplicationUsername
	 */
	public void setDefaultReplicationUsername(String defaultReplicationUsername) {
		this.defaultReplicationUsername = defaultReplicationUsername;
	}

	/**
	 * 获取defaultReplicationPassword
	 *
	 * @return defaultReplicationPassword defaultReplicationPassword
	 */
	public String getDefaultReplicationPassword() {
		return defaultReplicationPassword;
	}

	/**
	 * 设置defaultReplicationPassword
	 *
	 * @param defaultReplicationPassword
	 *            defaultReplicationPassword
	 */
	public void setDefaultReplicationPassword(String defaultReplicationPassword) {
		this.defaultReplicationPassword = defaultReplicationPassword;
	}

	/**
	 * 获取primary
	 *
	 * @return primary primary
	 */
	public boolean isPrimary() {
		return primary;
	}

	/**
	 * 设置primary
	 *
	 * @param primary
	 *            primary
	 */
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	/**
	 * 获取priority
	 *
	 * @return priority priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * 设置priority
	 *
	 * @param priority
	 *            priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * 获取defaultDefinitionSubServArch
	 *
	 * @return defaultDefinitionSubServArch defaultDefinitionSubServArch
	 */
	public DefinitionSubServArchEntity getDefaultDefinitionSubServArch() {
		return defaultDefinitionSubServArch;
	}

	/**
	 * 设置defaultDefinitionSubServArch
	 *
	 * @param defaultDefinitionSubServArch
	 *            defaultDefinitionSubServArch
	 */
	public void setDefaultDefinitionSubServArch(DefinitionSubServArchEntity defaultDefinitionSubServArch) {
		this.defaultDefinitionSubServArch = defaultDefinitionSubServArch;
	}

	/**
	 * 获取defaultDefinitionSubServUnitScale
	 *
	 * @return defaultDefinitionSubServUnitScale
	 *         defaultDefinitionSubServUnitScale
	 */
	public DefinitionSubServUnitScaleEntity getDefaultDefinitionSubServUnitScale() {
		return defaultDefinitionSubServUnitScale;
	}

	/**
	 * 设置defaultDefinitionSubServUnitScale
	 *
	 * @param defaultDefinitionSubServUnitScale
	 *            defaultDefinitionSubServUnitScale
	 */
	public void setDefaultDefinitionSubServUnitScale(
			DefinitionSubServUnitScaleEntity defaultDefinitionSubServUnitScale) {
		this.defaultDefinitionSubServUnitScale = defaultDefinitionSubServUnitScale;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefinitionSubServEntity [id=" + id + ", name=" + name + ", icon=" + icon + ", type=" + type
				+ ", defaultDataDirSize=" + defaultDataDirSize + ", defaultDataDirDeviceType="
				+ defaultDataDirDeviceType + ", defaultLogDirSize=" + defaultLogDirSize + ", defaultLogDirDeviceType="
				+ defaultLogDirDeviceType + ", defaultMaxBackupSpace=" + defaultMaxBackupSpace
				+ ", defaultBackupFilesRetention=" + defaultBackupFilesRetention + ", userManager=" + userManager
				+ ", defaultRootUserRoleId=" + defaultRootUserRoleId + ", defaultRootUsername=" + defaultRootUsername
				+ ", defaultRootPassword=" + defaultRootPassword + ", defaultMonitorUserRoleId="
				+ defaultMonitorUserRoleId + ", defaultMonitorUsername=" + defaultMonitorUsername
				+ ", defaultMonitorPassword=" + defaultMonitorPassword + ", defaultReplicationUserRoleId="
				+ defaultReplicationUserRoleId + ", defaultReplicationUsername=" + defaultReplicationUsername
				+ ", defaultReplicationPassword=" + defaultReplicationPassword + ", primary=" + primary + ", priority="
				+ priority + ", defaultDefinitionSubServArch=" + defaultDefinitionSubServArch
				+ ", defaultDefinitionSubServUnitScale=" + defaultDefinitionSubServUnitScale + "]";
	}

}
