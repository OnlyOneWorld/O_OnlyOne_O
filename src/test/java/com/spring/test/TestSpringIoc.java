package com.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.interceptor.annotations.After;
import com.springIoc.service.TestInjectionService;
import com.spring_stydy.BeanOperation.BeanArea;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-5 下午3:11:23 
 * 类说明 
 */
public class TestSpringIoc {

	private ApplicationContext ac;
	
	private TestInjectionService testInjectionService;
	
	@Before
	public void before()
	{
		//加载Spring的配置文件
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得Bean
		testInjectionService = (TestInjectionService) ac.getBean("testInjectionService");
		System.out.println("初始化完成......");
	}
	
	@Test
	public void testSpringIoc()
	{
		String data = "我是测试数据...";
		//测试数据
		testInjectionService.save(data);
	}
	
	@Test
	public void testBeanScope()
	{
		//加载Spring配置文件
		ApplicationContext appc = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BeanArea ba = (BeanArea) appc.getBean("testSpringBeanArea"); 
		
		BeanArea ba2 = (BeanArea) appc.getBean("testSpringBeanArea"); 
		
		//点hashCode
		ba.testBeanArea();
		ba2.testBeanArea();
	}
	
	@After
	public void after()
	{
		
		System.out.println("执行完成....");
	}
}
