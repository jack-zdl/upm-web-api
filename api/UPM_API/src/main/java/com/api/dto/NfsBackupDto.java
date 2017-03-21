package com.api.dto;

import java.io.Serializable;

/**
 * 备份存储数据传输对象
 * 
 * @author HCK
 *
 */
public class NfsBackupDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * 总容量
	 */
	private String totalSpace;

	/**
	 * 空闲容量
	 */
	private String freeSpace;

	/**
	 * 是否可用
	 */
	private Boolean enabled;

	/**
	 * 是否可用(文字显示)
	 */
	private String enabledText;

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
	 * 获取总容量
	 *
	 * @return totalSpace 总容量
	 */
	public String getTotalSpace() {
		return totalSpace;
	}

	/**
	 * 设置总容量
	 * 
	 * @param totalSpace
	 *            总容量
	 */
	public void setTotalSpace(String totalSpace) {
		this.totalSpace = totalSpace;
	}

	/**
	 * 获取空闲容量
	 *
	 * @return freeSpace 空闲容量
	 */
	public String getFreeSpace() {
		return freeSpace;
	}

	/**
	 * 设置空闲容量
	 * 
	 * @param freeSpace
	 *            空闲容量
	 */
	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
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
		return "NfsBackupDto [name=" + name + ", nfsIp=" + nfsIp + ", nfsDir=" + nfsDir + ", nfsMountDir=" + nfsMountDir
				+ ", nfsMountOpts=" + nfsMountOpts + ", totalSpace=" + totalSpace + ", freeSpace=" + freeSpace
				+ ", enabled=" + enabled + ", enabledText=" + enabledText + "]";
	}

}
