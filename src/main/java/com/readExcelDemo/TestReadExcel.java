package com.readExcelDemo;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-16 下午1:49:03 
 * 类说明 
 */
public class TestReadExcel {
	
	/**
	 * 
	 * @param filePath	:文件所在路径
	 * @param fileName	：文件名称
	 * @parameter
	 */
	public void getExcelFile(final String filePath, final String fileName){
		
		//组装文件地址
		String realPath = filePath+"//"+fileName;
		
		//创建一个文件对象
		File file = new File(realPath);
		
		try {
			//从文件流中获取Excel工作区对象
			Workbook workBook = Workbook.getWorkbook(file);
			
			//从工作区中取得一个表sheet的对象：这里的编号默认是从“0”开始的
			Sheet sheet = workBook.getSheet(0);
			
			//循环遍历Ecxel中的内容:获得行(row)
			for (int row = 0; row < sheet.getRows(); row++) {
				//获得列
				for (int column = 0; column < sheet.getColumns(); column++) {
					//获取对应表sheet中对应单元格的内容
					Cell cell = sheet.getCell(row, column);
					
					//打印输出单元格的内容
					System.out.print(cell.getContents() + " ");
				}
				//换行打印
				System.out.println();
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
