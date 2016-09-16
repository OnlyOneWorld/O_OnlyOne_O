package com.springIoc.service.Impl;

import com.springIoc.dao.TestInjectionDao;
import com.springIoc.service.TestInjectionService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-5 下午3:01:48 
 * 类说明 
 */
public class TestInjectionServiceImpl implements TestInjectionService {

	//设值注入开始...............................................
	//引入dao
	private TestInjectionDao testInjectionDao;
	
	//提供setter方法用于配置设值注入
//	public void setTestInjectionDao(TestInjectionDao testInjectionDao) {
//		this.testInjectionDao = testInjectionDao;
//	}
	//设值注入结束...............................................
	
	//构造注入开始...............................................
	public TestInjectionServiceImpl(TestInjectionDao testInjectionDao)
	{
		this.testInjectionDao = testInjectionDao;
	}
	//构造注入结束...............................................
	
	@Override
	public void save(String data) {
		System.out.println("接收的参数为: "+data);
		
		//处理业务逻辑
		data = data+":"+data.hashCode();
		
		//调用DAO层保存数据
		testInjectionDao.save(data);//--->配置applicationContext.xml配置文件
	}

	
}
