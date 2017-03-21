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

SET @@GLOBAL.GTID_PURGED='86a3efc6-c37b-11e6-a036-005056b651fb:1-8330';

--
-- Dumping data for table `tbl_area`
--

LOCK TABLES `tbl_area` WRITE;
/*!40000 ALTER TABLE `tbl_area` DISABLE KEYS */;
INSERT INTO `tbl_area` VALUES ('8e342997c93c4ff599e76bfdd711601f','79affb2429ef48faa57c802a88dd8e7f','浦西','','','2017-03-01 16:13:12','admin'),('ab97457d178948ff910fb342d57a0ec4','79affb2429ef48faa57c802a88dd8e7f','浦东','','','2017-02-28 13:55:55','admin');
/*!40000 ALTER TABLE `tbl_area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_auth_menu`
--

LOCK TABLES `tbl_auth_menu` WRITE;
/*!40000 ALTER TABLE `tbl_auth_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_auth_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_auth_menu_resource`
--

LOCK TABLES `tbl_auth_menu_resource` WRITE;
/*!40000 ALTER TABLE `tbl_auth_menu_resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_auth_menu_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_cluster`
--

LOCK TABLES `tbl_cluster` WRITE;
/*!40000 ALTER TABLE `tbl_cluster` DISABLE KEYS */;
INSERT INTO `tbl_cluster` VALUES ('1db2b5b554024182bb0a55ee8d2efffa','ab97457d178948ff910fb342d57a0ec4','集群一','123','','2017-03-02 11:35:26','admin'),('xxxxx','8e342997c93c4ff599e76bfdd711601f','集群一','456','','2017-03-02 15:33:28','xxx');
/*!40000 ALTER TABLE `tbl_cluster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_cluster_subserv`
--

LOCK TABLES `tbl_cluster_subserv` WRITE;
/*!40000 ALTER TABLE `tbl_cluster_subserv` DISABLE KEYS */;
INSERT INTO `tbl_cluster_subserv` VALUES ('1db2b5b554024182bb0a55ee8d2efffa','1');
/*!40000 ALTER TABLE `tbl_cluster_subserv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition`
--

LOCK TABLES `tbl_definition` WRITE;
/*!40000 ALTER TABLE `tbl_definition` DISABLE KEYS */;
INSERT INTO `tbl_definition` VALUES ('storage_local_hdd','local:hdd'),('storage_local_ssd','local:ssd'),('storage_san','san');
/*!40000 ALTER TABLE `tbl_definition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_mysql_user_role`
--

LOCK TABLES `tbl_definition_mysql_user_role` WRITE;
/*!40000 ALTER TABLE `tbl_definition_mysql_user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_definition_mysql_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_serv`
--

LOCK TABLES `tbl_definition_serv` WRITE;
/*!40000 ALTER TABLE `tbl_definition_serv` DISABLE KEYS */;
INSERT INTO `tbl_definition_serv` VALUES ('1','mysql','mysql-logo.png');
/*!40000 ALTER TABLE `tbl_definition_serv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv`
--

LOCK TABLES `tbl_definition_subserv` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv` DISABLE KEYS */;
INSERT INTO `tbl_definition_subserv` VALUES ('1','mysql','mysql-logo.png','oltp','1','1','');
/*!40000 ALTER TABLE `tbl_definition_subserv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv_arch`
--

LOCK TABLES `tbl_definition_subserv_arch` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv_arch` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_definition_subserv_arch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv_belongto_serv`
--

LOCK TABLES `tbl_definition_subserv_belongto_serv` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv_belongto_serv` DISABLE KEYS */;
INSERT INTO `tbl_definition_subserv_belongto_serv` VALUES ('1','1','1',1);
/*!40000 ALTER TABLE `tbl_definition_subserv_belongto_serv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv_relation`
--

LOCK TABLES `tbl_definition_subserv_relation` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_definition_subserv_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv_software`
--

LOCK TABLES `tbl_definition_subserv_software` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv_software` DISABLE KEYS */;
INSERT INTO `tbl_definition_subserv_software` VALUES ('1','1',5,6);
/*!40000 ALTER TABLE `tbl_definition_subserv_software` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_definition_subserv_unit_scale`
--

LOCK TABLES `tbl_definition_subserv_unit_scale` WRITE;
/*!40000 ALTER TABLE `tbl_definition_subserv_unit_scale` DISABLE KEYS */;
INSERT INTO `tbl_definition_subserv_unit_scale` VALUES ('1','mysql',1,2,100,1000);
/*!40000 ALTER TABLE `tbl_definition_subserv_unit_scale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_dict`
--

LOCK TABLES `tbl_dict` WRITE;
/*!40000 ALTER TABLE `tbl_dict` DISABLE KEYS */;
INSERT INTO `tbl_dict` VALUES ('1','operate_status','成功'),('2','operate_status','执行中'),('3','operate_status','失败'),('critical','status_hs','异常'),('critical','status_mgm','异常'),('false','status_enabled','停用'),('lan','networking_type','内网'),('operate_action_add','operate_action','新增'),('operate_action_deregister','operate_action','删除'),('operate_action_login','operate_action','登录'),('operate_action_register','operate_action','注册'),('operate_model_login','operate_model','登录'),('operate_model_site','operate_model','站点管理'),('passing','status_hs','正常'),('passing','status_mgm','正常'),('SH','region','上海'),('storage_local_hdd','storage_type','本地硬盘'),('storage_local_ssd','storage_type','本地固态盘'),('storage_san','storage_type','外置存储'),('true','status_enabled','启用'),('wan','networking_type','外网'),('warning','status_hs','告警'),('warning','status_mgm','告警');
/*!40000 ALTER TABLE `tbl_dict` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_dict_type`
--

LOCK TABLES `tbl_dict_type` WRITE;
/*!40000 ALTER TABLE `tbl_dict_type` DISABLE KEYS */;
INSERT INTO `tbl_dict_type` VALUES ('cluster_type','集群类型'),('networking_type','网段类型'),('operate_action','操作动作'),('operate_model','操作模块'),('operate_status','操作状态'),('region','地域'),('status_enabled','启用状态'),('status_hs','hs状态'),('status_mgm','mgm状态'),('storage_type','存储类型');
/*!40000 ALTER TABLE `tbl_dict_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_host`
--

LOCK TABLES `tbl_host` WRITE;
/*!40000 ALTER TABLE `tbl_host` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_host` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_menu`
--

LOCK TABLES `tbl_menu` WRITE;
/*!40000 ALTER TABLE `tbl_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_menu_resource`
--

LOCK TABLES `tbl_menu_resource` WRITE;
/*!40000 ALTER TABLE `tbl_menu_resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_menu_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_networking`
--

LOCK TABLES `tbl_networking` WRITE;
/*!40000 ALTER TABLE `tbl_networking` DISABLE KEYS */;
INSERT INTO `tbl_networking` VALUES ('b61f625786604b2a9f35645dc38a839b','1db2b5b554024182bb0a55ee8d2efffa','网段一','lan','192.168.0.1','192.168.0.10',12,22,'255.255.255.0','','2017-03-02 16:47:36','admin');
/*!40000 ALTER TABLE `tbl_networking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_nfs_backup`
--

LOCK TABLES `tbl_nfs_backup` WRITE;
/*!40000 ALTER TABLE `tbl_nfs_backup` DISABLE KEYS */;
INSERT INTO `tbl_nfs_backup` VALUES ('123','xxx','xxx','','','',NULL,'','2017-03-01 18:42:27','xxx'),('fbfaac5cca09403fbf817677f46a36e9','79affb2429ef48faa57c802a88dd8e7f','fbfaac5cca09403fbf817677f46a36e9','','','',NULL,'','2017-03-01 19:10:59','admin');
/*!40000 ALTER TABLE `tbl_nfs_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_operate_log`
--

LOCK TABLES `tbl_operate_log` WRITE;
/*!40000 ALTER TABLE `tbl_operate_log` DISABLE KEYS */;
INSERT INTO `tbl_operate_log` VALUES ('08bd9728a80a405cac92c6201e748304','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 13:50:36','admin'),('098b4c62d5b04cc081c62d5851403449','operate_model_area','operate_action_add','8e342997c93c4ff599e76bfdd711601f','浦西',1,NULL,'2017-03-01 16:13:12','admin'),('0cf9548eaa4b4d949905e435f147a8e0','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 13:04:24','admin'),('0d068e2b7cd042b68da524cd64d9dc07','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 15:31:40','admin'),('15a24e3b0d414ae1a6099eaf4bfbb1b5','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 19:45:31','admin'),('195f5b23e1f8434d819ae3bd50aeee86','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 19:39:45','admin'),('1c682162e4cf46598305d951a0f50edf','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 14:04:55','admin'),('1dd1d398f9f24b37a5a36133e693c595','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:31:53','admin'),('1f4944558db24d15a2c6861f07587000','operate_model_networking','operate_action_add','4928c6a37bba45f6b91ec0c00bd89f37','网段一',1,NULL,'2017-03-02 16:35:33','admin'),('25b33195740b44a689d16ca1ba734a88','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:21:21','admin'),('2b702231a1b04108a5a0f6bb8f7e689e','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 10:53:58','admin'),('2e8fda7d254b44d39d0d72ce1d60de25','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:28:25','admin'),('3054e680a0144ad18a4cdb0eab13d65d','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 13:57:30','admin'),('35b04825ae934ab5a216fdc0a9215a4c','operate_model_area','operate_action_add','147b837af5e448b68abfe7df6971d328','浦西',1,NULL,'2017-02-28 14:20:51','admin'),('39b8c6c16d8c464ab15bee9ff7ffb341','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 13:09:56','admin'),('39e396517b8645a8a26899d44b7344ad','operate_model_cluster','operate_action_add','6c5bb9b3ed304af7a51d9c69143efe19','集群一',1,NULL,'2017-03-02 10:54:10','admin'),('3e20fb198fb0424f8c051f79d40b0421','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 13:49:27','admin'),('3e8f7f62129c41fd86a53c0d3ebaeaae','operate_model_networking','operate_action_delete','4928c6a37bba45f6b91ec0c00bd89f37','网段一',1,NULL,'2017-03-02 16:39:13','admin'),('458f071db24d47dca4392618a206db41','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:07:46','admin'),('4797327c20d44720b169d14c509044f3','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 14:13:48','admin'),('4f9aeb43f9664561a182858a2da8f16f','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:42:50','admin'),('510e8206fc1940f4b7e18c99442869b2','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:23:39','admin'),('5620e01217764adaa8ba517de2e0e394','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 15:28:54','admin'),('5aa853dba5454f3393a8934581a83daf','operate_model_cluster','operate_action_add','1db2b5b554024182bb0a55ee8d2efffa','集群一',1,NULL,'2017-03-02 11:35:26','admin'),('636c0634220547dd9fdeed2ebdd34c5e','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 19:55:27','admin'),('67607e23610e44f18c3f6b4189315fd2','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:17:05','admin'),('67eaa5b958af46c8b0b6e3cc1b4d67f6','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 12:41:35','admin'),('6cba748601924be6bc71c013a6798a59','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:58:56','admin'),('75745f32b3e74f659f46dc8ad40fb1e8','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 10:56:12','admin'),('76625043cbc04aefa2db01cbaa750468','operate_model_area','operate_action_add','ab97457d178948ff910fb342d57a0ec4','浦东',1,NULL,'2017-02-28 13:55:55','admin'),('78b3f524d88644a38d9f70696deb9078','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 12:58:56','admin'),('7c4d320d6e9f479a99a2757679215e76','operate_model_cluster','operate_action_add','a14045ebfaed46078c2b017667d93b3e','集群一',1,NULL,'2017-03-02 11:30:55','admin'),('828fe271c8744d2d93baf2154aca22c4','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 19:10:46','admin'),('834d5f4d2f88492991c09ef7d273e6e0','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:25:50','admin'),('8f9be3ebd1de41bbb3cb18ad8641f94e','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 19:36:14','admin'),('946a7eb24112460faf7f7bff7490263e','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:33:22','admin'),('95185925581845d996e47c4e270cce73','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 12:52:36','admin'),('977cf94cbddd422cb0d9bafee9fa041b','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:35:23','admin'),('9f37599c737a473c842ffc3bf965023d','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 19:01:00','admin'),('a4ea1aff0c9c4ec4a1f9f2c1ff590425','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:30:51','admin'),('a726a93f03fc456bb3947dbe39216e06','operate_model_nfsbackup','operate_action_delete','xxxxx','123',1,NULL,'2017-03-01 14:39:51','admin'),('a83c68fde48646dd960b08c4aadea761','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 13:55:48','admin'),('ab62c7d95a66426284c93199d8d0e082','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:30:49','admin'),('af9b2bf0701442469a4ae55fa14d4ec0','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:31:18','admin'),('b0c54ec95ecc4604a65164077e8bea46','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:39:07','admin'),('b1e990ca31f54ec092d1d985f51eab52','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:06:12','admin'),('b47072c90cf44af7b9e497a123e2525f','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 19:49:23','admin'),('b5431e85c60b4300b98bfe4e0b32529f','operate_model_networking','operate_action_add','b61f625786604b2a9f35645dc38a839b','网段一',1,NULL,'2017-03-02 16:47:36','admin'),('c8aeabab40974501bd2fe578080ec4cc','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 12:56:54','admin'),('c980c85c0d4f4642ae921712fe6cf4a7','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 16:12:22','admin'),('cf117d2ec62b4e6cb969b84dbfe2571b','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:47:28','admin'),('d7976a6bafaf4315bc40a61ee8505e5f','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 18:33:28','admin'),('d9fdf4f0801b45a78ff340e881dbcb42','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 14:02:16','admin'),('dd793319dc5345dab85a74b66238df13','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 23:21:46','admin'),('e0a470e019804fc5b85bc42a31c3451c','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:23:56','admin'),('e2289c7494234d6cb72f15cf8244eedc','operate_model_nfsbackup','operate_action_delete','ec81ffd154874fe7b5437d0d1c60187b','nfs备份存储一',1,NULL,'2017-03-01 18:33:59','admin'),('e379acd0b2b6409c90a7bc14d64aaa9c','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 14:39:06','admin'),('e5311fd0552a4b909d7d14d2ff97e837','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 11:17:22','admin'),('e66dc5fc80ce4f27996ba765fd08f7f6','operate_model_nfsbackup','operate_action_add','ec81ffd154874fe7b5437d0d1c60187b','nfs备份存储一',1,NULL,'2017-03-01 18:17:28','admin'),('e6c492a5c8d14a52b3af79bc3e87fe38','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 16:35:25','admin'),('e91779f91d3c4ff68ef36ce8f93366bf','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-02-28 14:08:35','admin'),('e9708fc12f4e475ca512f5d337bd1ff3','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-01 12:56:43','admin'),('f32d8142dc2e4147af9d0b195194ece1','operate_model_area','operate_action_delete','147b837af5e448b68abfe7df6971d328','浦西',1,NULL,'2017-02-28 14:22:10','admin'),('f4acba44c7bd4f3da30be3d40c8bff93','operate_model_nfsbackup','operate_action_add','fbfaac5cca09403fbf817677f46a36e9','nfs备份存储一',1,NULL,'2017-03-01 19:10:59','admin'),('f6a5cda8cf864730963ba45720488159','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 23:33:12','admin'),('ff292873eb86454882a253b82ca85338','operate_model_login','operate_action_login','admin','admin',1,NULL,'2017-03-02 13:02:04','admin');
/*!40000 ALTER TABLE `tbl_operate_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_order`
--

LOCK TABLES `tbl_order` WRITE;
/*!40000 ALTER TABLE `tbl_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_san`
--

LOCK TABLES `tbl_san` WRITE;
/*!40000 ALTER TABLE `tbl_san` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_san` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_san_rg`
--

LOCK TABLES `tbl_san_rg` WRITE;
/*!40000 ALTER TABLE `tbl_san_rg` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_san_rg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_serv`
--

LOCK TABLES `tbl_serv` WRITE;
/*!40000 ALTER TABLE `tbl_serv` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_serv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_site`
--

LOCK TABLES `tbl_site` WRITE;
/*!40000 ALTER TABLE `tbl_site` DISABLE KEYS */;
INSERT INTO `tbl_site` VALUES ('79affb2429ef48faa57c802a88dd8e7f','上海站点','SH','192.168.4.121;192.168.4.131;192.168.4.141',8500,'','','','MG','HS','2017-02-24 17:02:06','admin');
/*!40000 ALTER TABLE `tbl_site` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_suborder`
--

LOCK TABLES `tbl_suborder` WRITE;
/*!40000 ALTER TABLE `tbl_suborder` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_suborder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_suborder_nic`
--

LOCK TABLES `tbl_suborder_nic` WRITE;
/*!40000 ALTER TABLE `tbl_suborder_nic` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_suborder_nic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_suborder_user`
--

LOCK TABLES `tbl_suborder_user` WRITE;
/*!40000 ALTER TABLE `tbl_suborder_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_suborder_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_subserv`
--

LOCK TABLES `tbl_subserv` WRITE;
/*!40000 ALTER TABLE `tbl_subserv` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_subserv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_subserv_nic`
--

LOCK TABLES `tbl_subserv_nic` WRITE;
/*!40000 ALTER TABLE `tbl_subserv_nic` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_subserv_nic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_subserv_software_image`
--

LOCK TABLES `tbl_subserv_software_image` WRITE;
/*!40000 ALTER TABLE `tbl_subserv_software_image` DISABLE KEYS */;
INSERT INTO `tbl_subserv_software_image` VALUES ('2','1',13,'79affb2429ef48faa57c802a88dd8e7f','1',1,'2017-02-27 15:51:30','admin');
/*!40000 ALTER TABLE `tbl_subserv_software_image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_subserv_user`
--

LOCK TABLES `tbl_subserv_user` WRITE;
/*!40000 ALTER TABLE `tbl_subserv_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_subserv_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_subtask`
--

LOCK TABLES `tbl_subtask` WRITE;
/*!40000 ALTER TABLE `tbl_subtask` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_subtask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_task`
--

LOCK TABLES `tbl_task` WRITE;
/*!40000 ALTER TABLE `tbl_task` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('admin','670b14728ad9902aecba32e22fa4f6bd','13800000000','admin@email.com','富麦','1d557a34fd9342cea5e9ebeb21fb4454','admin','','2017-03-02 23:33:12');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_user_group`
--

LOCK TABLES `tbl_user_group` WRITE;
/*!40000 ALTER TABLE `tbl_user_group` DISABLE KEYS */;
INSERT INTO `tbl_user_group` VALUES ('1d557a34fd9342cea5e9ebeb21fb4454','组别一');
/*!40000 ALTER TABLE `tbl_user_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_user_role`
--

LOCK TABLES `tbl_user_role` WRITE;
/*!40000 ALTER TABLE `tbl_user_role` DISABLE KEYS */;
INSERT INTO `tbl_user_role` VALUES ('admin','管理员',1,NULL,''),('tenant','租户',2,NULL,'\0');
/*!40000 ALTER TABLE `tbl_user_role` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-03 10:48:35
