package com.api.entity;

import java.io.Serializable;

/**
 * 主机实体类
 * 
 * @author HCK
 *
 */
public class HostEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主机编码
	 */
	private String id;

	/**
	 * 所属集群
	 */
	private ClusterEntity cluster;

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
	 * 关联san
	 */
	private SanEntity san;

	/**
	 * 网卡类型
	 */
	private String nicPhyType;

	/**
	 * 关联编码
	 */
	private String relateId;

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
	 * 获取cluster
	 *
	 * @return cluster cluster
	 */
	public ClusterEntity getCluster() {
		return cluster;
	}

	/**
	 * 设置cluster
	 * 
	 * @param cluster
	 *            cluster
	 */
	public void setCluster(ClusterEntity cluster) {
		this.cluster = cluster;
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
	 * 获取san
	 *
	 * @return san san
	 */
	public SanEntity getSan() {
		return san;
	}

	/**
	 * 设置san
	 * 
	 * @param san
	 *            san
	 */
	public void setSan(SanEntity san) {
		this.san = san;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HostEntity [id=" + id + ", cluster=" + cluster + ", name=" + name + ", sshIp=" + sshIp + ", sshUser="
				+ sshUser + ", sshPassword=" + sshPassword + ", room=" + room + ", seat=" + seat + ", maxContainer="
				+ maxContainer + ", hddDev=" + hddDev + ", ssdDev=" + ssdDev + ", san=" + san + ", nicPhyType="
				+ nicPhyType + ", relateId=" + relateId + "]";
	}

}
