package com.api.dao;

import java.util.List;
import java.util.Map;

/**
 * 增删改查接口
 * 
 * @author HCK
 *
 * @param <T>
 */
public interface CrudDao<T> {

	/**
	 * 根据检索条件获取数据集合
	 * 
	 * @param param
	 * @return
	 */
	List<T> list(Map<String, Object> param);
	
	/**
	 * 获取单条数据
	 * 
	 * @param id
	 * @return
	 */
	T get(String id);

	/**
	 * 插入数据
	 * 
	 * @param entity
	 * @return
	 */
	int save(T entity);

	/**
	 * 更新数据
	 * 
	 * @param entity
	 * @return
	 */
	int update(T entity);

	/**
	 * 删除数据
	 * 
	 * @param id
	 * @return
	 */
	int remove(String id);
}
