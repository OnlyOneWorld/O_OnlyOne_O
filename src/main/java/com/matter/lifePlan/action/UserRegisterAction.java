package com.matter.lifePlan.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.matter.lifePlan.dto.UserRegisterForm;
import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.service.UserService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-8 下午11:10:04 
 * 类说明 
 */
//编写package名字和struts.xml文件里面定义的统一
@ParentPackage("userRegister")
//编写Action
@Action(value="registerAction")
//为注册Action指定命名空间
@Namespace("/")
public class UserRegisterAction {

	/**
	 * 将UserService注入Action
	 */
	@Autowired
	private UserService userService;
	
	//用户注册dto实例化
	@SuppressWarnings("unused")//去除警告
	UserRegisterForm userRegisterForm;
	
//	private String userEmail;
//	private String userPhone;
//	private String reUserPassword;
//	private String userPassword;
//	
//	
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//
//
//	public String getUserPhone() {
//		return userPhone;
//	}
//
//
//
//	public void setUserPhone(String userPhone) {
//		this.userPhone = userPhone;
//	}
//
//
//
//	public String getReUserPassword() {
//		return reUserPassword;
//	}
//
//
//
//	public void setReUserPassword(String reUserPassword) {
//		this.reUserPassword = reUserPassword;
//	}
//
//
//
//	public String getUserPassword() {
//		return userPassword;
//	}
//
//
//
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}

	//将Users实例化进来
	private Users users;
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	
	public String userRegisterAction()
	{
		
		System.out.println("userEmail: "+getUsers().getUserEmail());
		
		return null;
	}
}
