package com.api.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.api.constant.DictTypeConstants;
import com.api.dto.SelectDto;
import com.api.service.SelectService;

/**
 * SELECT控件内容获取
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("v1.0/selections")
public class SelectController {

	@Resource
	private SelectService selectService;

	/**
	 * 【站点】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "sites", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listSite(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listSite(paramMap);
	}

	/**
	 * 【区域】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "areas", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listArea(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listArea(paramMap);
	}

	/**
	 * 【备份存储】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "nfs-backups", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listNfsBackup(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listNfsBackup(paramMap);
	}

	/**
	 * 【集群】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "clusters", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listCluster(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listCluster(paramMap);
	}

	/**
	 * 【软件】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "softwares", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listSoftware(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listSoftware(paramMap);
	}
	
	/**
	 * 【软件版本】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "softwares/versions", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listSoftwareVersion(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listSoftwareVersion(paramMap);
	}
	
	/**
	 * 【主要子服务软件镜像版本】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "softwares/primary-image-versions", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listPrimaryImageVersion(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listPrimaryImageVersion(paramMap);
	}
	
	/**
	 * 【子服务软件镜像版本】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "softwares/image-versions", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listImageVersion(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listImageVersion(paramMap);
	}

	/**
	 * 【服务】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "servs", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listServ(HttpServletRequest request) {
		return selectService.listServ();
	}
	
	/**
	 * 【用户角色】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "primary-roles", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listPrimarySubServUserRole(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listPrimarySubServUserRole(paramMap);
	}

	/**
	 * 【主要子服务架构】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "primary-archs", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listPrimarySubServArch(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listPrimarySubServArch(paramMap);
	}

	/**
	 * 【主要子服务单元规模】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param paramMap
	 *            请求参数
	 * @return SELECT列表
	 */
	@RequestMapping(value = "primary-scales", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listPrimarySubServUnitScale(HttpServletRequest request, @RequestParam Map<String, Object> paramMap) {
		return selectService.listPrimarySubServUnitScale(paramMap);
	}

	/**
	 * 【存储类型】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "storage-types", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listStorageType(HttpServletRequest request) {
		return selectService.list(DictTypeConstants.STORAGE_TYPE);
	}

//	/**
//	 * 【网段类型】
//	 * 
//	 * @param request
//	 *            HttpServletRequest对象
//	 * @return SELECT列表
//	 */
//	@RequestMapping(value = "networking-types", method = RequestMethod.GET)
//	@ResponseBody
//	public List<SelectDto> listNetworkingType(HttpServletRequest request) {
//		return selectService.list(DictTypeConstants.NETWORKING_TYPE);
//	}
	
	/**
	 * 【网卡类型】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "nic-phy-types", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listNicPhyType(HttpServletRequest request) {
		return selectService.list(DictTypeConstants.NIC_PHY_TYPE);
	}
	
	/**
	 * 【数据目录类型】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "data-dir-types", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listdataDirType(HttpServletRequest request) {
		return selectService.list(DictTypeConstants.DATADIR_TYPE);
	}
	
	/**
	 * 【日志目录类型】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @return SELECT列表
	 */
	@RequestMapping(value = "log-dir-types", method = RequestMethod.GET)
	@ResponseBody
	public List<SelectDto> listLogDirType(HttpServletRequest request) {
		return selectService.list(DictTypeConstants.LOGDIR_TYPE);
	}
	
}
