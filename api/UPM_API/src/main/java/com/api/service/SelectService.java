package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.api.dao.AreaDao;
import com.api.dao.ClusterDao;
import com.api.dao.DefinitionUserRoleDao;
import com.api.dao.DefinitionServDao;
import com.api.dao.DefinitionSubServArchDao;
import com.api.dao.DefinitionSubServDao;
import com.api.dao.DefinitionSubServSoftwareDao;
import com.api.dao.DefinitionSubServUnitScaleDao;
import com.api.dao.NfsBackupDao;
import com.api.dao.SiteDao;
import com.api.dao.SubServSoftwareImageDao;
import com.api.dto.SelectDto;
import com.api.entity.AreaEntity;
import com.api.entity.ClusterEntity;
import com.api.entity.DefinitionUserRoleEntity;
import com.api.entity.DefinitionServEntity;
import com.api.entity.DefinitionSubServArchEntity;
import com.api.entity.DefinitionSubServEntity;
import com.api.entity.DefinitionSubServSoftwareEntity;
import com.api.entity.DefinitionSubServUnitScaleEntity;
import com.api.entity.DictEntity;
import com.api.entity.DictTypeEntity;
import com.api.entity.NfsBackupEntity;
import com.api.entity.SiteEntity;
import com.api.entity.SubServSoftwareImageEntity;

/**
 * SELECT控件内容获取
 * 
 * @author HCK
 *
 */
@Service("selectService")
public class SelectService {

	@Resource
	private DictTypeService dictTypeService;
	
	@Resource
	private SiteDao siteDao;

	@Resource
	private AreaDao areaDao;
	
	@Resource
	private NfsBackupDao nfsBackupDao;
	
	@Resource
	private ClusterDao clusterDao;
	
	@Resource
	private DefinitionServDao definitionServDao;

	@Resource
	private DefinitionSubServDao definitionSubServDao;
	
	@Resource
	private DefinitionSubServSoftwareDao definitionSubServSoftwareDao;
	
	@Resource
	private DefinitionSubServArchDao definitionSubServArchDao;
	
	@Resource
	private DefinitionSubServUnitScaleDao definitionSubServUnitScaleDao;
	
	@Resource
	private SubServSoftwareImageDao subServSoftwareImageDao;
	
	@Resource
	private DefinitionUserRoleDao definitionUserRoleDao;
	
	/**
	 * 站点SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 站点集合
	 */
	public List<SelectDto> listSite(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<SiteEntity> siteList = siteDao.list(paramMap);
		for (SiteEntity site : siteList) {
			SelectDto select = new SelectDto();
			select.setId(site.getId());
			select.setText(site.getName());
			selectList.add(select);
		}
		return selectList;
	}

