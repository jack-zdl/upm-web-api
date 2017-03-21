package com.api.dao;

import com.api.entity.TaskEntity;

/**
 * 任务接口
 * 
 * @author HCK
 *
 */
public interface TaskDao extends CrudDao<TaskEntity> {
	
	TaskEntity getLatestTaskByObjId(String objId);

}
