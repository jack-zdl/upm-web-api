package com.api.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.api.dao.DefinitionDao;
import com.api.entity.DefinitionEntity;

/**
 * 
 * 
 * @author HCK
 *
 */
@Service
public class DefinitionService {

	@Resource
	protected DefinitionDao definitionDao;

	@Cacheable("definitionCache")
	public List<DefinitionEntity> listFromCache() {
		return definitionDao.list(null);
	}

}
