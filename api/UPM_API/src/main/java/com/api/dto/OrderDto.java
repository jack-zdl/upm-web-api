package com.api.dto;

import java.io.Serializable;

/**
 * 工单数据传输对象
 * 
 * @author HCK
 *
 */
public class OrderDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 服务业务名称
	 */
	private String servBusinessName;

	/**
	 * 所属站点
	 */
	private String siteName;

	/**
	 * 数据目录容量
	 */
	private String dataDirSize;

	/**
	 * 软件
	 */
	private String softwareName;

	/**
	 * 架构
	 */
	private String archName;

	/**
	 * 规模
	 */
	private String scaleName;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 状态表示
	 */
	private String statusText;

	private String definitionServId;

	/**
	 * 获取servBusinessName
	 *
	 * @return servBusinessName servBusinessName
	 */
	public String getServBusinessName() {
		return servBusinessName;
	}

	/**
	 * 设置servBusinessName
	 *
	 * @param servBusinessName
	 *            servBusinessName
	 */
	public void setServBusinessName(String servBusinessName) {
		this.servBusinessName = servBusinessName;
	}

	/**
	 * 获取siteName
	 *
	 * @return siteName siteName
	 */
	public String getSiteName() {
		return siteName;
	}

	/**
	 * 设置siteName
	 *
	 * @param siteName
	 *            siteName
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	/**
	 * 获取dataDirSize
	 *
	 * @return dataDirSize dataDirSize
	 */
	public String getDataDirSize() {
		return dataDirSize;
	}

	/**
	 * 设置dataDirSize
	 *
	 * @param dataDirSize
	 *            dataDirSize
	 */
	public void setDataDirSize(String dataDirSize) {
		this.dataDirSize = dataDirSize;
	}

	/**
	 * 获取softwareName
	 *
	 * @return softwareName softwareName
	 */
	public String getSoftwareName() {
		return softwareName;
	}

	/**
	 * 设置softwareName
	 *
	 * @param softwareName
	 *            softwareName
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	/**
	 * 获取archName
	 *
	 * @return archName archName
	 */
	public String getArchName() {
		return archName;
	}

	/**
	 * 设置archName
	 *
	 * @param archName
	 *            archName
	 */
	public void setArchName(String archName) {
		this.archName = archName;
	}

	/**
	 * 获取scaleName
	 *
	 * @return scaleName scaleName
	 */
	public String getScaleName() {
		return scaleName;
	}

	/**
	 * 设置scaleName
	 *
	 * @param scaleName
	 *            scaleName
	 */
	public void setScaleName(String scaleName) {
		this.scaleName = scaleName;
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

	/**
	 * 获取definitionServId
	 *
	 * @return definitionServId definitionServId
	 */
	public String getDefinitionServId() {
		return definitionServId;
	}

	/**
	 * 设置definitionServId
	 *
	 * @param definitionServId
	 *            definitionServId
	 */
	public void setDefinitionServId(String definitionServId) {
		this.definitionServId = definitionServId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDto [servBusinessName=" + servBusinessName + ", siteName=" + siteName + ", dataDirSize="
				+ dataDirSize + ", softwareName=" + softwareName + ", archName=" + archName + ", scaleName=" + scaleName
				+ ", status=" + status + ", statusText=" + statusText + ", definitionServId=" + definitionServId + "]";
	}

}
