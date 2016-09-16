package com.dateutil;

import java.util.Date;

import org.junit.Test;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-9 下午9:07:43 
 * 类说明 
 */
public class DateUtilTest {

	DateUtil du = new DateUtil();
	
	@Test
	public void test1()
	{
		//(new Date()).toString()
//		du.formatStringToDate2("2010/11/12");
//		Date date = du.formatStrToDate((new Date()).toString());
//		
//		System.out.println(date);
		du.test("2015-12-23", "2012-11-22");
	}
}
