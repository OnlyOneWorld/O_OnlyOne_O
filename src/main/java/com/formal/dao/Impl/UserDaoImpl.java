package com.formal.dao.Impl;

import com.formal.dao.UserDao;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午7:43:21 
 * 类说明 
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(String data) {
		System.out.println("保存的数据:"+data);
	}

}
