package java8.java.lang.string;

import java.util.HashMap;
import java.util.Hashtable;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-16 下午11:16:55 
 * 类说明 
 */
public class JavaString {
	public void testString()
	{
		/**
		 * String字符串类的构造函数一:无参数构造函数
		 * Initializes a newly created String object so that it represents an empty character sequence
		 * (初始化一个新创建的字符串对象,它代表了一个空的字符序列)
		 */
		String str = new String();
		int length_str = str.length();//这里打印的肯定是“0”,因为这是一个空的字符串
		
		/**
		 * String字符串类的构造函数二：
		 * String(byte[] bytes)
		 * Constructs a new String by decoding the specified array of bytes using the platform's default charset.
		 * String有很多构造方法<a href="http://docs.oracle.com/javase/8/docs/api/">String 的构造方法</a>
		 */
		byte bytes [] = new byte[1024];
		
		HashMap hp = new HashMap();
		Hashtable<String, String> ht = new Hashtable<>();
		
		
		
		
		
		
	}
}
