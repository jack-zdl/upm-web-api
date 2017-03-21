package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;

public class Test {
	
	public static void main(String[] args) throws ParseException, IOException {
//		System.out.println(String.valueOf(false));
//		
//		//封装请求参数  
//        List<NameValuePair> params = Lists.newArrayList();  
//        params.add(new BasicNameValuePair("cityEname", null));
//        params.add(new BasicNameValuePair("cityEname", "123"));
//        String str = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));
//        System.out.println(str);
//		AreaDto dto = new AreaDto();
//		dto.setName("xxxx");
//		dto.setCreateLoginUserName("yyyy");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		System.out.println(org.apache.commons.lang.StringUtils.join(list.toArray(),","));
	}
	
	

}
