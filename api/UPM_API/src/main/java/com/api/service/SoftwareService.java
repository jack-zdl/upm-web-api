package com.api.service;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONArray;
import com.api.dao.DefinitionSubServSoftwareDao;
import com.api.dto.DefinitionSubServSoftwareDto;
import com.api.entity.DefinitionSubServSoftwareEntity;
import com.api.exception.APIException;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 软件管理业务处理类
 * 
 * @author HCK
 *
 */
@Service
public class SoftwareService extends BaseService {

	@Resource
	private DefinitionSubServSoftwareDao definitionSubServSoftwareDao;

	/**
	 * 获取软件列表
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	@Override
	public RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			List<DefinitionSubServSoftwareEntity> definitionSubServSoftwareList = definitionSubServSoftwareDao.list(param);
			JSONArray jsonArray = new JSONArray();
			for (DefinitionSubServSoftwareEntity software : definitionSubServSoftwareList) {
				DefinitionSubServSoftwareDto softwareDto = new DefinitionSubServSoftwareDto();
				softwareDto.setId(software.getId());
				softwareDto.setName(software.getDefinitionSubServ().getName());
				softwareDto.setIcon(software.getDefinitionSubServ().getIcon());
				softwareDto.setMajorVersion(String.valueOf(software.getMajorVersion()));
				softwareDto.setMinorVersion(String.valueOf(software.getMinorVersion()));
				jsonArray.add(softwareDto);
			}
			return RespJsonFactory.buildSuccess(jsonArray);
		} catch (Exception e) {
			logger.error("软件查询异常", e);
			throw new APIException("软件查询异常:" + e.getMessage());
		}
	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespJson remove(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

}
