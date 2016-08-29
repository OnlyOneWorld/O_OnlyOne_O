package com.matter.lifePlan.user_register.style_two.action;

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
import com.matter.lifePlan.service.UserService;
import com.matter.lifePlan.user_register.style_one.service.UserRegisterServiceOne;
import com.matter.lifePlan.user_register.style_two.service.UserRegisterDemoTwoService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-20 下午3:36:53 
 * 类说明 
 */
@ParentPackage(value="userRegisterTwo")
//映射action的返回
@Action(value="registerDemoTwoAction",results={
		@Result(name="success",location="/jsp/oo_register/register_reply/register_success.jsp"),
		@Result(name="failure",location="/jsp/oo_register/oo_register.jsp")})
@Namespace("/")
//在这里使用属性驱动的方式获取画面返回的数据
public class UserRegisterDemoTwoAction {
	
//	/**
//	 * 将用户注册服务类注入Action
//	 */
//	@Autowired
//	private UserRegisterServiceOne userRegisterServiceOne;
//	
//	//获取前端画面数据并且设置getter和setter
//	private String userName;
//	private String userEmail;
//	private String userPassword;
//	private String reUserPassword;
//	private String checkCode;
//	private String rememberMe;
//
//	//生成getter和setter
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//	public String getUserPassword() {
//		return userPassword;
//	}
//
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//
//	public String getReUserPassword() {
//		return reUserPassword;
//	}
//
//	public void setReUserPassword(String reUserPassword) {
//		this.reUserPassword = reUserPassword;
//	}
//
//	public String getCheckCode() {
//		return checkCode;
//	}
//
//	public void setCheckCode(String checkCode) {
//		this.checkCode = checkCode;
//	}
//
//	public String getRememberMe() {
//		return rememberMe;
//	}
//
//	public void setRememberMe(String rememberMe) {
//		this.rememberMe = rememberMe;
//	}
//	//获得用户实体对象
//	Users user = new Users();
//	
//	//获取字符操作
//	StringOperation stringOperation = new StringOperation();
//	
//	//设置最终返回的字符串(这里返回两个字符串,成功则返回success否则返回failure)
//	String success = "success";
//	
//	String failure = "failure";
//	
//	//设置返回字符串内容
//	String returnType = success;
//	
//	//编写action处理方法
//	public String style_one_registerAction()
//	{
//		System.out.println("action执行开始！");
//		//获取当前日期并格式化
//		Date date = new Date();
//		//获取日期格式化类实例
//		DateFormat dateFormat = new DateFormat();
//		//获得格式化日期
//		String foamatedDate = dateFormat.getStringDateWithBar(date);
//		
//		//设置用户id
//		user.setUserId(UUID.randomUUID().toString().replaceAll("_",""));
//		//保存创建时间和更新时间为当前时间
//		user.setUserCreateDate(foamatedDate);
//		user.setUserUpdateDate(foamatedDate);
//		//设置删除时间为null
//		user.setUserDeleteDate(null);
//		//设置用户删除标志位为0:表示未删除
//		user.setUserFlag("0");
//		//获取并check邮箱:邮箱格式在前端check就OK了，但是为了安全保障，前端后端都需要做check。
//		if(!"".equals(getUserEmail()) || stringOperation.isEmail(getUserEmail()))
//		{
//			//添加用户邮箱
//			user.setUserEmail(getUserEmail());
//		}else{
//			returnType = failure;
//		}
//		
//		//注册时默认手机号码为null，后期再绑定
//		user.setUserPhone(null);
//		
//		//设定用户名
//		if(!"".equals(getUserName()))
//		{
//			user.setUserName(getUserName());
//		}
//		else
//		{
//			returnType = failure;
//		}
//		//保存用户
//		System.out.println("user:"+user );
//		userRegisterServiceOne.save(user);
//		System.out.println("user:"+"请求结束！" );
//
//		return returnType;
//	}
	
	/**
	 * 将UserService注入Action
	 */
	@Autowired
	private UserRegisterDemoTwoService userRegisterDemoTwoService;
	
	//设置最终返回的字符串(这里返回两个字符串,成功则返回success否则返回failure)
	String success = "success";
	
	String failure = "failure";
	
	//将Users实例化进来
	Users users = new  Users();
	
	//获取字符串操作函数
	private String userEmail;
	private String reUserPassword;
	private String userPassword;
	private String userName;
	private String checkCode;
	private String rememberMe;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	StringOperation stringOperation = new StringOperation();
	
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
		
		//编写根据邮箱检索这个邮箱是不是被注册
//		String hql = " from Users users where users.userEmail = ? ";

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
			userRegisterDemoTwoService.save(users);
			//返回主页视图
			return success;
		}
		else
		{
			//返回失败视图:注册页面
			return failure;
		}
	}
}