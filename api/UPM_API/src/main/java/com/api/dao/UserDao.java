package com.api.dao;

import java.util.Map;

import com.api.entity.UserEntity;

/**
 * 用户接口
 * 
 * @author HCK
 *
 */
public interface UserDao {

	/**
	 * 获取用户信息
	 * 
	 * @param param
	 * @return
	 */
	public UserEntity getUser(Map<String, Object> param);
	
	/**
	 * 更新用户最后登录时间
	 * 
	 * @param user
	 */
	public void updateLatestLoginDateTime(UserEntity user);
}
