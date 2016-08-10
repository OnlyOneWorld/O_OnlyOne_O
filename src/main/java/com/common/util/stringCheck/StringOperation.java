package com.common.util.stringCheck;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-10 下午9:53:26 
 * 类说明 :这个util类用于字符串进行判断，判断为空等操作。
 */
public class StringOperation {
	
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

}
