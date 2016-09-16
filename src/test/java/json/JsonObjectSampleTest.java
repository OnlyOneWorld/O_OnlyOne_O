package json;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-6 下午9:50:13 
 * 类说明 
 */
public class JsonObjectSampleTest {

	//初始化
	JsonObjectSample jos;
	
	@Before
	public void before()
	{
		//获得实例化对象
		jos = new JsonObjectSample();
		
		System.out.println("Json使用开始......");
	}
	
	@After
	public void after()
	{
		System.out.println("Json使用结束......");
	}
	
	@Test
	public void testJson()
	{
		//调用方法打印实例化的Json信息
		jos.jsonObject();
		
	}
}
