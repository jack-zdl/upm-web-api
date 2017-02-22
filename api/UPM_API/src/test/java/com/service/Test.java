package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.api.util.EncryptionUtils;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("config/applicationContext.xml");
		ThreadPoolTaskExecutor poolTaskExecutor = (ThreadPoolTaskExecutor)ctx.getBean("taskExecutor");
		System.out.println(poolTaskExecutor);
	
	}
	
	

}
