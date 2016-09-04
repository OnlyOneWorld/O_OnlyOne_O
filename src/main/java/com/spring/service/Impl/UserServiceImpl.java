package com.spring.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.service.UserService;


/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午9:08:27 
 * 类说明 
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(String data) {
		//调用UserDao的save方法保存数据
		userDao.save(data);
	}
}
