package com.api.dto;

import java.io.Serializable;

/**
 * 主机数据传输对象
 * 
 * @author HCK
 *
 */
public class HostDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主机编码
	 */
	private String id;

	/**
	 * 区域编码
	 */
	private String areaId;

	/**
	 * 区域名称
	 */
	private String areaName;

	/**
	 * 集群编码
	 */
	private String clusterId;

	/**
	 * 集群名称
	 */
	private String clusterName;

	/**
	 * 主机名称
	 */
	private String name;

	/**
	 * ssh登陆IP
	 */
	private String sshIp;

	/**
	 * ssh登陆用户
	 */
	private String sshUser;

	/**
	 * ssh登录密码
	 */
	private String sshPassword;

	/**
	 * 机房名称
	 */
	private String room;

	/**
	 * 机位名称
	 */
	private String seat;

	/**
	 * 容器上限
	 */
	private Integer maxContainer;

	/**
	 * 本地hdd设备
	 */
	private String hddDev;

	/**
	 * 本地ssd设备
	 */
	private String ssdDev;

	/**
	 * san编码
	 */
	private String sanId;

	/**
	 * san名称
	 */
	private String sanName;

	/**
	 * 网卡类型
	 */
	private String nicPhyType;

	/**
	 * 网卡类型显示
	 */
	private String nicPhyTypeText;

	/**
	 * 关联编码
	 */
	private String relateId;

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
	 * 状态显示
	 */
	private String statusText;

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
	 * 获取areaId
	 *
	 * @return areaId areaId
	 */
	public String getAreaId() {
		return areaId;
	}

	/**
	 * 设置areaId
	 * 
	 * @param areaId
	 *            areaId
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	/**
	 * 获取areaName
	 *
	 * @return areaName areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * 设置areaName
	 * 
	 * @param areaName
	 *            areaName
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * 获取clusterId
	 *
	 * @return clusterId clusterId
	 */
	public String getClusterId() {
		return clusterId;
	}

	/**
	 * 设置clusterId
	 * 
	 * @param clusterId
	 *            clusterId
	 */
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	/**
	 * 获取clusterName
	 *
	 * @return clusterName clusterName
	 */
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * 设置clusterName
	 * 
	 * @param clusterName
	 *            clusterName
	 */
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
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
	 * 获取sshIp
	 *
	 * @return sshIp sshIp
	 */
	public String getSshIp() {
		return sshIp;
	}

	/**
	 * 设置sshIp
	 * 
	 * @param sshIp
	 *            sshIp
	 */
	public void setSshIp(String sshIp) {
		this.sshIp = sshIp;
	}

	/**
	 * 获取sshUser
	 *
	 * @return sshUser sshUser
	 */
	public String getSshUser() {
		return sshUser;
	}

	/**
	 * 设置sshUser
	 * 
	 * @param sshUser
	 *            sshUser
	 */
	public void setSshUser(String sshUser) {
		this.sshUser = sshUser;
	}

	/**
	 * 获取sshPassword
	 *
	 * @return sshPassword sshPassword
	 */
	public String getSshPassword() {
		return sshPassword;
	}

	/**
	 * 设置sshPassword
	 * 
	 * @param sshPassword
	 *            sshPassword
	 */
	public void setSshPassword(String sshPassword) {
		this.sshPassword = sshPassword;
	}

	/**
	 * 获取room
	 *
	 * @return room room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * 设置room
	 * 
	 * @param room
	 *            room
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * 获取seat
	 *
	 * @return seat seat
	 */
	public String getSeat() {
		return seat;
	}

	/**
	 * 设置seat
	 * 
	 * @param seat
	 *            seat
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}

	/**
	 * 获取maxContainer
	 *
	 * @return maxContainer maxContainer
	 */
	public Integer getMaxContainer() {
		return maxContainer;
	}

	/**
	 * 设置maxContainer
	 * 
	 * @param maxContainer
	 *            maxContainer
	 */
	public void setMaxContainer(Integer maxContainer) {
		this.maxContainer = maxContainer;
	}

	/**
	 * 获取hddDev
	 *
	 * @return hddDev hddDev
	 */
	public String getHddDev() {
		return hddDev;
	}

	/**
	 * 设置hddDev
	 * 
	 * @param hddDev
	 *            hddDev
	 */
	public void setHddDev(String hddDev) {
		this.hddDev = hddDev;
	}

	/**
	 * 获取ssdDev
	 *
	 * @return ssdDev ssdDev
	 */
	public String getSsdDev() {
		return ssdDev;
	}

	/**
	 * 设置ssdDev
	 * 
	 * @param ssdDev
	 *            ssdDev
	 */
	public void setSsdDev(String ssdDev) {
		this.ssdDev = ssdDev;
	}

	/**
	 * 获取sanId
	 *
	 * @return sanId sanId
	 */
	public String getSanId() {
		return sanId;
	}

	/**
	 * 设置sanId
	 * 
	 * @param sanId
	 *            sanId
	 */
	public void setSanId(String sanId) {
		this.sanId = sanId;
	}

	/**
	 * 获取sanName
	 *
	 * @return sanName sanName
	 */
	public String getSanName() {
		return sanName;
	}

	/**
	 * 设置sanName
	 * 
	 * @param sanName
	 *            sanName
	 */
	public void setSanName(String sanName) {
		this.sanName = sanName;
	}

	/**
	 * 获取nicPhyType
	 *
	 * @return nicPhyType nicPhyType
	 */
	public String getNicPhyType() {
		return nicPhyType;
	}

	/**
	 * 设置nicPhyType
	 * 
	 * @param nicPhyType
	 *            nicPhyType
	 */
	public void setNicPhyType(String nicPhyType) {
		this.nicPhyType = nicPhyType;
	}

	/**
	 * 获取nicPhyTypeText
	 *
	 * @return nicPhyTypeText nicPhyTypeText
	 */
	public String getNicPhyTypeText() {
		return nicPhyTypeText;
	}

	/**
	 * 设置nicPhyTypeText
	 * 
	 * @param nicPhyTypeText
	 *            nicPhyTypeText
	 */
	public void setNicPhyTypeText(String nicPhyTypeText) {
		this.nicPhyTypeText = nicPhyTypeText;
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
		return "HostDto [id=" + id + ", areaId=" + areaId + ", areaName=" + areaName + ", clusterId=" + clusterId
				+ ", clusterName=" + clusterName + ", name=" + name + ", sshIp=" + sshIp + ", sshUser=" + sshUser
				+ ", sshPassword=" + sshPassword + ", room=" + room + ", seat=" + seat + ", maxContainer="
				+ maxContainer + ", hddDev=" + hddDev + ", ssdDev=" + ssdDev + ", sanId=" + sanId + ", sanName="
				+ sanName + ", nicPhyType=" + nicPhyType + ", nicPhyTypeText=" + nicPhyTypeText + ", relateId="
				+ relateId + ", enabled=" + enabled + ", enabledText=" + enabledText + ", status=" + status
				+ ", statusText=" + statusText + "]";
	}

}
