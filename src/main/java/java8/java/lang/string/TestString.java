package java8.java.lang.string;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-17 上午12:25:53 
 * 类说明 
 */
public class TestString {

	/**
	 * @param args
	 * @parameter 
	 */
	public static void main(String[] args) {

		String str = "abc";
		System.out.println("str = "+str+"    str.hashCode() = "+str.hashCode());
		
		str = str+"def";
		System.out.println("将原来的str改变为: "+str);
		System.out.println("str = "+str+"    str.hashCode() = "+str.hashCode());
		//String测试打印的结果如下：
		//str = abc    str.hashCode() = 96354
		//将原来的str改变为: abcdef
		//str = abcdef    str.hashCode() = -1424385949
		//这里两个HashCode是不一样的，代表每一次改变都是创建了新的字符串。
		
		
		//测试stringBuffer的使用
		System.out.println();
		System.out.println();
		System.out.println("==========这是测试StringBuffer的==========");
		StringBuffer sb = new StringBuffer("abc");
		System.out.println("sb = "+sb +"  sb.hashCode(): "+sb.hashCode());
		
		sb.append("def");
		System.out.println("现在改变sb为:"+sb);
		System.out.println("sb = "+sb +"  sb.hashCode(): "+sb.hashCode());
		//StringBuffer测试打印的结果如下：
		//sb = abc  sb.hashCode(): 366712642
		//现在改变sb为:abcdef
		//sb = abcdef  sb.hashCode(): 366712642
		//这里打印的两个hashCode是一样的，代表是同一个字符串，而不是创建了新的字符串
		
		//测试StringBuilder的使用
		System.out.println();
		System.out.println();
		System.out.println("==========这是测试StringBuilder的==========");
		StringBuilder sb1 = new StringBuilder("abc");
		System.out.println("sb = "+sb1 +"  sb.hashCode(): "+sb1.hashCode());
		
		sb.append("def");
		System.out.println("现在改变sb为:"+sb1);
		System.out.println("sb = "+sb1 +"  sb.hashCode(): "+sb1.hashCode());
		//==========这是测试StringBuilder的==========
		//sb = abc  sb.hashCode(): 1829164700
		//现在改变sb为:abc
		//sb = abc  sb.hashCode(): 1829164700
		
		//反思：为什么有了StringBuffer还要用StringBuilder呢：
		/*
		网上同仁的总结：http://blog.csdn.net/mad1989/article/details/26389541

		String、StringBuffer、StringBuilder区别
		StringBuffer、StringBuilder和String一样，也用来代表字符串。String类是不可变类，任何对String的改变都 会引发新的String对象的生成；
		StringBuffer则是可变类，任何对它所指代的字符串的改变都不会产生新的对象。既然可变和不可变都有了，为何还有一个StringBuilder呢？相
		信初期的你，在进行append时，一般都会选择StringBuffer吧！

		先说一下集合的故事，HashTable是线程安全的，很多方法都是synchronized方法，而HashMap不是线程安全的，但其在单线程程序中的性能比
		HashTable要高。StringBuffer和StringBuilder类的区别也是如此，他们的原理和操作基本相同，区别在于StringBufferd支持并发操作，线性
		安全的，适 合多线程中使用。StringBuilder不支持并发操作，线性不安全的，不适合多线程中使用。新引入的StringBuilder类不是线程安全的，
		但其在单线程中的性能比StringBuffer高。
		*/
		
		/*
		什么是线程安全？
		
		      就是线程同步的意思，就是当一个程序对一个线程安全的方法或者语句进行访问的时候，其他的不能再对他进行操作了，必须等到这次访问结束以后才能对这个线程安全的方法进行访问
		
		什么叫线程安全：
		     如果你的代码所在的进程中有多个线程在同时运行，而这些线程可能会同时运行这段代码。如果每次运行结果和单线程运行的结果是一样的，而且其他的变量的值也和预期的是一样的，就是线程安全的。 
		  或者说:一个类或者程序所提供的接口对于线程来说是原子操作或者多个线程之间的切换不会导致该接口的执行结果存在二义性,也就是说我们不用考虑同步的问题。
		  线程安全问题都是由全局变量及静态变量引起的。
		  若每个线程中对全局变量、静态变量只有读操作，而无写操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般都需要考虑线程同步，否则就可能影响线程安全。
		*/
	}

}
