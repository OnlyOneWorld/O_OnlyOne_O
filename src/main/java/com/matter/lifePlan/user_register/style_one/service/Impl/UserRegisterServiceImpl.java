package com.matter.lifePlan.user_register.style_one.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.user_register.style_one.dao.UserRegisterDaoOne;
import com.matter.lifePlan.user_register.style_one.dao.Impl.UserRegisterDaoOneImpl;
import com.matter.lifePlan.user_register.style_one.service.UserRegisterServiceOne;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:16:52 
 * 类说明 
 */
@Service("userRegisterServiceOne")
public class UserRegisterServiceImpl implements UserRegisterServiceOne {

	@Autowired
	private UserRegisterDaoOne userRegisterDaoOne;
	
	@Override
	public Serializable save(Users user) {
		//调用UserRegisterDaoOne的保存方法持久化注册对象
		System.out.println("UserService被请求到！");
		return userRegisterDaoOne.save(user);
	}
}
