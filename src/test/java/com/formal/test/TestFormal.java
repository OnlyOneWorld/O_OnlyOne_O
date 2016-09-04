package com.formal.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.formal.service.UserService;
import com.formal.service.Impl.UserServiceImpl;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午7:52:50 
 * 类说明 
 */
public class TestFormal {

	//实例化一个Service类
	private UserService userService;
	
	@Before
	public void before()
	{
		userService = new UserServiceImpl();
		
		System.out.println("初始化完成......");
	}
	
	@After
	public void after()
	{
		System.out.println("程序执行完成......");
	}
	
	@Test
	public void test()
	{
		String data = "这是模拟保存的数据...";
		//调用save方法保存数据
		userService.save(data);
	}
}
