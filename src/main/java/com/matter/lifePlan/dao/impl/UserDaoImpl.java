package com.matter.lifePlan.dao.impl;

//import me.gacl.dao.impl.UserDaoImpl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.base.dao.BaseDao;
import com.common.base.daoImpl.BaseDaoImpl;
import com.matter.lifePlan.dao.UsersDao;
import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-7 下午6:18:35 
 * 类说明 
 */
// extends BaseDaoImpl<Users> 
@Repository("usersDao")
public class UserDaoImpl implements UsersDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable saveUsers(Users users) {
		return sessionFactory.getCurrentSession().save(users);
	}



	
}
