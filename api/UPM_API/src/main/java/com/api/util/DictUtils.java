package com.api.util;

import java.util.List;

import com.api.entity.DictEntity;
import com.api.entity.DictTypeEntity;

/**
 * 字典工具类
 * 
 * @author HCK
 *
 */
public class DictUtils {

	/**
	 * 根据字典类型项编码和字典类型编码从字典类型项集合中获取字典类型对象
	 * 
	 * @param dictTypeList
	 * @param dictTypeCode
	 * @param dictCode
	 * @return
	 */
	public DictEntity getDict(List<DictTypeEntity> dictTypeList, String dictTypeCode, String dictCode) {
		if (dictTypeList == null) {
			return null;
		}
		for (DictTypeEntity dictType : dictTypeList) {
			if (dictType.getCode().equals(dictTypeCode)) {
				List<DictEntity> dictList = dictType.getDictList();
				for (DictEntity dict : dictList) {
					return dict;
				}
				return null;
			}
		}
		return null;
	}
}
