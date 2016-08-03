package com.matter.lifePlan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * @author  wyl: 
 * @version 创建时间：2016-8-3 下午11:09:51 
 * 类说明 
 */
/**
 * 这是用户实体类
 * 
 * @author Administrator
 * 
 */
@Entity
@Table(name = "onlyone_user_info", schema = "SSHE")
public class Users {

	/**
	 * 用户字段信息
	 */
	/**
	 * 用户编号
	 */
	private String userId;
	/**
	 * 用户名
	 */
	private String userName;
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
	 * 用户删除标志位
	 */
	private String userFlag;
	/**
	 * 用户创建时间
	 */
	private String userCreateDate;
	/**
	 * 用户更新时间
	 */
	private String userUpdateDate;
	/**
	 * 用户删除时间
	 */
	private String userDeleteDate;
	

	/**
	 * 无参数构造器
	 */
	public Users()
	{
		
	}
	
	/**
	 * 带参数的构造器
	 * @param userId
	 * @param userName
	 * @param userPassword
	 * @param userPhone
	 * @param userEmail
	 */
	public Users(String userId, String userName, String userPassword,
			String userPhone, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}


	/**
	 * 生成对应的getter和setter
	 */
	@Id
    @Column(name = "userId", unique = true, nullable = false, length = 36)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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
	
	@Column(name = "userEmail",nullable = false, length = 100)
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(String userFlag) {
		this.userFlag = userFlag;
	}
	
	public String getUserCreateDate() {
		return userCreateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "userCreateDate", length = 7)
	public void setUserCreateDate(String userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	public String getUserUpdateDate() {
		return userUpdateDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "userUpdateDate", length = 7)
	public void setUserUpdateDate(String userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}

	public String getUserDeleteDate() {
		return userDeleteDate;
	}

	public void setUserDeleteDate(String userDeleteDate) {
		this.userDeleteDate = userDeleteDate;
	}
}
