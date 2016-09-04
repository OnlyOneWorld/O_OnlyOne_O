package com.matter.lifePlan.dao.impl;

//import me.gacl.dao.impl.UserDaoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public Serializable saveUsers(Users users) {
		return sessionFactory.getCurrentSession().save(users);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getUserByUserEmail(String sql,String condition) {
		int result = 0;
		
		//执行hql语句
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		//添加执行条件
		query.setString(0, condition);
		
		//返回结果
		List<Users> list = query.list();
		
		//获得检索条数
		result = list.size();
		
		return result;
	}
}
