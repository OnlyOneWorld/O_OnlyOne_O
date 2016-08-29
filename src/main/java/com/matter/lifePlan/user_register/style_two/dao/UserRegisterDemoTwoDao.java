package com.matter.lifePlan.user_register.style_two.dao;

import java.io.Serializable;

import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-30 上午12:16:05 
 * 类说明 
 */
public interface UserRegisterDemoTwoDao {
	//保存用户
	public Serializable save(Users users);
}
