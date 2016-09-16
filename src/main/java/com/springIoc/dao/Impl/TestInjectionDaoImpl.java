package com.springIoc.dao.Impl;

import com.springIoc.dao.TestInjectionDao;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-5 下午2:58:06 
 * 类说明 
 */
public class TestInjectionDaoImpl implements TestInjectionDao{

	@Override
	public void save(String data) {
		System.out.println("保存的数据: "+data);
		
	}

	
}
