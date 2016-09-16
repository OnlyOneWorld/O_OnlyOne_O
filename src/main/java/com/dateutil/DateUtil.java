package com.dateutil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-9 下午8:53:10 
 * 类说明 
 */
public class DateUtil {

	public Date formatStringToDate(final String strDate){
		
		//获得日期格式化
		DateFormat df = new SimpleDateFormat("yyyy:MM:dd");
		
		try {
			Date date = df.parse(strDate);
			System.out.println("参数类型:"+date.getClass()+"  具体值: "+date);
			
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Date formatStrToDate(final String strDate)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   ParsePosition pos = new ParsePosition(strDate.length());
		   Date strtodate = formatter.parse(strDate, pos);
		   return strtodate;
	}
	
	
	public Date formatStringToDate2(String strDate)
	{
		//获得格式化日期类型
		String dateType = this.getDateType(strDate);
		
		//log
		System.out.println("此时的日期格式:"+dateType);
		
		//格式化日期
		SimpleDateFormat formatter = new SimpleDateFormat(dateType);
		
		try {
			Date date = formatter.parse(strDate);
			System.out.println("参数类型:"+date.getClass()+"  具体值: "+date);
			return date;
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getDateType(String checkDate)
	{
		//初始化日期格式
		String formatType = "yyyy-MM-dd";
		
		if(checkDate.isEmpty()){
			throw new RuntimeErrorException(null, "这个玩意儿不可以为空!");
		}
		
		//判断日期格式
		if(checkDate.trim().contains(":")){
			formatType = "yyyy:MM:dd";
		}
		
		if(checkDate.trim().contains("/")){
			formatType = "yyyy/MM/dd";
		}
		
		return formatType;
	}
	
	public boolean compareDate(String date1, String date2){
		if((this.formatStringToDate2(date2).getTime()-this.formatStringToDate2(date1).getTime()) > 0){
			return false;
		}
		return true;
	}
	
	public void test(String date1, String date2)
	{
		if(this.compareDate(date1, date2)){
			System.out.println("No!");
		}else{
			System.out.println("Yes!");
		}
	}
}
