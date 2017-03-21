package com.api.dao;

import java.util.List;
import java.util.Map;

import com.api.entity.DefinitionSubServUnitScaleEntity;

/**
 * 子服务单元规模定义接口
 * 
 * @author HCK
 *
 */
public interface DefinitionSubServUnitScaleDao extends CrudDao<DefinitionSubServUnitScaleEntity> {
	
	/**
	 * 获取主要子服务单元规模
	 * 
	 * @param paramMap
	 * @return
	 */
	List<DefinitionSubServUnitScaleEntity> listPrimarySubServUnitScale(Map<String, Object> paramMap);
}
