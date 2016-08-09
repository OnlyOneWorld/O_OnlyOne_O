package com.matter.lifePlan.dto;

/**
 * @author Administrator:
 * @version 创建时间：2016-8-8 下午11:28:01 类说明
 */
public class UserRegisterForm {
	/**
	 * 密码
	 */
	private String userPassword;
	/**
	 * 用户手机
	 */
	private String userPhone;
	/**
	 * 用户邮箱
	 */
	private String userEmail;
	
	/**
	 * 用户重复密码
	 */
	private String reUserPassword;

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

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
}
