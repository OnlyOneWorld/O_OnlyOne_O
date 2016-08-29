package com.matter.lifePlan.user_register.style_two.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.user_register.style_two.dao.UserRegisterDemoTwoDao;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-30 上午12:18:47 
 * 类说明 
 */
@Repository("userRegisterDemoTwoDao")
public class UserRegisterDemoTwoDaoImpl implements UserRegisterDemoTwoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Serializable save(Users users) {
		
		//保存用户
		return sessionFactory.getCurrentSession().save(users);
	}

}
