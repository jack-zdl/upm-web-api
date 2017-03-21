package com.api.dao;

import com.api.entity.OrderEntity;

/**
 * ¶©µ¥½Ó¿Ú
 * 
 * @author HCK
 *
 */
public interface OrderDao extends CrudDao<OrderEntity> {

	int updateStatus(OrderEntity order);
}
