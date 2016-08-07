package com.matter.lifePlan.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.base.daoImpl.BaseDaoImpl;
import com.matter.lifePlan.dao.UsersDao;
import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.service.UserService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-7 下午6:55:35 
 * 类说明 
 */
@Service("usersService")
public class UserServiceImpl implements UserService{

	/**
	 * 注入usersDao
	 */
	@Autowired
	private UsersDao usersDao;

	@Override
	public Serializable save(Users users) {
		return usersDao.saveUsers(users);
	}
}
