package com.testajax;

import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testajax.entity.TestAjax;
import com.testajax.service.AjaxService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:30:39 
 * 类说明 
 */
public class TestAjaxJunit {

	private AjaxService as;
	//之前执行方法
	@Before
	public void before()
	{
		System.out.println("初始化开始！");
		//初始化配置文件
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				new String[] { "applicationContext.xml", "spring-hibernate.xml"});
		//获得AjaxService实例
//		AjaxService as = (AjaxService)ac.getBean("ajaxService");
	}
	
	//之后执行方法
	/**
	 * 
	 * @parameter 
	 */
	@After
	public void after()
	{
		System.out.println("执行完成，垃圾回收！");
	}
	
	//生成数据库表
	@Test
	public void genernateTable()
	{
		
		TestAjax ta = new TestAjax(UUID.randomUUID().toString().replaceAll("_", ""),"wuyanlong","我是一个好人，信不信由你！");
		
		//设置用户信息
//		ta.setId(UUID.randomUUID().toString().replace("_", ""));
//		ta.setUserName("wuyanlong");
//		ta.setText("我是一个好人，信不信由你！");
		
		as.save(ta);
	}
	
	
	@Test
	public void test1()
	{
		int i = 10;
		while(i>0){
			i=i+1;
			if(i==10){
				System.out.println("i= "+i);
				break;
			}
		}
	}
}
