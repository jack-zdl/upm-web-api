package com.api.dao;

import java.util.List;
import java.util.Map;

import com.api.entity.ClusterEntity;
import com.api.entity.ClusterSubServEntity;

/**
 * 集群接口
 * 
 * @author HCK
 *
 */
public interface ClusterDao extends CrudDao<ClusterEntity> {

	int saveRelativity(ClusterSubServEntity clusterSubServ);
	
	int removeRelativity(String clusterId);
	
	List<ClusterEntity> listOrderCluster(Map<String, Object> paramMap);
}
