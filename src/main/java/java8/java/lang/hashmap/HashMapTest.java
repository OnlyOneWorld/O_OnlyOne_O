package java8.java.lang.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {


	public static void main(String[] args) {

		/**
		 * 测试HashMap、HashTable的区别与联系
		 * 博客地址：http://blog.csdn.net/wu631464569/article/details/52563681
		 */
		testHashTable();
		testHashMap();
	}
	
	/**
	 * 测试Hashtable的性能
	 * 
	 * @parameter
	 */
	public static void testHashTable()
	{
		//获得当前时间戳
		long time1 = System.currentTimeMillis();
		
		//实例化一个Hashtable实例
		Hashtable<Integer,Object> hashTable = new Hashtable<Integer,Object>();
		
		//获得一个String数组
		String[] str = new String[]{"Tom","Jack","Jim","David","Jackson","Tomsin","Voidc","Mission","Limn","liuHasi"};
		
		//将sb的数据放入hashTable中:调用Hashtable的put方法
		for (int j = 0; j < 10000; j++) {
			for (int i = 0; i < str.length; i++) {
				hashTable.put(i, str[i]);
			}
			
		}
		//获得程序执行之后的时间
		long time2 = System.currentTimeMillis();
		
		//打印执行hashTable的put方法的时间差
		System.out.println("执行HashTable的put方法的时间为: "+(time2 - time1));
	}
	
	/**
	 * 测试HashMap的性能
	 * 
	 * @parameter
	 */
	public static void testHashMap()
	{
		//获得当前时间戳
		long time1 = System.currentTimeMillis();
		
		//实例化一个Hashtable实例
		HashMap<Integer,Object> hashMap = new HashMap<Integer,Object>();
		
		//获得一个String数组
		String[] str = new String[]{"Tom","Jack","Jim","David","Jackson","Tomsin","Voidc","Mission","Limn","liuHasi"};
		
		//将sb的数据放入hashTable中:调用Hashtable的put方法
		for (int j = 0; j < 10000; j++) {
			for (int i = 0; i < str.length; i++) {
				hashMap.put(i, str[i]);
			}
		}

		//获得程序执行之后的时间
		long time2 = System.currentTimeMillis();
		
		//打印执行hashTable的put方法的时间差
		System.out.println("执行HashMap的put方法的时间为: "+(time2 - time1));
	}
}
