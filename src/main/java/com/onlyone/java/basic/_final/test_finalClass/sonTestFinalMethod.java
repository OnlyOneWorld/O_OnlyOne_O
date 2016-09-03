package com.onlyone.java.basic._final.test_finalClass;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-31 下午11:32:30 
 * 类说明 
 */
public class sonTestFinalMethod extends testFinalMethod {
	
//	@Override
	//不可以重写父类中的final方法
	public String sayHelloW()
	{
		return "";
	}
	//对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。
	private final int i = 10;//声明一个final类型的常量
	
	//在方法中尝试修改这个final常量
	public void changeFinalValue()
	{
		//i = 19;//The final field sonTestFinalMethod.i cannot be assigned
	}
}
