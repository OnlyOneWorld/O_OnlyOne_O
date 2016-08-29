package com.matter.lifePlan.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.common.util.dateFormat.formatDate.DateFormat;
import com.common.util.stringCheck.StringOperation;
import com.matter.lifePlan.dto.UserRegisterForm;
import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.service.UserService;
import com.matter.lifePlan.user_register.style_one.service.UserRegisterServiceOne;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-8 下午11:10:04 
 * 类说明 
 */
//编写package名字和struts.xml文件里面定义的统一
@ParentPackage("userRegister")
//编写Action
@Action(value = "_registerAction", results = { 
		@Result(name = "success", location = "/oo_index.jsp"),
		@Result(name="failure",location="/jsp/oo_register/register3.jsp")}) 
//为注册Action指定命名空间
@Namespace("/")
public class UserRegisterAction {
	/**
	 * 将UserService注入Action
	 */
	@Autowired
	private UserService usersService;
	
	//设置最终返回的字符串(这里返回两个字符串,成功则返回success否则返回failure)
	String success = "success";
	
	String failure = "failure";
	
	//将Users实例化进来
	Users users = new  Users();
	
	//获取字符串操作函数
	private String userEmail;
	private String userPhone;
	private String reUserPassword;
	private String userPassword;
	
	StringOperation stringOperation = new StringOperation();
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getReUserPassword() {
		return reUserPassword;
	}

	public void setReUserPassword(String reUserPassword) {
		this.reUserPassword = reUserPassword;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String userRegisterAction()
	{
		//设置返回字符串内容
		String returnType;
		
		//获取当前日期并格式化
		Date date = new Date();
		//获取日期格式化类实例
		DateFormat dateFormat = new DateFormat();
		//获得格式化日期
		String foamatedDate = dateFormat.getStringDateWithBar(date);
		
		//设置用户Id
		users.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		
		//检查用户输入的邮箱是不是正确(邮箱格式)
		if(stringOperation.isEmpty(getUserEmail()) && stringOperation.isEmail(getUserEmail())){
			users.setUserEmail(getUserEmail());//保存用户的邮箱
			returnType = success;
		}
		else{
			returnType = failure;
		}
		
		//检查用户手机是不是格式是不是正确
		if(stringOperation.isEmpty(getUserPhone()) && stringOperation.isPhoneNumber(getUserPhone()))
		{
			//保存用户手机
			users.setUserPhone(getUserPhone());
			returnType = success;
		}
		else
		{
			returnType = failure;
		}
		
		//检查用户密码是不是符合要求
		if(stringOperation.isEmpty(getUserPassword()) && stringOperation.isEmpty(getReUserPassword()) && getReUserPassword().equals(getUserPassword()))
		{
			//保存用户密码
			users.setUserPassword(getUserPassword());
			//设置返回参数值
			returnType = success;
		}
		else
		{
			returnType = failure;
		}
		
//		//编写根据邮箱检索这个邮箱是不是被注册
//		String hql = " from Users users where users.userEmail = ? ";
//
//		//检索这个用户是不是已经被注册，假如被注册的话就返回失败
//		int result = userService.getUserByUserEmail(hql,getUserEmail());
//		if(result > 0)
//		{
//			returnType=failure;
//		}
//		else
//		{
//			returnType = success;
//		}
		
		//设置表中的其它字段信息
		//设置创建日期和更新日期为当前日期
		users.setUserCreateDate(foamatedDate);
		users.setUserUpdateDate(foamatedDate);
		//设置用户名和邮箱相等
		users.setUserName(getUserEmail());
		//设置删除日期为null(用户新建还尚未删除)
		users.setUserDeleteDate(null);
		//设置用户删除flag(1:表示用户逻辑删除；0：表示用户正常使用)
		users.setUserFlag("0");
		
		//根据返回字符串返回不同的视图
		if(returnType.equals(success))
		{
			//保存用户
			usersService.save(users);
			//返回主页视图
			System.out.println("提交成功！");
			return success;
		}
		else
		{
			//返回失败视图:注册页面
			return failure;
		}
	}
}