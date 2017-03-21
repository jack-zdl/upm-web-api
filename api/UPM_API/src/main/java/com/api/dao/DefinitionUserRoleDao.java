package com.api.dao;

import java.util.List;
import java.util.Map;

import com.api.entity.DefinitionUserRoleEntity;

/**
 * 用户角色定义接口
 * 
 * @author HCK
 *
 */
public interface DefinitionUserRoleDao extends CrudDao<DefinitionUserRoleEntity> {

	List<DefinitionUserRoleEntity> listPrimarySubServUserRole(Map<String, Object> paramMap);
}
