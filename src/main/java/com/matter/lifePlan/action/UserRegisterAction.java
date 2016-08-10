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

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-8 下午11:10:04 
 * 类说明 
 */
//编写package名字和struts.xml文件里面定义的统一
@ParentPackage("userRegister")
//编写Action
@Action(value = "registerAction", results = { 
		@Result(name = "success", location = "/jsp/register/success.jsp")}) 
//为注册Action指定命名空间
@Namespace("/")

public class UserRegisterAction {
	/**
	 * 将UserService注入Action
	 */
	@Autowired
	private UserService userService;
	
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
		
		//获取当前日期并格式化
		Date date = new Date();
		//获取日期格式化类实例
		DateFormat dateFormat = new DateFormat();
		//获得格式化日期
		String foamatedDate = dateFormat.getStringDateWithBar(date);
		
		//设置用户Id
		users.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		
		//获取并设置用户邮箱
		if(stringOperation.isEmpty(getUserEmail()) &&
				stringOperation.isEmpty(getUserPhone()) &&
				stringOperation.isEmpty(getReUserPassword())&&
				stringOperation.isEmpty(getUserPassword())&&
				getUserPassword().equals(getReUserPassword()))
		{
			//添加邮箱
			users.setUserEmail(getUserEmail());
			//添加手机
			users.setUserPhone(getUserPhone());
			//添加密码
			users.setUserPassword(getUserPassword());
		}
		
		//设置创建日期和更新日期为当前日期
		users.setUserCreateDate(foamatedDate);
		users.setUserUpdateDate(foamatedDate);
		//设置用户名和邮箱相等
		users.setUserName(getUserEmail());
		//设置删除日期为null(用户新建还尚未删除)
		users.setUserDeleteDate(null);
		//设置用户删除flag(1:表示用户逻辑删除；0：表示用户正常使用)
		users.setUserFlag("0");
		
		//保存用户
		userService.save(users);
		
		return "success";
	}
}
