package com.common.util.dateFormat.formatDate;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.interceptor.annotations.After;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-10 下午9:31:56 
 * 类说明 :这个类用于对util日期类进行单体测试
 * 
 */
public class JunitDateFormat {

	DateFormat df = new DateFormat();
	
	@Before
	public void before()
	{
		//初始化日期格式化类
		System.out.println("日期格式化开始: ");
	}
	
	@After
	public void after()
	{
		System.out.println("日期格式化完毕！");
	}
	
	//将日期格式化类测试
	@Test
	public void getStringDate()
	{
		Date testDate = new Date();
		
//		String strDate = testDate.toString();
		
		//调用格式化函数
		String formatedDate = df.getStringDateWithBar(testDate);
		System.out.println("formatedDate: "+formatedDate);
		
		//设置用户注册id，自动生成
		
	}
	
	
}
