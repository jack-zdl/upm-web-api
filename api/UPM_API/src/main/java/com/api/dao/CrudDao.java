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
	 * 根据检索条件获取记录集合
	 * 
	 * @param param
	 *            参数键值对
	 * @return 符合检索条件的记录集合
	 */
	List<T> list(Map<String, Object> param);

	/**
	 * 获取单条记录
	 * 
	 * @param id
	 *            主键
	 * @return 单条记录
	 */
	T get(String id);

	/**
	 * 保存记录
	 * 
	 * @param entity
	 *            记录实体类对象
	 * @return 保存对象条数
	 */
	int save(T entity);

	/**
	 * 更新记录
	 * 
	 * @param entity
	 *            记录实体类对象
	 * @return 更新对象条数
	 */
	int update(T entity);

	/**
	 * 删除记录
	 * 
	 * @param id
	 *            主键
	 * @return 记录对象条数
	 */
	int remove(String id);
}
