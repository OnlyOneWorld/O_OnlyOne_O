package com.matter.lifePlan.user_register.style_one.dao;

import java.io.Serializable;

import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:13:00 
 * 类说明 
 */
public interface UserRegisterDaoOne {

	/**
	 * 持久化用户
	 * @param user
	 * @parameter
	 */
	public Serializable save(Users user);
}
