package com.api.entity;

import java.io.Serializable;

/**
 * 集群子服务软件关联实体类
 * 
 * @author HCK
 *
 */
public class ClusterSubServEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 集群
	 */
	private ClusterEntity cluster;

	/**
	 * 子服务软件
	 */
	private DefinitionSubServEntity definitionSubServ;

	/**
	 * 获取集群
	 *
	 * @return cluster 集群
	 */
	public ClusterEntity getCluster() {
		return cluster;
	}

	/**
	 * 设置集群
	 * 
	 * @param cluster
	 *            集群
	 */
	public void setCluster(ClusterEntity cluster) {
		this.cluster = cluster;
	}

	/**
	 * 获取子服务软件
	 *
	 * @return definitionSubServ 子服务软件
	 */
	public DefinitionSubServEntity getDefinitionSubServ() {
		return definitionSubServ;
	}

	/**
	 * 设置子服务软件
	 * 
	 * @param definitionSubServ
	 *            子服务软件
	 */
	public void setDefinitionSubServ(DefinitionSubServEntity definitionSubServ) {
		this.definitionSubServ = definitionSubServ;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClusterSubServEntity [cluster=" + cluster + ", definitionSubServ=" + definitionSubServ + "]";
	}

}
