package com.api.dao;

import com.api.entity.NfsBackupEntity;

/**
 * 备份存储接口
 * 
 * @author HCK
 *
 */
public interface NfsBackupDao extends CrudDao<NfsBackupEntity> {

	NfsBackupEntity getByAreaId(String areaId);
}
