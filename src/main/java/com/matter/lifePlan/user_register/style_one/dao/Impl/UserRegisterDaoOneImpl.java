package com.matter.lifePlan.user_register.style_one.dao.Impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.user_register.style_one.dao.UserRegisterDaoOne;
import com.matter.lifePlan.user_register.style_one.service.UserRegisterServiceOne;


/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:13:12 
 * 类说明 
 */
@Repository("userRegisterDaoOne")
public class UserRegisterDaoOneImpl implements UserRegisterDaoOne {

	/**
	 * 将sessionFactory注入到注册类中
	 */
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public Serializable save(Users user) {
		//调用Hibernate持久化注册对象
		System.out.println("UserDao被请求到！");
		return sessionFactory.getCurrentSession().save(user);
	}
}
