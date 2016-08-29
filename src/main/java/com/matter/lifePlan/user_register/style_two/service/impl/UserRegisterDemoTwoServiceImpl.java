package com.matter.lifePlan.user_register.style_two.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.user_register.style_two.dao.UserRegisterDemoTwoDao;
import com.matter.lifePlan.user_register.style_two.service.UserRegisterDemoTwoService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-30 上午12:20:55 
 * 类说明 
 */
@Service("userRegisterDemoTwoService")
public class UserRegisterDemoTwoServiceImpl implements UserRegisterDemoTwoService {

	//注入userDao
	@Autowired
	private UserRegisterDemoTwoDao userRegisterDemoTwoDao;
	
	@Override
	public Serializable save(Users user) {
		//service调用dao的方法持久化用户实体
		return userRegisterDemoTwoDao.save(user);
	}
}
