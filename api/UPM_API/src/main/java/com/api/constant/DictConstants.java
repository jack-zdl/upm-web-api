package com.api.constant;

/**
 * 字典项常量类
 * 
 * @author HCK
 *
 */
public class DictConstants {

	/******************************** 操作模块 STA ********************************/
	/**
	 * 操作模块：登录
	 */
	public static final String OPERATE_MODEL_LOGIN = "operate_model_login";

	/**
	 * 操作模块：站点管理
	 */
	public static final String OPERATE_MODEL_SITE = "operate_model_site";

	/**
	 * 操作模块：备份存储管理
	 */
	public static final String OPERATE_MODEL_NFSBACKUP = "operate_model_nfsBackup";

	/**
	 * 操作模块：区域管理
	 */
	public static final String OPERATE_MODEL_AREA = "operate_model_area";

	/**
	 * 操作模块：集群管理
	 */
	public static final String OPERATE_MODEL_CLUSTER = "operate_model_cluster";

	/**
	 * 操作模块：网段管理
	 */
	public static final String OPERATE_MODEL_NETWORKING = "operate_model_networking";

	/**
	 * 操作模块：软件镜像管理
	 */
	public static final String OPERATE_MODEL_SOFTWAREIMAGE = "operate_model_softwareImage";
	
	/**
	 * 操作模块：主机管理
	 */
	public static final String OPERATE_MODEL_HOST = "operate_model_host";
	
	/**
	 * 操作模块：工单管理
	 */
	public static final String OPERATE_MODEL_ORDER = "operate_model_order";
	/******************************** 操作模块 END ********************************/

	/******************************** 操作动作 STA ********************************/
	/**
	 * 操作动作：登录
	 */
	public static final String OPERATE_ACTION_LOGIN = "operate_action_login";

	/**
	 * 操作动作：注册
	 */
	public static final String OPERATE_ACTION_REGISTER = "operate_action_register";

	/**
	 * 操作动作：新增
	 */
	public static final String OPERATE_ACTION_ADD = "operate_action_add";
	
	/**
	 * 操作动作：编辑
	 */
	public static final String OPERATE_ACTION_UPDATE = "operate_action_update";

	/**
	 * 操作动作：注销
	 */
	public static final String OPERATE_ACTION_DEREGISTER = "operate_action_deregister";

	/**
	 * 操作动作：删除
	 */
	public static final String OPERATE_ACTION_DELETE = "operate_action_delete";
	
	/**
	 * 操作动作：入库
	 */
	public static final String OPERATE_ACTION_INPUT = "operate_action_input";
	
	/**
	 * 操作动作：出库
	 */
	public static final String OPERATE_ACTION_OUTPUT = "operate_action_out";
	
	/**
	 * 操作动作：审核
	 */
	public static final String OPERATE_ACTION_AUDIT = "operate_action_audit";
	
	/**
	 * 操作动作：执行
	 */
	public static final String OPERATE_ACTION_EXECUTE = "operate_action_execute";
	/******************************** 操作动态 END ********************************/

	/******************************* mgm状态 STA ********************************/
	/**
	 * mgm状态:正常
	 */
	public static final String STATUS_MGM_PASSING = "passing";

	/**
	 * mgm状态:告警
	 */
	public static final String STATUS_MGM_WARNING = "warning";

	/**
	 * mgm状态:异常
	 */

	public static final String STATUS_MGM_CRITICAL = "critical";
	/******************************* mgm状态 END ********************************/

	/******************************** hs状态 STA ********************************/
	/**
	 * hs状态:正常
	 */
	public static final String STATUS_HS_PASSING = "passing";

	/**
	 * hs状态:告警
	 */
	public static final String STATUS_HS_WARNING = "warning";

	/**
	 * hs状态:异常
	 */
	public static final String STATUS_HS_CRITICAL = "critical";
	/******************************** hs状态 END ********************************/

	/****************************** 任务对象类型 STA ******************************/
	/**
	 * 任务对象类型：软件镜像
	 */
	public static final String TASK_OBJ_TYPE_SOFTWAREIMAGE = "softwareImage";
	
	/**
	 * 任务对象类型：主机
	 */
	public static final String TASK_OBJ_TYPE_HOST = "host";
	
