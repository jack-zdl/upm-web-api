package com.api.dao;

import java.util.List;
import java.util.Map;
import com.api.entity.DefinitionSubServEntity;

/**
 * 子服务定义接口
 * 
 * @author HCK
 *
 */
public interface DefinitionSubServDao extends CrudDao<DefinitionSubServEntity> {

	/**
	 * 获取子服务定义名和图标
	 * 
	 * @param paramMap
	 *            检索条件
	 * @return
	 */
	List<DefinitionSubServEntity> listNameAndIcon(Map<String, Object> paramMap);
}
