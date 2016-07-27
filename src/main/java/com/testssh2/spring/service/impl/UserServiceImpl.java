package com.testssh2.spring.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testssh2.spring.dao.UserDaoI;
import com.testssh2.spring.model.User;
import com.testssh2.spring.service.UserServiceI;


/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-23 下午11:56:52 
 * 类说明 
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserDaoI userDao;
	
	public void test() {

		System.out.println("Hello world!");
	}

	public Serializable save(User user) {

		return userDao.save(user);
		
	}

}
