package com.api.dao;

import java.util.List;

import com.api.entity.DefinitionServEntity;

/**
 * 服务定义接口
 * 
 * @author HCK
 *
 */
public interface DefinitionServDao extends CrudDao<DefinitionServEntity> {
	
	List<DefinitionServEntity> listNameAndIcon();
}
