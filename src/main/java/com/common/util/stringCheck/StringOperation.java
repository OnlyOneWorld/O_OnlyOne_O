package com.common.util.stringCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-10 下午9:53:26 
 * 类说明 :这个util类用于字符串进行判断，判断为空等操作。
 */
public class StringOperation {
	//邮箱判断正则表达式1
	final String email1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	//邮箱判定正则表达式2
	final String email2 = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
	
	//手机号码判断正则表达式1
	final String checkPhone1 = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
			
	//手机号码判断正则表达式2
	final String checkPhone2 = "";
	
	
	/**
	 * 判断字符串是不是为空操作
	 * @param str
	 * @return
	 * @parameter
	 */
	public boolean isEmpty(String str)
	{
		if(str != null || !str.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param email	：传入参数
	 * @return		返回一个布尔值，true:表示是邮箱类型，false：表示不是邮箱类型
	 * @parameter
	 */
	public boolean isEmail(String email)
	{
		//获取判定规则
		Pattern regex = Pattern.compile(email2);
		
		//判定邮箱是否合法
		Matcher matcher = regex.matcher(email);
		
		//获取判定结果
		boolean checkFlag = matcher.matches();
		
		//返回判定结果
		return checkFlag;
	}
	
	/**
	 * 判断字符串是不是手机号码
	 * @param phoneNumber
	 * @return
	 *  要更加准确的匹配手机号码只匹配11位数字是不够的，比如说就没有以144开始的号码段，
	　*　故先要整清楚现在已经开放了多少个号码段，国家号码段分配如下：
	　*　移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
	　*　联通：130、131、132、152、155、156、185、186
	　*　电信：133、153、180、189、（1349卫通）
	　*　那么现在就可以正则匹配测试了，
	 * @parameter
	 */
	public boolean isPhoneNumber(String phoneNumber)
	{
		//获取手机判定规则
		Pattern regex = Pattern.compile(checkPhone1);
		
		//判定手机是不是合法
		Matcher matcher = regex.matcher(phoneNumber);
		
		//获得判定结果
		boolean checkFlag = matcher.matches();
		
		return checkFlag;
	}
}
