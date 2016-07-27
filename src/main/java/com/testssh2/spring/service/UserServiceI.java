package com.testssh2.spring.service;

import java.io.Serializable;

import com.testssh2.spring.model.User;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-23 下午11:55:43 
 * 类说明 
 */
public interface UserServiceI {

	/**
	 * 编写测试方法
	 * 
	 * @parameter
	 */
	public void test();
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 * @parameter
	 */
	Serializable save(User user); 
}
