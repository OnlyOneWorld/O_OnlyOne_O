package com.matter.lifePlan.userLogin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matter.lifePlan.userLogin.dao.UserLoginDao;
import com.matter.lifePlan.userLogin.service.UserLoginService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-14 上午11:48:39 
 * 类说明 
 */
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {

	/**
	 * 注入用户登陆Dao
	 */
	@Autowired
	private UserLoginDao userLoginDao;
	
	@Override
	public boolean checkLoginUser(String hql, String userName,
			String userPassword) {
		
		//返回检查用户结果
		return userLoginDao.checkLoginUser(hql, userName, userPassword);
	}

}
