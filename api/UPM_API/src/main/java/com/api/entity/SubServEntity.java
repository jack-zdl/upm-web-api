package com.api.entity;

import java.io.Serializable;

/**
 * 子服务实体类
 * 
 * @author HCK
 *
 */
public class SubServEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 子订单编码
	 */
	private String id;

	/**
	 * 关联编码
	 */
	private String relateId;

	/**
	 * 所属服务
	 */
	private ServEntity serv;

	/**
	 * 所属子服务定义
	 */
	private DefinitionSubServEntity definitionSubServ;

	/**
	 * 所用子服务软件镜像
	 */
	private SubServSoftwareImageEntity subServSoftwareImage;

	/**
	 * 所用子服务架构
	 */
	private DefinitionSubServArchEntity definitionSubServArch;

	/**
	 * 所用子服务单元规模
	 */
	private DefinitionSubServUnitScaleEntity definitionSubServUnitScale;

	/**
	 * 数据目录容量
	 */
	private Integer dataDirSize;

	/**
	 * 数据目录设备类型
	 */
	private String dataDirDeviceType;

	/**
	 * 日志目录容量
	 */
	private Integer logDirSize;

	/**
	 * 日志目录设备类型
	 */
	private String logDirDeviceType;

	/**
	 * 最大备份空间
	 */
	private Integer maxBackupSpace;

	/**
	 * 备份文件保留天数
	 */
	private Integer backupFilesRetention;

	/**
	 * 所属子订单
	 */
	private SubOrderEntity subOrder;

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
	 * 获取relateId
	 *
	 * @return relateId relateId
	 */
	public String getRelateId() {
		return relateId;
	}

	/**
	 * 设置relateId
	 *
	 * @param relateId
	 *            relateId
	 */
	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	/**
	 * 获取serv
	 *
	 * @return serv serv
	 */
	public ServEntity getServ() {
		return serv;
	}

	/**
	 * 设置serv
	 *
	 * @param serv
	 *            serv
	 */
	public void setServ(ServEntity serv) {
		this.serv = serv;
	}

	/**
	 * 获取definitionSubServ
	 *
	 * @return definitionSubServ definitionSubServ
	 */
	public DefinitionSubServEntity getDefinitionSubServ() {
		return definitionSubServ;
	}

	/**
	 * 设置definitionSubServ
	 *
	 * @param definitionSubServ
	 *            definitionSubServ
	 */
	public void setDefinitionSubServ(DefinitionSubServEntity definitionSubServ) {
		this.definitionSubServ = definitionSubServ;
	}

	/**
	 * 获取subServSoftwareImage
	 *
	 * @return subServSoftwareImage subServSoftwareImage
	 */
	public SubServSoftwareImageEntity getSubServSoftwareImage() {
		return subServSoftwareImage;
	}

	/**
	 * 设置subServSoftwareImage
	 *
	 * @param subServSoftwareImage
	 *            subServSoftwareImage
	 */
	public void setSubServSoftwareImage(SubServSoftwareImageEntity subServSoftwareImage) {
		this.subServSoftwareImage = subServSoftwareImage;
	}

	/**
	 * 获取definitionSubServArch
	 *
	 * @return definitionSubServArch definitionSubServArch
	 */
	public DefinitionSubServArchEntity getDefinitionSubServArch() {
		return definitionSubServArch;
	}

	/**
	 * 设置definitionSubServArch
	 *
	 * @param definitionSubServArch
	 *            definitionSubServArch
	 */
	public void setDefinitionSubServArch(DefinitionSubServArchEntity definitionSubServArch) {
		this.definitionSubServArch = definitionSubServArch;
	}

	/**
	 * 获取definitionSubServUnitScale
	 *
	 * @return definitionSubServUnitScale definitionSubServUnitScale
	 */
	public DefinitionSubServUnitScaleEntity getDefinitionSubServUnitScale() {
		return definitionSubServUnitScale;
	}

	/**
	 * 设置definitionSubServUnitScale
	 *
	 * @param definitionSubServUnitScale
	 *            definitionSubServUnitScale
	 */
	public void setDefinitionSubServUnitScale(DefinitionSubServUnitScaleEntity definitionSubServUnitScale) {
		this.definitionSubServUnitScale = definitionSubServUnitScale;
	}

	/**
	 * 获取dataDirSize
	 *
	 * @return dataDirSize dataDirSize
	 */
	public Integer getDataDirSize() {
		return dataDirSize;
	}

	/**
	 * 设置dataDirSize
	 *
	 * @param dataDirSize
	 *            dataDirSize
	 */
	public void setDataDirSize(Integer dataDirSize) {
		this.dataDirSize = dataDirSize;
	}

	/**
	 * 获取dataDirDeviceType
	 *
	 * @return dataDirDeviceType dataDirDeviceType
	 */
	public String getDataDirDeviceType() {
		return dataDirDeviceType;
	}

	/**
	 * 设置dataDirDeviceType
	 *
	 * @param dataDirDeviceType
	 *            dataDirDeviceType
	 */
	public void setDataDirDeviceType(String dataDirDeviceType) {
		this.dataDirDeviceType = dataDirDeviceType;
	}

	/**
	 * 获取logDirSize
	 *
	 * @return logDirSize logDirSize
	 */
	public Integer getLogDirSize() {
		return logDirSize;
	}

	/**
	 * 设置logDirSize
	 *
	 * @param logDirSize
	 *            logDirSize
	 */
	public void setLogDirSize(Integer logDirSize) {
		this.logDirSize = logDirSize;
	}

	/**
	 * 获取logDirDeviceType
	 *
	 * @return logDirDeviceType logDirDeviceType
	 */
	public String getLogDirDeviceType() {
		return logDirDeviceType;
	}

	/**
	 * 设置logDirDeviceType
	 *
	 * @param logDirDeviceType
	 *            logDirDeviceType
	 */
	public void setLogDirDeviceType(String logDirDeviceType) {
		this.logDirDeviceType = logDirDeviceType;
	}

	/**
	 * 获取maxBackupSpace
	 *
	 * @return maxBackupSpace maxBackupSpace
	 */
	public Integer getMaxBackupSpace() {
		return maxBackupSpace;
	}

	/**
	 * 设置maxBackupSpace
	 *
	 * @param maxBackupSpace
	 *            maxBackupSpace
	 */
	public void setMaxBackupSpace(Integer maxBackupSpace) {
		this.maxBackupSpace = maxBackupSpace;
	}

	/**
	 * 获取backupFilesRetention
	 *
	 * @return backupFilesRetention backupFilesRetention
	 */
	public Integer getBackupFilesRetention() {
		return backupFilesRetention;
	}

	/**
	 * 设置backupFilesRetention
	 *
	 * @param backupFilesRetention
	 *            backupFilesRetention
	 */
	public void setBackupFilesRetention(Integer backupFilesRetention) {
		this.backupFilesRetention = backupFilesRetention;
	}

	/**
	 * 获取subOrder
	 *
	 * @return subOrder subOrder
	 */
	public SubOrderEntity getSubOrder() {
		return subOrder;
	}

	/**
	 * 设置subOrder
	 *
	 * @param subOrder
	 *            subOrder
	 */
	public void setSubOrder(SubOrderEntity subOrder) {
		this.subOrder = subOrder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SubServEntity [id=" + id + ", relateId=" + relateId + ", serv=" + serv + ", definitionSubServ="
				+ definitionSubServ + ", subServSoftwareImage=" + subServSoftwareImage + ", definitionSubServArch="
				+ definitionSubServArch + ", definitionSubServUnitScale=" + definitionSubServUnitScale
				+ ", dataDirSize=" + dataDirSize + ", dataDirDeviceType=" + dataDirDeviceType + ", logDirSize="
				+ logDirSize + ", logDirDeviceType=" + logDirDeviceType + ", maxBackupSpace=" + maxBackupSpace
				+ ", backupFilesRetention=" + backupFilesRetention + ", subOrder=" + subOrder + "]";
	}

}
