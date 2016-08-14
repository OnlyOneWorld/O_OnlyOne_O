package com.matter.lifePlan.userLogin.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.base.daoImpl.BaseDaoImpl;
import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.userLogin.dao.UserLoginDao;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-14 上午10:36:45 
 * 类说明 
 */
@Repository("userLoginDao")
public class UserLoginDaoImpl extends BaseDaoImpl<Users> implements UserLoginDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean checkLoginUser(String hql,String userName, String userPassword) {
		//获取执行HQL语句的query
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		//设置检索条件
		query.setString(0, userName);
		query.setString(1, userPassword);
		
		//返回检索结果
		@SuppressWarnings("unchecked")
		List<Users> list = query.list();
		
		//获得检索出的数据条数
		int result = list.size();
		
		if(result == 1)
		{
			return true;
		}
		
		return false;
	}
}
