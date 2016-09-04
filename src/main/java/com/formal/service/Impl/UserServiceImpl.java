package com.formal.service.Impl;

import com.formal.dao.UserDao;
import com.formal.dao.Impl.UserDaoImpl;
import com.formal.service.UserService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午7:47:40 
 * 类说明 
 */
public class UserServiceImpl implements UserService {

	//调用Dao里的userDao:但是这里的先获得相应dao的实例(传统的编程是通过new关键字获得实例的)
	private UserDao userDao;
	
	@Override
	public void save(String data) {
		//获得对象实例
		userDao = new UserDaoImpl();
		
		//调用UserDao的save方法保存数据
		userDao.save(data);
	}

}
