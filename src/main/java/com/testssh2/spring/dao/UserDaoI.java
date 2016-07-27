package com.testssh2.spring.dao;

import java.io.Serializable;

import com.testssh2.spring.model.User;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-24 上午11:08:55 
 * 类说明 
 */
public interface UserDaoI {

	/**
	 * 保存用户
	 * @param user
	 * @return
	 * @parameter
	 */
	Serializable save(User user);
}
