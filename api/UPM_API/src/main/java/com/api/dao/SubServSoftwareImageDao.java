package com.api.dao;

import java.util.List;
import java.util.Map;

import com.api.entity.SubServSoftwareImageEntity;

/**
 * 子服务软件镜像定义接口
 * 
 * @author HCK
 *
 */
public interface SubServSoftwareImageDao extends CrudDao<SubServSoftwareImageEntity> {

	/**
	 * 获取主要子服务软件镜像版本
	 * 
	 * @param paramMap
	 * @return
	 */
	List<SubServSoftwareImageEntity> listPrimarySubServSoftwareImageVersion(Map<String, Object> paramMap);
	
	/**
	 * 获取子服务软件镜像版本
	 * 
	 * @param paramMap
	 * @return
	 */
	List<SubServSoftwareImageEntity> listSubServSoftwareImageVersion(Map<String, Object> paramMap);
}
