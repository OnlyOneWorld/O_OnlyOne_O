package com.matter.lifePlan.service;

import java.io.Serializable;

import com.common.base.dao.BaseDao;
import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-7 下午6:54:24 
 * 类说明 
 */
public interface UserService{

	//保存用户
	public Serializable save(Users user);
	
	//通过邮箱获取用户
	public int getUserByUserEmail(String sql,String condition);
}
