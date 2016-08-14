package com.matter.lifePlan.userLogin.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.matter.lifePlan.service.UserService;
import com.matter.lifePlan.userLogin.service.UserLoginService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-14 下午12:14:33 
 * 类说明 
 */
@ParentPackage("userLogin")
@Action(value="loginAction",results={
		@Result(name="success",location="/index.jsp"),
		@Result(name="failure",location="/jsp/login/loginFailure.jsp")})
@Namespace("/")
public class UserLoginAction {
	
	//将用户登录Service注入登录action
	@Autowired
	private UserLoginService userLoginService;
	
	//获取前端传过来的用户名和密码
	private String userEmail;
	private String userPassword;
	
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	//设置登陆反馈标志
	//登录成功
	String loginSuccess = "success";
	
	//登陆失败
	String loginFailure = "failure";
	
	public String login()
	{
		//返回标志位
		String returnFlag;
		
		//获得用户名和密码
		String userName = getUserEmail();
		String userPassword = getUserPassword();
		
		//根据获取信息检索数据库是不是有该用户
		String hql = " from Users users where users.userEmail = ? and users.userPassword = ? ";
		
		//登陆验证
		boolean flag = userLoginService.checkLoginUser(hql, userName, userPassword);

		if(flag){
			returnFlag = loginSuccess;
			
			return returnFlag;
		}else{
			returnFlag = loginFailure;
			
			return returnFlag;
		}
	}
}
