package com.api.util;

import java.util.UUID;

/**
 * 主键处理工具类
 * 
 * @author HCK
 *
 */
public class PrimaryKeyUtils {

	/**
	 * uuid
	 * 
	 * @return
	 */
	public static String uniqueId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().trim().replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueId());
		System.out.println(uniqueId());
		System.out.println(uniqueId());
		System.out.println(uniqueId());
		System.out.println(uniqueId());
		System.out.println(uniqueId());
	}
}
