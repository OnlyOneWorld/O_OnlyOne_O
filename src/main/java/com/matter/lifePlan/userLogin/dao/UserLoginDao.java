package com.matter.lifePlan.userLogin.dao;

import com.common.base.dao.BaseDao;
import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-14 上午10:21:25 
 * 类说明 
 */
public interface UserLoginDao extends BaseDao<Users> {
	
	//用户登陆验证方法
	public boolean checkLoginUser(String hql,String userName,String userPassword);
}
