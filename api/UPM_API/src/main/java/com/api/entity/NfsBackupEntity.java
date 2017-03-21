package com.api.entity;

import java.io.Serializable;

/**
 * 备份存储实体类
 * 
 * @author HCK
 *
 */
public class NfsBackupEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备份存储编码
	 */
	private String id;

	/**
	 * 备份存储名称
	 */
	private String name;

	/**
	 * nfs地址
	 */
	private String nfsIp;

	/**
	 * nfs源目录
	 */
	private String nfsDir;

	/**
	 * nfs挂载目录
	 */
	private String nfsMountDir;

	/**
	 * nfs挂载参数
	 */
	private String nfsMountOpts;

	/**
	 * 是否可用
	 */
	private boolean enabled;

	/**
	 * 所属站点
	 */
	private SiteEntity site;

	/**
	 * 获取备份存储编码
	 *
	 * @return id 备份存储编码
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置备份存储编码
	 * 
	 * @param id
	 *            备份存储编码
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取备份存储名称
	 *
	 * @return name 备份存储名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置备份存储名称
	 * 
	 * @param name
	 *            备份存储名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取nfs地址
	 *
	 * @return nfsIp nfs地址
	 */
	public String getNfsIp() {
		return nfsIp;
	}

	/**
	 * 设置nfs地址
	 * 
	 * @param nfsIp
	 *            nfs地址
	 */
	public void setNfsIp(String nfsIp) {
		this.nfsIp = nfsIp;
	}

	/**
	 * 获取nfs源目录
	 *
	 * @return nfsDir nfs源目录
	 */
	public String getNfsDir() {
		return nfsDir;
	}

	/**
	 * 设置nfs源目录
	 * 
	 * @param nfsDir
	 *            nfs源目录
	 */
	public void setNfsDir(String nfsDir) {
		this.nfsDir = nfsDir;
	}

	/**
	 * 获取nfs挂载目录
	 *
	 * @return nfsMountDir nfs挂载目录
	 */
	public String getNfsMountDir() {
		return nfsMountDir;
	}

	/**
	 * 设置nfs挂载目录
	 * 
	 * @param nfsMountDir
	 *            nfs挂载目录
	 */
	public void setNfsMountDir(String nfsMountDir) {
		this.nfsMountDir = nfsMountDir;
	}

	/**
	 * 获取nfs挂载参数
	 *
	 * @return nfsMountOpts nfs挂载参数
	 */
	public String getNfsMountOpts() {
		return nfsMountOpts;
	}

	/**
	 * 设置nfs挂载参数
	 * 
	 * @param nfsMountOpts
	 *            nfs挂载参数
	 */
	public void setNfsMountOpts(String nfsMountOpts) {
		this.nfsMountOpts = nfsMountOpts;
	}

	/**
	 * 获取备份存储是否可用
	 *
	 * @return enabled 备份存储是否可用
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * 设置备份存储是否可用
	 * 
	 * @param enabled
	 *            备份存储是否可用
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 获取所属站点
	 *
	 * @return site 所属站点对象
	 */
	public SiteEntity getSite() {
		return site;
	}

	/**
	 * 设置所属站点
	 * 
	 * @param site
	 *            所属站点对象
	 */
	public void setSite(SiteEntity site) {
		this.site = site;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NfsBackupEntity [id=" + id + ", name=" + name + ", nfsIp=" + nfsIp + ", nfsDir=" + nfsDir
				+ ", nfsMountDir=" + nfsMountDir + ", nfsMountOpts=" + nfsMountOpts + ", enabled=" + enabled + ", site="
				+ site + "]";
	}

}
