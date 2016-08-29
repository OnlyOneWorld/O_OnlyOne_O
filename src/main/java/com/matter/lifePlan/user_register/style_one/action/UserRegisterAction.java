package com.matter.lifePlan.user_register.style_one.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.util.dateFormat.formatDate.DateFormat;
import com.common.util.stringCheck.StringOperation;
import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.user_register.style_one.service.UserRegisterServiceOne;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:36:53 
 * 类说明 
 */
@ParentPackage(value="demo1_userRegister")
//映射action的返回
@Action(value="registerAction",results={
		@Result(name="success",location="/jsp/oo_register/register_reply/register_success.jsp"),
		@Result(name="failure",location="/jsp/oo_register/oo_register3.jsp")})
@Namespace("/")
//@SuppressWarnings("all")
//在这里使用属性驱动的方式获取画面返回的数据
public class UserRegisterAction {
	
	/**
	 * 将用户注册服务类注入Action
	 */
	@Autowired
	private UserRegisterServiceOne userRegisterServiceOne;
	
	//获取前端画面数据并且设置getter和setter
	private String userName;
	private String userEmail;
	private String userPassword;
	private String reUserPassword;
	private String checkCode;
	private String rememberMe;

	//生成getter和setter
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getReUserPassword() {
		return reUserPassword;
	}

	public void setReUserPassword(String reUserPassword) {
		this.reUserPassword = reUserPassword;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}
	//获得用户实体对象
	Users user = new Users();
	
	//获取字符操作
	StringOperation stringOperation = new StringOperation();
	
	//设置最终返回的字符串(这里返回两个字符串,成功则返回success否则返回failure)
	String success = "success";
	
	String failure = "failure";
	
	//设置返回字符串内容
	String returnType = success;
	
	//编写action处理方法
	public String style_one_registerAction()
	{
		System.out.println("action执行开始！");
		//获取当前日期并格式化
		Date date = new Date();
		//获取日期格式化类实例
		DateFormat dateFormat = new DateFormat();
		//获得格式化日期
		String foamatedDate = dateFormat.getStringDateWithBar(date);
		
		//设置用户id
		user.setUserId(UUID.randomUUID().toString().replaceAll("_",""));
		//保存创建时间和更新时间为当前时间
		user.setUserCreateDate(foamatedDate);
		user.setUserUpdateDate(foamatedDate);
		//设置删除时间为null
		user.setUserDeleteDate(null);
		//设置用户删除标志位为0:表示未删除
		user.setUserFlag("0");
		//获取并check邮箱:邮箱格式在前端check就OK了，但是为了安全保障，前端后端都需要做check。
		if(!"".equals(getUserEmail()) || stringOperation.isEmail(getUserEmail()))
		{
			//添加用户邮箱
			user.setUserEmail(getUserEmail());
		}else{
			returnType = failure;
		}
		
		//注册时默认手机号码为null，后期再绑定
		user.setUserPhone(null);
		
		//设定用户名
		if(!"".equals(getUserName()))
		{
			user.setUserName(getUserName());
		}
		else
		{
			returnType = failure;
		}
		//保存用户
		System.out.println("user:"+user );
		userRegisterServiceOne.save(user);
		System.out.println("user:"+"请求结束！" );

		return returnType;
	}
}