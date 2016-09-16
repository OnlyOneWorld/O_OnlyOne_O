package com.readExcel;

import org.junit.Test;

import com.readExcelDemo.TestReadExcel;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-16 下午2:31:16 
 * 类说明 
 */
public class ReadExcelTest {

	@Test
	public void getExcelContent()
	{
		//获得类实例
		TestReadExcel testRead = new TestReadExcel();
		
		//获得路径和文件名
		String filePath = "E://Java Work//testFile";
		
		String fileName = "testReadExcel.xls";
		
		//函数调用
		testRead.getExcelFile(filePath, fileName);
		
		/*读出来的内容如下：
		 a1 b1 b2 b3 b4 b5 b6 b7 b8 b9 
		a2 b2 b3 b4 b5 b6 b7 b8 b9 b10 
		a3 b3 b4 b5 b6 b7 b8 b9 b10 b11 
		a4 b4 b5 b6 b7 b8 b9 b10 b11 b12 
		a5 b5 b6 b7 b8 b9 b10 b11 b12 b13 
		a6 b6 b7 b8 b9 b10 b11 b12 b13 b14 
		a7 b7 b8 b9 b10 b11 b12 b13 b14 b15 
		a8 b8 b9 b10 b11 b12 b13 b14 b15 b16 
		a9 b9 b10 b11 b12 b13 b14 b15 b16 b17 
		a10 b10 b11 b12 b13 b14 b15 b16 b17 b18 
		*/
	}
}
