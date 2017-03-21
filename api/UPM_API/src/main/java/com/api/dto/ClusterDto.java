package com.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 集群数据传输对象
 * 
 * @author HCK
 *
 */
public class ClusterDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 集群名称
	 */
	private String name;

	/**
	 * 包含软件
	 */
	private List<DefinitionSubServDto> definitionSubServList;

	/**
	 * 最大使用率
	 */
	private String maxUsage;

	/**
	 * 最大主机数量
	 */
	private String maxHostCount;

	/**
	 * 所属区域编码
	 */
	private String areaId;

	/**
	 * 所属区域名称
	 */
	private String areaName;

	/**
	 * 备份存储编码
	 */
	private String nfsBackupId;

	/**
	 * 备份存储名称
	 */
	private String nfSBackupName;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

	/**
	 * 是否可用(文字显示)
	 */
	private String enabledText;

	/**
	 * 获取集群名称
	 *
	 * @return name 集群名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置集群名称
	 * 
	 * @param name
	 *            集群名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取包含软件
	 *
	 * @return definitionSubServList 包含软件
	 */
	public List<DefinitionSubServDto> getDefinitionSubServList() {
		return definitionSubServList;
	}

	/**
	 * 设置包含软件
	 * 
	 * @param definitionSubServList
	 *            包含软件
	 */
	public void setDefinitionSubServList(List<DefinitionSubServDto> definitionSubServList) {
		this.definitionSubServList = definitionSubServList;
	}

	/**
	 * 获取最大使用率
	 *
	 * @return maxUsage 最大使用率
	 */
	public String getMaxUsage() {
		return maxUsage;
	}

	/**
	 * 设置最大使用率
	 * 
	 * @param maxUsage
	 *            最大使用率
	 */
	public void setMaxUsage(String maxUsage) {
		this.maxUsage = maxUsage;
	}

	/**
	 * 获取最大主机数量
	 *
	 * @return maxHostCount 最大主机数量
	 */
	public String getMaxHostCount() {
		return maxHostCount;
	}

	/**
	 * 设置最大主机数量
	 * 
	 * @param maxHostCount
	 *            最大主机数量
	 */
	public void setMaxHostCount(String maxHostCount) {
		this.maxHostCount = maxHostCount;
	}

	/**
	 * 获取所属区域编码
	 *
	 * @return areaId 所属区域编码
	 */
	public String getAreaId() {
		return areaId;
	}

	/**
	 * 设置所属区域编码
	 * 
	 * @param areaId
	 *            所属区域编码
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	/**
	 * 获取所属区域名称
	 *
	 * @return areaName 所属区域名称
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * 设置所属区域名称
	 * 
	 * @param areaName
	 *            所属区域名称
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * 获取nfsBackupId
	 *
	 * @return nfsBackupId nfsBackupId
	 */
	public String getNfsBackupId() {
		return nfsBackupId;
	}

	/**
	 * 设置nfsBackupId
	 * 
	 * @param nfsBackupId
	 *            nfsBackupId
	 */
	public void setNfsBackupId(String nfsBackupId) {
		this.nfsBackupId = nfsBackupId;
	}

	/**
	 * 获取nfSBackupName
	 *
	 * @return nfSBackupName nfSBackupName
	 */
	public String getNfSBackupName() {
		return nfSBackupName;
	}

	/**
	 * 设置nfSBackupName
	 * 
	 * @param nfSBackupName
	 *            nfSBackupName
	 */
	public void setNfSBackupName(String nfSBackupName) {
		this.nfSBackupName = nfSBackupName;
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
		return "ClusterDto [name=" + name + ", definitionSubServList=" + definitionSubServList + ", maxUsage="
				+ maxUsage + ", maxHostCount=" + maxHostCount + ", areaId=" + areaId + ", areaName=" + areaName
				+ ", nfsBackupId=" + nfsBackupId + ", nfSBackupName=" + nfSBackupName + ", enabled=" + enabled
				+ ", enabledText=" + enabledText + "]";
	}

}
