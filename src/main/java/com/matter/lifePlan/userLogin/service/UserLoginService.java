package com.matter.lifePlan.userLogin.service;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-14 上午11:45:23 
 * 类说明 
 */
public interface UserLoginService {
	//用户登陆验证方法
	public boolean checkLoginUser(String hql,String userName,String userPassword);
}