	/**
	 * 区域SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 区域集合
	 */
	public List<SelectDto> listArea(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<AreaEntity> areaList = areaDao.list(paramMap);
		for (AreaEntity area : areaList) {
			SelectDto select = new SelectDto();
			select.setId(area.getId());
			select.setText(area.getName());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 备份存储SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 备份存储集合
	 */
	public List<SelectDto> listNfsBackup(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<NfsBackupEntity> backupList = nfsBackupDao.list(paramMap);
		for (NfsBackupEntity nfsBackup : backupList) {
			SelectDto select = new SelectDto();
			select.setId(nfsBackup.getId());
			select.setText(nfsBackup.getName());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 集群SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 集群集合
	 */
	public List<SelectDto> listCluster(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<ClusterEntity> clusterlist = clusterDao.list(paramMap);
		for (ClusterEntity cluster : clusterlist) {
			SelectDto select = new SelectDto();
			select.setId(cluster.getId());
			select.setText(cluster.getName());
			selectList.add(select);
		}
		return selectList;
	}

	/**
	 * 软件SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 软件集合
	 */
	public List<SelectDto> listSoftware(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionSubServEntity> definitionSubServList = definitionSubServDao.listNameAndIcon(null);
		for (DefinitionSubServEntity definitionSubServ : definitionSubServList) {
			SelectDto select = new SelectDto();
			select.setId(definitionSubServ.getId());
			select.setText(definitionSubServ.getName());
			select.setIcon(definitionSubServ.getIcon());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 软件版本SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 软件集合
	 */
	public List<SelectDto> listSoftwareVersion(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionSubServSoftwareEntity> definitionSubServSoftwareList = definitionSubServSoftwareDao.list(paramMap);
		for (DefinitionSubServSoftwareEntity definitionSubServSoftware : definitionSubServSoftwareList) {
			SelectDto select = new SelectDto();
			select.setId(definitionSubServSoftware.getId());
			select.setText(definitionSubServSoftware.getMajorVersion() + "." + definitionSubServSoftware.getMinorVersion());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 主要子服务镜像版本SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 镜像版本集合
	 */
	public List<SelectDto> listPrimaryImageVersion(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<SubServSoftwareImageEntity> subServSoftwareImageList = subServSoftwareImageDao
				.listPrimarySubServSoftwareImageVersion(paramMap);
		for (SubServSoftwareImageEntity subServSoftwareImage : subServSoftwareImageList) {
			SelectDto select = new SelectDto();
			select.setId(subServSoftwareImage.getId());
			String imageVersion = subServSoftwareImage.getDefinitionSubServSoftware().getMajorVersion() + "."
					+ subServSoftwareImage.getDefinitionSubServSoftware().getMinorVersion() + "."
					+ subServSoftwareImage.getPatchVersion();
			select.setText(imageVersion);
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 主要子服务架构SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 架构集合
	 */
	public List<SelectDto> listPrimarySubServArch(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionSubServArchEntity> definitionSubServArchList = definitionSubServArchDao.listPrimarySubServArch(paramMap);
		for (DefinitionSubServArchEntity definitionSubServArch : definitionSubServArchList) {
			SelectDto select = new SelectDto();
			select.setId(definitionSubServArch.getId());
			select.setText(definitionSubServArch.getName());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 主要子服务单元规模SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 规模集合
	 */
	public List<SelectDto> listPrimarySubServUnitScale(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionSubServUnitScaleEntity> definitionSubServUnitScaleList = definitionSubServUnitScaleDao.listPrimarySubServUnitScale(paramMap);
		for (DefinitionSubServUnitScaleEntity definitionSubServUnitScale : definitionSubServUnitScaleList) {
			SelectDto select = new SelectDto();
			select.setId(definitionSubServUnitScale.getId());
			select.setText(definitionSubServUnitScale.getName());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 子服务软件镜像版本SELECT内容获取
	 * 
	 * @param paramMap
	 *            请求参数
	 * @return 镜像版本集合
	 */
	public List<SelectDto> listImageVersion(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<SubServSoftwareImageEntity> subServSoftwareImageList = subServSoftwareImageDao
				.listSubServSoftwareImageVersion(paramMap);
		for (SubServSoftwareImageEntity subServSoftwareImage : subServSoftwareImageList) {
			SelectDto select = new SelectDto();
			select.setId(subServSoftwareImage.getId());
			String imageVersion = subServSoftwareImage.getDefinitionSubServSoftware().getMajorVersion() + "."
					+ subServSoftwareImage.getDefinitionSubServSoftware().getMinorVersion() + "."
					+ subServSoftwareImage.getPatchVersion();
			select.setText(imageVersion);
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 服务SELECT内容获取
	 * 
	 * @return 服务集合
	 */
	public List<SelectDto> listServ() {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionServEntity> definitionServList = definitionServDao.listNameAndIcon();
		for (DefinitionServEntity definitionServ : definitionServList) {
			SelectDto select = new SelectDto();
			select.setId(definitionServ.getId());
			select.setText(definitionServ.getName());
			select.setIcon(definitionServ.getIcon());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * 用户角色SELECT内容获取
	 * 
	 * @return 用户角色集合
	 */
	public List<SelectDto> listPrimarySubServUserRole(Map<String, Object> paramMap) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DefinitionUserRoleEntity> definitionUserRoleList = definitionUserRoleDao.listPrimarySubServUserRole(paramMap);
		for (DefinitionUserRoleEntity definitionUserRole : definitionUserRoleList) {
			SelectDto select = new SelectDto();
			select.setId(definitionUserRole.getId());
			select.setText(definitionUserRole.getName());
			selectList.add(select);
		}
		return selectList;
	}
	
	/**
	 * SELECT控件内容获取
	 * 
	 * @param selectType
	 *            SELECT类型
	 * @return SELECT列表
	 */
	public List<SelectDto> list(String selectType) {
		List<SelectDto> selectList = new ArrayList<SelectDto>();
		List<DictTypeEntity> dictTypeList = dictTypeService.listDictTypeFromCache();
		for (DictTypeEntity dictType : dictTypeList) {
			if (dictType.getCode().equals(selectType)) {
				List<DictEntity> dictList = dictType.getDictList();
				for (DictEntity dict : dictList) {
					SelectDto select = new SelectDto();
					select.setId(dict.getCode());
					select.setText(dict.getName());
					selectList.add(select);
				}
				break;
			}
		}
		return selectList;
	}

}
