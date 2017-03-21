package com.api.dao;

import java.util.List;
import java.util.Map;

import com.api.entity.DefinitionSubServArchEntity;

/**
 * 子服务架构定义接口
 * 
 * @author HCK
 *
 */
public interface DefinitionSubServArchDao extends CrudDao<DefinitionSubServArchEntity> {

	/**
	 * 获取主要子服务架构
	 * 
	 * @param paramMap
	 * @return
	 */
	List<DefinitionSubServArchEntity> listPrimarySubServArch(Map<String, Object> paramMap);
}
