package com.api.constant;

/**
 * 字典项常量类
 * 
 * @author HCK
 *
 */
public class DictConstants {
	
	/********************操作结果  STA********************/
	/**
	 * 操作结果：成功
	 */
	public static final int OPERATE_STATUS_OK = 1;
	/**
	 * 操作结果：执行中
	 */
	public static final int OPERATE_STATUS_ING = 2;
	/**
	 * 操作结果：失败
	 */
	public static final int OPERATE_STATUS_FAILURE = 3;
	/********************操作结果  END********************/
	

	/********************操作模块  STA********************/
	/**
	 * 操作模块：登录
	 */
	public static final String OPERATE_MODEL_LOGIN = "operate_model_login";
	/**
	 * 操作模块：站点管理
	 */
	public static final String OPERATE_MODEL_SITE = "operate_model_site";
	/**
	 * 操作模块：区域管理
	 */
	public static final String OPERATE_MODEL_AREA = "operate_model_area";
	/**
	 * 操作模块：网段管理
	 */
	public static final String OPERATE_MODEL_NETWORKING = "operate_model_networking";
	/**
	 * 操作模块：集群管理
	 */
	public static final String OPERATE_MODEL_CLUSTER = "operate_model_cluster";
	/**
	 * 操作模块：主机管理
	 */
	public static final String OPERATE_MODEL_HOST = "operate_model_host";
	/**
	 * 操作模块：订单管理
	 */
	public static final String OPERATE_MODEL_ORDER = "operate_model_order";
	
	/********************操作模块  END********************/
	
	/********************操作动作  STA********************/
	/**
	 * 操作动作：登录
	 */
	public static final String OPERATE_ACTION_LOGIN = "operate_action_login";
	/**
	 * 操作动作：新增
	 */
	public static final String OPERATE_ACTION_ADD = "operate_action_add";
	/**
	 * 操作动作：删除
	 */
	public static final String OPERATE_ACTION_DELETE = "operate_action_delete";
	
	/********************操作动态  END********************/
}
