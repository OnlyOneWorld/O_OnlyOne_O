package com.matter.lifePlan.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.common.base.dao.BaseDao;
import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-7 下午6:15:55 
 * 类说明 
 */
// extends BaseDao<Users> 
public interface UsersDao{
	//保存用户
	public Serializable saveUsers(Users users);
	
	//通过邮箱获取用户
	public int getUserByUserEmail(String sql,String condition);
}
