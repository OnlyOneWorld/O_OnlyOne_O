package com.common.util.stringCheck;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.interceptor.annotations.After;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-12 下午10:32:30 
 * 类说明 
 */
public class StringOperationTest {

	//实例化测试的类
	StringOperation so = new StringOperation();
	
	@Before
	public void before()
	{
		System.out.println("开始测试....");
		
	}
	
	@After
	public void after()
	{
		System.out.println("测试完成....");
	}
	
	@Test
	public void testEmail()
	{
		//获得几个邮箱样式的字符串
		String email1 ="helloworld@163.com";
		String email2 ="hello--=@163.com";
		String email3 ="==-=---++@qq.com";
		String email4 ="test1234@.qq.ww.ee.com";
		
		//获得测试结果
		System.out.println(email1+"的测试结果:"+ so.isEmail(email1));
		System.out.println(email2+"的测试结果:"+ so.isEmail(email2));
		System.out.println(email3+"的测试结果:"+ so.isEmail(email3));
		System.out.println(email4+"的测试结果:"+ so.isEmail(email4));
		/**
		 *测试结果如下: 
		 * 开始测试....
			helloworld@163.com的测试结果:true
			hello--=@163.com的测试结果:false
			==-=---++@qq.com的测试结果:false
			test1234@.qq.ww.ee.com的测试结果:false
		 */
	}
	
	@Test
	//判定手机号码的方法测试
	public void checkPhone()
	{
		//初始化几个符合条件和不符合条件的手机号码
		String phone1 = "18817312934";
		String phone2 = "14444444444";
		String phone3 = "1112334566";
		
		//打印输出判定结果
		System.out.println(phone1+":"+so.isPhoneNumber(phone1));
		System.out.println(phone2+":"+so.isPhoneNumber(phone2));
		System.out.println(phone3+":"+so.isPhoneNumber(phone3));
		
		/*
		 * 开始测试....
		18817312934:true
		14444444444:false
		1112334566:false
		 * 
		 */
	}
}
