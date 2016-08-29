package com.matter.lifePlan.user_register.style_one.service;

import java.io.Serializable;

import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:15:42 
 * 类说明 
 */
public interface UserRegisterServiceOne {

	/**
	 * 持久化用户
	 * @param user
	 * @return
	 * @parameter
	 */
	public Serializable save(Users user);
}
