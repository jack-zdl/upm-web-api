package com.api.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 集群实体类
 * 
 * @author HCK
 *
 */
public class ClusterEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 集群编码
	 */
	private String id;

	/**
	 * 集群名称
	 */
	private String name;

	/**
	 * 是否可用
	 */
	private boolean enabled;

	/**
	 * 关联编码
	 */
	private String relateId;

	/**
	 * 所属区域
	 */
	private AreaEntity area;

	/**
	 * 备份存储
	 */
	private NfsBackupEntity nfsBackup;

	/**
	 * 包含软件
	 */
	private List<DefinitionSubServEntity> definitionSubServList;

	/**
	 * 获取集群编码
	 *
	 * @return id 集群编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置集群编码
	 * 
	 * @param id
	 *            集群编码
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * 获取集群是否可用
	 *
	 * @return enabled 集群是否可用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * 设置集群是否可用
	 * 
	 * @param enabled
	 *            集群是否可用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取关联编码
	 *
	 * @return relateId 关联编码
	 */
	public String getRelateId() {
		return relateId;
	}

	/**
	 * 设置关联编码
	 * 
	 * @param relateId
	 *            关联编码
	 */
	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	/**
	 * 获取所属区域
	 *
	 * @return area 所属区域
	 */
	public AreaEntity getArea() {
		return area;
	}

	/**
	 * 设置所属区域
	 * 
	 * @param area
	 *            所属区域
	 */
	public void setArea(AreaEntity area) {
		this.area = area;
	}

	/**
	 * 获取nfsBackup
	 *
	 * @return nfsBackup nfsBackup
	 */
	public NfsBackupEntity getNfsBackup() {
		return nfsBackup;
	}

	/**
	 * 设置nfsBackup
	 * 
	 * @param nfsBackup
	 *            nfsBackup
	 */
	public void setNfsBackup(NfsBackupEntity nfsBackup) {
		this.nfsBackup = nfsBackup;
	}

	/**
	 * 获取包含软件
	 *
	 * @return definitionSubServList 包含软件
	 */
	public List<DefinitionSubServEntity> getDefinitionSubServList() {
		return definitionSubServList;
	}

	/**
	 * 设置包含软件
	 * 
	 * @param definitionSubServList
	 *            包含软件
	 */
	public void setDefinitionSubServList(List<DefinitionSubServEntity> definitionSubServList) {
		this.definitionSubServList = definitionSubServList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClusterEntity [id=" + id + ", name=" + name + ", enabled=" + enabled + ", relateId=" + relateId
				+ ", area=" + area + ", nfsBackup=" + nfsBackup + ", definitionSubServList=" + definitionSubServList
				+ "]";
	}

}