	/**
	 * 任务对象类型：工单
	 */
	public static final String TASK_OBJ_TYPE_ORDER = "order";
	
	/**
	 * 任务对象类型：子工单
	 */
	public static final String TASK_OBJ_TYPE_SUBORDER = "subOrder";
	/****************************** 任务对象类型 END ******************************/
	
	/****************************** 任务动作类型 STA ******************************/
	/**
	 * 任务动作类型：创建
	 */
	public static final String TASK_ACTION_TYPE_CREATE = "create";
	
	/**
	 * 任务动作类型：入库
	 */
	public static final String TASK_ACTION_TYPE_INPUT = "input";
	
	/**
	 * 任务动作类型：出库
	 */
	public static final String TASK_ACTION_TYPE_OUTPUT = "output";
	
	/**
	 * 任务动作类型：执行
	 */
	public static final String TASK_ACTION_TYPE_EXECUTE = "execute";
	/****************************** 任务动作类型 END ******************************/
	
	/*************************** 任务/子任务执行状态 STA ***************************/
	/**
	 * 任务/子任务执行状态：未知
	 */
	public static final String TASK_STATUS_UNKNOWN = "unknown";
	/**
	 * 任务/子任务执行状态：未创建
	 */
	public static final String TASK_STATUS_CREATE_NO = "create_no";
	/**
	 * 任务/子任务执行状态：创建成功
	 */
	public static final String TASK_STATUS_CREATE_SUCCESS = "create_success";

	/**
	 * 任务/子任务执行状态：创建中
	 */
	public static final String TASK_STATUS_CREATE_RUNNING = "create_running";

	/**
	 * 任务/子任务执行状态：创建失败
	 */
	public static final String TASK_STATUS_CREATE_FAILURE = "create_failure";
	
	/**
	 * 任务/子任务执行状态：未入库
	 */
	public static final String TASK_STATUS_INPUT_NO = "input_no";
	
	/**
	 * 任务/子任务执行状态：入库成功
	 */
	public static final String TASK_STATUS_INPUT_SUCCESS = "input_success";

	/**
	 * 任务/子任务执行状态：入库中
	 */
	public static final String TASK_STATUS_INPUT_RUNNING = "input_running";

	/**
	 * 任务/子任务执行状态：入库失败
	 */
	public static final String TASK_STATUS_INPUT_FAILURE = "input_failure";
	
	/****************************** 任务执行状态 END ******************************/

	/***************************** 子任务关联状态 STA *****************************/
	/**
	 * 子任务关联状态：创建任务
	 */
	public static final int SUBTASK_STATUS_CREATE = 1;

	/**
	 * 子任务关联状态：执行中
	 */
	public static final int SUBTASK_STATUS_RUNNING = 2;
	
	/**
	 * 子任务关联状态：任务中止,未完成
	 */
	public static final int SUBTASK_STATUS_STOP = 3;
	
	/**
	 * 子任务关联状态：任务未执行，被取消
	 */
	public static final int SUBTASK_STATUS_CANCEL = 4;
	
	/**
	 * 子任务关联状态：任务完成
	 */
	public static final int SUBTASK_STATUS_DONE = 5;
	
	/**
	 * 子任务关联状态：任务超时
	 */
	public static final int SUBTASK_STATUS_TIMEOUT = 6;

	/**
	 * 子任务关联状态：任务失败
	 */
	public static final int SUBTASK_STATUS_FAILE = 7;
	/***************************** 子任务关联状态 END *****************************/
	
	/******************************** 订单类型 STA ********************************/
	/**
	 * 订单类型：创建类型订单
	 */
	public static final String ORDER_TYPE_CREATE = "create";
	/******************************** 订单类型 END ********************************/

	/******************************** 订单状态 STA ********************************/
	/**
	 * 订单状态：未审批
	 */
	public static final String ORDER_STATUS_UNAPPROVED = "unapproved";
	/**
	 * 订单状态：审批通过
	 */
	public static final String ORDER_STATUS_APPROVED = "approved";
	/**
	 * 订单状态：审批拒绝
	 */
	public static final String ORDER_STATUS_UNAPPROVE = "unapprove";
	/**
	 * 订单状态：已执行
	 */
	public static final String ORDER_STATUS_EXECUTED = "executed";
	/******************************** 订单状态 END ********************************/
}
