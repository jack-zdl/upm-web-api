package com.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

//指定bean注入的配置文件  
@ContextConfiguration(locations = { "classpath:config/applicationContext.xml" })  
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)  
public class SpringBaseCase extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void test() {
		System.out.println(threadPoolTaskExecutor);
	}

}