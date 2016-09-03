package com.onlyone.java.basic._final.test_finalClass;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-31 下午11:18:08 
 * 类说明 
 */
//在一个类中，如果将一个方法设置为Final类型之后，这个方法是不可以被子类重写覆盖的
public class testFinalMethod {
	private String username;
	
	private String age;
	
	public final String saHello()
	{
		System.out.println("Hello world!");
		
		return "hello";
	}

	public final String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}
}
