-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 192.168.4.130    Database: api-server
-- ------------------------------------------------------
-- Server version	5.7.17-enterprise-commercial-advanced-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED='86a3efc6-c37b-11e6-a036-005056b651fb:1-8131';

--
-- Table structure for table `tbl_area`
--

DROP TABLE IF EXISTS `tbl_area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_area` (
  `id` varchar(32) NOT NULL COMMENT '主键ID',
  `site_id` varchar(32) NOT NULL COMMENT '所属站点ID',
  `name` varchar(16) NOT NULL COMMENT '区域名称',
  `description` varchar(128) DEFAULT NULL COMMENT '区域描述',
  `enabled` bit(1) NOT NULL COMMENT '区域状态\n0	fasle\n1	true',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区域表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_auth_menu`
--

DROP TABLE IF EXISTS `tbl_auth_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_auth_menu` (
  `role_code` varchar(32) NOT NULL COMMENT '角色代码，引用角色表主键code',
  `menu_code` varchar(32) NOT NULL COMMENT '菜单代码，引用菜单表主键code',
  PRIMARY KEY (`role_code`,`menu_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='授权菜单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_auth_menu_resource`
--

DROP TABLE IF EXISTS `tbl_auth_menu_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_auth_menu_resource` (
  `role_code` varchar(32) NOT NULL COMMENT '角色代码，引用角色表主键code\n',
  `menu_resource_id` varchar(32) NOT NULL COMMENT '菜单资源ID',
  PRIMARY KEY (`role_code`,`menu_resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='授权菜单资源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_cluster`
--

DROP TABLE IF EXISTS `tbl_cluster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cluster` (
  `id` varchar(32) NOT NULL COMMENT ' 主键，集群ID',
  `area_id` varchar(32) NOT NULL COMMENT '所属区域ID',
  `name` varchar(16) NOT NULL COMMENT '集群名称',
  `relate_id` varchar(64) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否可用\n0	fasle\n1	true',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `relate_id_UNIQUE` (`relate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='集群表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_cluster_subserv`
--

DROP TABLE IF EXISTS `tbl_cluster_subserv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cluster_subserv` (
  `cluster_id` varchar(32) NOT NULL COMMENT '集群ID',
  `definition_subserv_id` varchar(32) NOT NULL COMMENT '子服务软件定义ID',
  PRIMARY KEY (`cluster_id`,`definition_subserv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='集群子服务软件关联表，存储集群可容纳子服务软件,是集群属性扩展表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition`
--

DROP TABLE IF EXISTS `tbl_definition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition` (
  `name` varchar(64) NOT NULL COMMENT '类型',
  `code` varchar(64) NOT NULL COMMENT '编码',
  PRIMARY KEY (`name`,`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_mysql_user_role`
--

DROP TABLE IF EXISTS `tbl_definition_mysql_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_mysql_user_role` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `name` varchar(16) NOT NULL COMMENT '角色名称',
  `privilege_alter` bit(1) NOT NULL,
  `privilege_alter_routine` bit(1) NOT NULL,
  `privilege_create` bit(1) NOT NULL,
  `privilege_create_routine` bit(1) NOT NULL,
  `privilege_create_tablespace` bit(1) NOT NULL,
  `privilege_create_temporary_table` bit(1) NOT NULL,
  `privilege_create_user` bit(1) NOT NULL,
  `privilege_create_view` bit(1) NOT NULL,
  `privilege_delete` bit(1) NOT NULL,
  `privilege_drop` bit(1) NOT NULL,
  `privilege_event` bit(1) NOT NULL,
  `privilege_execute` bit(1) NOT NULL,
  `privilege_file` bit(1) NOT NULL,
  `privilege_grant_option` bit(1) NOT NULL,
  `privilege_index` bit(1) NOT NULL,
  `privilege_insert` bit(1) NOT NULL,
  `privilege_lock_tables` bit(1) NOT NULL,
  `privilege_process` bit(1) NOT NULL,
  `privilege_peferences` bit(1) NOT NULL,
  `privilege_reload` bit(1) NOT NULL,
  `privilege_replication_client` bit(1) NOT NULL,
  `privilege_replication_slave` bit(1) NOT NULL,
  `privilege_select` bit(1) NOT NULL,
  `privilege_show_databases` bit(1) NOT NULL,
  `privilege_show_view` bit(1) NOT NULL,
  `privilege_shutdown` bit(1) NOT NULL,
  `privilege_super` bit(1) NOT NULL,
  `privilege_trigger` bit(1) NOT NULL,
  `privilege_update` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='mysql用户角色定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_serv`
--

DROP TABLE IF EXISTS `tbl_definition_serv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_serv` (
  `id` varchar(32) NOT NULL COMMENT '主键，服务定义编码',
  `name` varchar(32) NOT NULL COMMENT '服务名称',
  `icon` varchar(128) NOT NULL COMMENT '服务图标文件名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  UNIQUE KEY `icon_UNIQUE` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='服务定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv`
--

DROP TABLE IF EXISTS `tbl_definition_subserv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv` (
  `id` varchar(32) NOT NULL COMMENT '主键，子服务定义ID',
  `name` varchar(32) NOT NULL COMMENT '子服务定义名称',
  `icon` varchar(255) NOT NULL,
  `type` varchar(32) NOT NULL COMMENT '子服务定义类型\n从定义获取code\ncluster_data\ncluster_proxy',
  `default_definition_subserv_arch_id` varchar(32) NOT NULL COMMENT '默认子服务架构定义ID，用于默认填充订单',
  `default_definition_subserv_unit_scale_id` varchar(32) NOT NULL COMMENT '默认子服务实例规模定义ID，用于默认填充订单',
  `primary` bit(1) NOT NULL COMMENT '在服务中，是否为主要子服务\n0	fasle\n1	true',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv_arch`
--

DROP TABLE IF EXISTS `tbl_definition_subserv_arch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv_arch` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `code` varchar(32) NOT NULL COMMENT '架构代码',
  `definition_subserv_name` varchar(32) NOT NULL COMMENT '所属子服务定义名称',
  `high_availability` int(11) NOT NULL COMMENT '高可用指数',
  `consistency` int(11) NOT NULL COMMENT '一致性指数',
  `capability` int(11) NOT NULL COMMENT '性能指标',
  `unit_num` int(11) NOT NULL COMMENT '单元数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务架构定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv_belongto_serv`
--

DROP TABLE IF EXISTS `tbl_definition_subserv_belongto_serv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv_belongto_serv` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `definition_subserv_id` varchar(32) NOT NULL COMMENT '子服务定义ID',
  `definition_serv_id` varchar(32) NOT NULL COMMENT '所属服务定义ID',
  `priority` int(11) NOT NULL COMMENT '部署优先级，数值越小优先级越高',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务所属服务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv_relation`
--

DROP TABLE IF EXISTS `tbl_definition_subserv_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv_relation` (
  `id` varchar(32) NOT NULL COMMENT '主键，子服务关系定义ID',
  `definition_serv_id` varchar(32) NOT NULL COMMENT '所属服务定义ID',
  `from_definition_subserv_id` varchar(32) DEFAULT NULL COMMENT '子服务关系起点',
  `to_definition_subserv_id` varchar(32) DEFAULT NULL COMMENT '子服务关系终点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务关系定义，用于描述子服务多对多关系';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv_software`
--

DROP TABLE IF EXISTS `tbl_definition_subserv_software`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv_software` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `definition_subserv_id` varchar(32) NOT NULL COMMENT '所属子服务定义ID',
  `major_version` int(11) NOT NULL COMMENT '主版本号',
  `minor_version` int(11) NOT NULL COMMENT '次版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务软件定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_definition_subserv_unit_scale`
--

DROP TABLE IF EXISTS `tbl_definition_subserv_unit_scale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_definition_subserv_unit_scale` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `definition_subserv_name` varchar(32) NOT NULL COMMENT '所属子服务定义名称',
  `cpu_num` int(11) NOT NULL COMMENT 'cpu数量',
  `mem_size` int(11) NOT NULL COMMENT '内存容量，单位G',
  `network_bandwidth` int(11) NOT NULL COMMENT '网络设备带宽，单位M/s',
  `io_weight` int(11) NOT NULL COMMENT '磁盘IO权重',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务单元规模定义表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_dict`
--

DROP TABLE IF EXISTS `tbl_dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_dict` (
  `code` varchar(32) NOT NULL COMMENT '主键',
  `dict_type_code` varchar(32) NOT NULL COMMENT '所属字典类型代码',
  `name` varchar(255) NOT NULL COMMENT '名称',
  PRIMARY KEY (`code`,`dict_type_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_dict_type`
--

DROP TABLE IF EXISTS `tbl_dict_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_dict_type` (
  `code` varchar(32) NOT NULL,
  `name` varchar(16) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_host`
--

DROP TABLE IF EXISTS `tbl_host`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_host` (
  `id` varchar(32) NOT NULL COMMENT '主键，主机ID',
  `cluster_id` varchar(32) NOT NULL COMMENT '所属集群ID',
  `name` varchar(16) NOT NULL COMMENT '主机名称',
  `ssh_ip` varchar(32) NOT NULL COMMENT 'ssh登陆IP地址',
  `ssh_user` varchar(32) NOT NULL COMMENT 'ssh登陆用户',
  `ssh_password` varchar(32) NOT NULL COMMENT 'ssh登陆密码',
  `room` varchar(16) NOT NULL COMMENT '所在机房',
  `seat` varchar(16) NOT NULL COMMENT '所在机位',
  `max_container` int(11) NOT NULL COMMENT '主机上可容纳最大容器的数量',
  `hdd_dev` varchar(64) NOT NULL COMMENT '机械磁盘设备名',
  `ssd_dev` varchar(64) NOT NULL COMMENT '固态磁盘设备名',
  `san_id` varchar(32) DEFAULT NULL COMMENT '所链SAN存储ID',
  `nic_phy_type` varchar(16) NOT NULL COMMENT '网卡设备类型\nSR_IOV\nPHY_DEV',
  `status` int(11) NOT NULL COMMENT ' 主机状态\n',
  `relate_id` varchar(64) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unite_unique_index` (`cluster_id`,`name`,`ssh_ip`),
  UNIQUE KEY `relate_id_UNIQUE` (`relate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主集表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_menu`
--

DROP TABLE IF EXISTS `tbl_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_menu` (
  `code` varchar(32) NOT NULL COMMENT '菜单代码',
  `name` varchar(16) NOT NULL COMMENT '菜单名称',
  `priority` int(11) NOT NULL COMMENT '显示优先级',
  `level` int(11) NOT NULL COMMENT '菜单级别\n0	1级菜单\n1	2级菜单\n以此类推',
  `icon` varchar(64) DEFAULT NULL COMMENT '菜单图标文件名称',
  `action` varchar(255) DEFAULT NULL COMMENT '菜单动作，存放跳转到页面文件名称',
  `parent_code` varchar(32) NOT NULL COMMENT '父菜单代码',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_menu_resource`
--

DROP TABLE IF EXISTS `tbl_menu_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_menu_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，菜单资源ID',
  `menu_code` varchar(32) NOT NULL COMMENT '所属菜单代码',
  `control_type` varchar(16) NOT NULL COMMENT '控件类型',
  `control_id` varchar(32) NOT NULL COMMENT '控件ID',
  `control_name` varchar(16) DEFAULT NULL COMMENT '控件名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_networking`
--

DROP TABLE IF EXISTS `tbl_networking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_networking` (
  `id` varchar(32) NOT NULL COMMENT '主键，网段ID',
  `cluster_id` varchar(32) NOT NULL COMMENT '所属集群ID',
  `name` varchar(16) NOT NULL COMMENT '网段名称',
  `type` varchar(16) NOT NULL COMMENT '网段类型\nlan\nwan',
  `start_ip` varchar(64) NOT NULL COMMENT '起始IP地址',
  `end_ip` varchar(64) NOT NULL COMMENT '结束IP地址',
  `vlan_id` int(11) NOT NULL COMMENT '标记vlanID',
  `prefix` int(11) NOT NULL COMMENT 'IP 掩码，0～32',
  `gateway` varchar(64) NOT NULL COMMENT '网关IP',
  `enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '0:停用\n1:启用',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网段表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_nfs_backup`
--

DROP TABLE IF EXISTS `tbl_nfs_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_nfs_backup` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `site_id` varchar(32) NOT NULL COMMENT '所属站点ID',
  `name` varchar(45) NOT NULL COMMENT '备份存储名称',
  `nfs_ip` varchar(45) NOT NULL COMMENT 'nfs IP地址',
  `nfs_dir` varchar(128) NOT NULL COMMENT 'nfs 源目录',
  `nfs_mount_dir` varchar(128) NOT NULL COMMENT 'nfs 挂载目录',
  `nfs_mount_opts` varchar(256) DEFAULT NULL COMMENT 'nfs 挂载参数',
  `enabled` bit(1) NOT NULL COMMENT '是否可用\n0	fasle\n1	true',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nfs备份存储表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_operate_log`
--

DROP TABLE IF EXISTS `tbl_operate_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_operate_log` (
  `id` varchar(32) NOT NULL COMMENT '主键，操作日志ID',
  `model_name` varchar(32) DEFAULT NULL COMMENT '操作模块名称',
  `action` varchar(32) NOT NULL COMMENT '操作动作',
  `obj_id` varchar(32) NOT NULL COMMENT '操作对象ID',
  `obj_name` varchar(128) NOT NULL COMMENT '操作对象名称',
  `status` int(11) NOT NULL COMMENT '操作状态\n1	成功\n2	执行中\n3	失败',
  `msg` varchar(256) DEFAULT NULL COMMENT '操作结果信息',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_order`
--

DROP TABLE IF EXISTS `tbl_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_order` (
  `id` varchar(32) NOT NULL COMMENT '主键，订单ID',
  `definition_serv_id` varchar(32) NOT NULL COMMENT '所属服务定义ID',
  `site_id` varchar(32) NOT NULL COMMENT '所属站点ID',
  `area_id` varchar(32) NOT NULL COMMENT '所属区域ID',
  `serv_business_code` varchar(32) NOT NULL COMMENT '服务业务代码',
  `serv_business_name` varchar(16) NOT NULL COMMENT '服务业务名称',
  `type` varchar(16) NOT NULL COMMENT '订单类型',
  `status` varchar(16) NOT NULL COMMENT '订单状态',
  `associate_order_id` varchar(32) DEFAULT NULL COMMENT '关联订单ID',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  KEY `serv_definition_id_INDEX` (`definition_serv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_san`
--

DROP TABLE IF EXISTS `tbl_san`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_san` (
  `id` varchar(32) NOT NULL COMMENT '主键，SAN存储ID',
  `site_id` varchar(32) NOT NULL COMMENT '所属站点ID',
  `name` varchar(16) NOT NULL COMMENT 'SAN存储名称',
  `relate_id` varchar(64) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='SAN存储表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_san_rg`
--

DROP TABLE IF EXISTS `tbl_san_rg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_san_rg` (
  `id` varchar(32) NOT NULL COMMENT 'SAN存储RaidGroup ID',
  `san_id` varchar(32) NOT NULL COMMENT '所属SAN存储ID',
  `relate_id` varchar(64) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='SAN存储RaidGroup表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_serv`
--

DROP TABLE IF EXISTS `tbl_serv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_serv` (
  `id` varchar(32) NOT NULL COMMENT '主键，服务ID',
  `definition_serv_id` varchar(32) NOT NULL COMMENT '所属服务定义ID',
  `area_id` varchar(32) NOT NULL COMMENT '所属区域ID',
  `serv_business_code` varchar(32) NOT NULL COMMENT '服务业务代码',
  `serv_business_name` varchar(16) NOT NULL COMMENT '服务业务名称',
  `own_user_login_name` varchar(32) NOT NULL,
  `create_datetime` datetime NOT NULL,
  `create_user_login_name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='服务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_site`
--

DROP TABLE IF EXISTS `tbl_site`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_site` (
  `id` varchar(32) NOT NULL COMMENT '主键，站点ID',
  `name` varchar(16) NOT NULL COMMENT '站点名称',
  `region_code` varchar(16) NOT NULL COMMENT '所属地域编码',
  `consul_ips` varchar(255) NOT NULL COMMENT 'consul集群地址，多个地址用“;”间隔\n例如：192.168.100.1;192.168.100.2',
  `consul_port` int(11) NOT NULL COMMENT 'consul集群端口',
  `consul_token` varchar(255) DEFAULT NULL COMMENT 'consul通讯令牌，用于安全认证，可以为空',
  `mgm_ca` varchar(255) DEFAULT NULL COMMENT '资源管理服务（mgm）认证证书，用于安全认证，可以为空',
  `horus_server_ca` varchar(255) DEFAULT NULL COMMENT '监控管理服务（horus server）认证证书，用于安全认证，可以为空',
  `mgm_prefix` varchar(128) NOT NULL COMMENT '资源管理过滤条件，用于从consul过滤查询服务信息使用',
  `horus_server_prefix` varchar(128) NOT NULL COMMENT '监控管理过滤条件，用于从consul过滤查询服务信息使用',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='站点表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_suborder`
--

DROP TABLE IF EXISTS `tbl_suborder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_suborder` (
  `id` varchar(32) NOT NULL COMMENT '主键，子订单ID',
  `subserv_software_image_id` varchar(32) NOT NULL COMMENT '所用子服务软件镜像ID\n用于获取子服务定义ID，子服务软件主版本，子服务软件镜像fix版本',
  `subserv_arch_code` varchar(32) NOT NULL COMMENT '子服务架构代码，用于发送给后台，描述架构',
  `highAvailability` int(11) NOT NULL COMMENT '高可用指数',
  `consistency` int(11) NOT NULL COMMENT '一致性指数',
  `capability` int(11) NOT NULL COMMENT '性能指数',
  `cpu_num` int(11) NOT NULL COMMENT '所创建子服务单元cpu数量',
  `mem_size` int(11) NOT NULL COMMENT '所创建子服务单元内存容量，单位G',
  `io_weight` int(11) NOT NULL COMMENT '磁盘IO设备比重',
  `datadir_size` int(11) NOT NULL COMMENT '数据目录容量，单位G',
  `datadir_device_type` varchar(32) NOT NULL COMMENT '数据目录设备类型',
  `logdir_size` int(11) NOT NULL COMMENT '日志目录容量，单位G',
  `logdir_device_type` varchar(32) NOT NULL COMMENT '日志目录设备类型',
  `backup_size` int(11) DEFAULT NULL COMMENT '日志目录容量，单位G',
  `backup_device_type` varchar(32) DEFAULT NULL COMMENT '备份目录设备类型',
  `order_id` varchar(32) NOT NULL COMMENT '所属订单ID',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_suborder_nic`
--

DROP TABLE IF EXISTS `tbl_suborder_nic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_suborder_nic` (
  `id` varchar(32) NOT NULL COMMENT '主键，子订单网卡ID',
  `suborder_id` varchar(32) NOT NULL COMMENT '所属子订单ID',
  `network_bandwidth` int(11) NOT NULL COMMENT '网络带宽，单位M/s',
  `nic_phy_type` varchar(16) NOT NULL COMMENT '网卡设备类型\nSR_IOV\nPHY_DEV',
  `nic_ha_type` varchar(16) NOT NULL COMMENT '网卡设备类型\nbond',
  `network_id` varchar(64) NOT NULL COMMENT '网卡绑定IP的来源网段ID',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子订单网卡表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_suborder_user`
--

DROP TABLE IF EXISTS `tbl_suborder_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_suborder_user` (
  `id` varchar(32) NOT NULL COMMENT '主键，子订单用户ID',
  `suborder_id` varchar(32) NOT NULL COMMENT '所属子订单ID',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `mysql_user_role_definition_id` varchar(32) DEFAULT NULL COMMENT 'mysql用户角色定义ID',
  `mapping_suborder_user_id` varchar(32) DEFAULT NULL COMMENT '映射子订单用户ID',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子订单用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_subserv`
--

DROP TABLE IF EXISTS `tbl_subserv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_subserv` (
  `id` varchar(32) NOT NULL COMMENT '主机',
  `relate_id` varchar(32) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `serv_id` varchar(32) NOT NULL COMMENT '所属服务ID',
  `subserv_software_image_id` varchar(32) NOT NULL COMMENT '所用子服务软件镜像ID\n用于获取子服务定义ID，子服务软件主版本，子服务软件镜像fix版本',
  `subserv_arch_code` varchar(32) NOT NULL COMMENT '子服务架构代码，用于发送给后台，描述架构',
  `high_availability` int(11) NOT NULL COMMENT '高可用指数',
  `consistency` int(11) NOT NULL COMMENT '一致性指数',
  `capability` int(11) NOT NULL COMMENT '性能指数',
  `cpu_num` int(11) NOT NULL COMMENT '所创建子服务单元cpu数量',
  `mem_size` int(11) NOT NULL COMMENT '所创建子服务单元内存容量，单位G',
  `io_weight` int(11) NOT NULL COMMENT '磁盘IO设备比重',
  `datadir_size` int(11) NOT NULL COMMENT '数据目录容量，单位G',
  `datadir_device_type` varchar(32) NOT NULL COMMENT '数据目录设备类型',
  `logdir_size` int(11) NOT NULL COMMENT '日志目录容量，单位G',
  `logdir_device_type` varchar(32) NOT NULL COMMENT '日志目录设备类型',
  `backup_size` int(11) DEFAULT NULL COMMENT '日志目录容量，单位G',
  `backup_device_type` varchar(32) DEFAULT NULL COMMENT '备份目录设备类型',
  `create_datetime` datetime NOT NULL,
  `create_user_login_name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `relate_id_UNIQUE` (`relate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_subserv_nic`
--

DROP TABLE IF EXISTS `tbl_subserv_nic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_subserv_nic` (
  `id` varchar(32) NOT NULL COMMENT '主键，子服务网卡ID',
  `subserv_id` varchar(32) NOT NULL COMMENT '所属子服务ID',
  `network_bandwidth` int(11) NOT NULL COMMENT '网络带宽，单位M/s',
  `nic_phy_type` varchar(16) NOT NULL COMMENT '网卡设备类型\nSR_IOV\nPHY_DEV',
  `nic_ha_type` varchar(16) NOT NULL COMMENT '网卡设备类型\nbond',
  `network_id` varchar(64) NOT NULL COMMENT '网卡绑定IP的来源网段ID',
  `create_datetime` datetime NOT NULL,
  `create_user_login_name` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务网卡表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_subserv_software_image`
--

DROP TABLE IF EXISTS `tbl_subserv_software_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_subserv_software_image` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `definition_subserv_software_id` varchar(32) NOT NULL COMMENT '所属子服务软件定义ID',
  `patch_version` int(11) NOT NULL COMMENT '修订版本号',
  `site_id` varchar(32) NOT NULL COMMENT '所属站点ID',
  `relate_id` varchar(64) DEFAULT NULL COMMENT '关联ID, 由于事务处理需要所以可以为空',
  `enabled` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '是否可用\n0	fasle\n1	true',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `relate_id_UNIQUE` (`relate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_subserv_user`
--

DROP TABLE IF EXISTS `tbl_subserv_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_subserv_user` (
  `id` varchar(32) NOT NULL COMMENT '主键，子服务用户ID',
  `subserv_id` varchar(32) NOT NULL COMMENT '所属子服务ID',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `definition_mysql_user_role_id` varchar(32) DEFAULT NULL COMMENT 'mysql用户角色定义ID',
  `mapping_user_login_name` varchar(32) DEFAULT NULL COMMENT '映射子服务用户ID',
  `create_datetime` datetime NOT NULL COMMENT '创建时间',
  `create_user_login_name` varchar(32) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_subtask`
--

DROP TABLE IF EXISTS `tbl_subtask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_subtask` (
  `id` varchar(32) NOT NULL COMMENT '主键，子任务ID',
  `obj_type` varchar(32) NOT NULL COMMENT '操作对象类型',
  `obj_id` varchar(32) NOT NULL COMMENT '操作对象ID',
  `action_type` varchar(32) NOT NULL COMMENT '操作动作类型',
  `async` bit(1) NOT NULL,
  `start_datetime` datetime NOT NULL COMMENT '开始时间',
  `end_datetime` datetime DEFAULT NULL COMMENT '结束时间',
  `status` int(11) NOT NULL COMMENT '子任务状态',
  `msg` varchar(255) DEFAULT NULL COMMENT '子任务执行信息',
  `priority` int(11) DEFAULT NULL COMMENT '优先级',
  `task_id` varchar(32) NOT NULL COMMENT '所属任务ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子任务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_task`
--

DROP TABLE IF EXISTS `tbl_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_task` (
  `id` varchar(32) NOT NULL COMMENT '主键，任务ID',
  `obj_type` varchar(32) NOT NULL COMMENT '操作对象类型',
  `obj_id` varchar(32) NOT NULL COMMENT '操作对象ID',
  `action_type` varchar(32) NOT NULL COMMENT '操作动作类型',
  `start_datetime` datetime NOT NULL COMMENT '开始时间',
  `end_datetime` datetime DEFAULT NULL COMMENT '结束时间',
  `status` int(11) NOT NULL COMMENT '任务状态',
  `msg` varchar(255) DEFAULT NULL COMMENT '任务执行信息',
  `operate_log_id` varchar(32) DEFAULT NULL COMMENT '执行任务的操作日志ID，可获取操作日志信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user` (
  `login_name` varchar(32) NOT NULL COMMENT '登陆用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `telephone` varchar(11) NOT NULL COMMENT '电话号码',
  `email` varchar(32) NOT NULL COMMENT '联系电子邮箱',
  `company` varchar(32) NOT NULL COMMENT '所属公司',
  `user_group_id` varchar(32) NOT NULL COMMENT '所属用户组别code',
  `user_role_code` varchar(32) NOT NULL COMMENT '所属用户角色ID',
  `validate` bit(1) NOT NULL COMMENT '是否有效\n0	fasle\n1	true',
  `latest_login_datetime` datetime DEFAULT NULL COMMENT '最近登陆时间',
  PRIMARY KEY (`login_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_user_group`
--

DROP TABLE IF EXISTS `tbl_user_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user_group` (
  `id` varchar(32) NOT NULL,
  `name` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组别表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tbl_user_role`
--

DROP TABLE IF EXISTS `tbl_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user_role` (
  `code` varchar(32) NOT NULL COMMENT '主键，角色代码',
  `name` varchar(16) NOT NULL COMMENT '角色名称',
  `level` int(11) NOT NULL COMMENT '角色级别\n值越小级别越高，级别高的用户可以级别低的用户进行授权',
  `description` varchar(128) DEFAULT NULL COMMENT '角色描述',
  `visible` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否可见',
  PRIMARY KEY (`code`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';
/*!40101 SET character_set_client = @saved_cs_client */;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-03 10:31:24
