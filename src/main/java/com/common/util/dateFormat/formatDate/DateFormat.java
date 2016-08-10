package com.common.util.dateFormat.formatDate;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-10 下午9:18:27 
 * 类说明:
 * 这个类专门用于处理日期，将日期处理成各种格式：yyyy-mm-dd,yyyy/mm/dd,... 
 */
public class DateFormat {
	
	public String getStringDateWithBar(Date date)
	{
		//设置日期格式
		@SuppressWarnings("unused")
		String formatStyle = "yyyy-mm-dd";
		
		//获取SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat(formatStyle);
		
		String formatedDate = sdf.format(date);
		
		return formatedDate;
	}
	
}
