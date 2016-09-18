package java8.java.map_list_set_table_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @author     : wyl 
 * @date       : 2016-9-18
 * @Description: 
 */
public class ListIterator {

	/**
	 * @param args
	 * @parameter 
	 * Java中List遍历的几种方法
	 */
	public static void main(String[] args) {
		//创建一个用于遍历的List
		List<Integer> intList = new ArrayList<Integer>();
		
		//添加一些元素
		intList.add(10);
		intList.add(11);
		intList.add(12);
		intList.add(123);
		intList.add(21);
		intList.add(43);
		intList.add(432);
		
		//第一种遍历方法
		Iterator itera  = intList.iterator();
		while(itera.hasNext()){
			int i = (int) itera.next();
			System.out.print(" "+i);
		}
		
		//换行
		System.out.println();
		//第二种遍历方式
		for(Object obj: intList){
			System.out.print(" "+obj);
		}
		
		//换行
		System.out.println();
		//第三种遍历方式
		for (int i = 0; i < intList.size(); i++) {
			int j = (int)intList.get(i);
			System.out.print(" "+j);
		}
		
		//换行
		System.out.println();
		//第四种遍历方式
		for(Iterator iter = intList.iterator();iter.hasNext();){
			int p = (int)iter.next();
			System.out.print(" "+p);
		}
	}
}
