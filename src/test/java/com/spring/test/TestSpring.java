package com.spring.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.formal.service.Impl.UserServiceImpl;
import com.spring.service.UserService;
import com.spring.service.Impl.UserServiceImpl;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午9:16:19 
 * 类说明 
 */
public class TestSpring {

	//初始化业务类
	private UserService userService;
	
	@Before
	public void before()
	{
		//加载Spring配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		//从Spring容器中获得实例
		userService = (UserService)ac.getBean("userService");
		
		System.out.println("系统初始化完成......");
	}
	
	@Test
	public void test()
	{
		//调用业务类保存数据
		String data = "测试spring的IOC原理";
		
		//保存数据
		userService.save(data);
	}
	
	@Test
	public void testIoc()
	{
		
	}
	
	@After
	public void after()
	{
		System.out.println("执行完成......");
	}
}
