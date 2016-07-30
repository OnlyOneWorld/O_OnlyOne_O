package me.gacl.service;

import java.io.Serializable;

import me.gacl.model.User;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-31 上午12:46:46 
 * 类说明 
 */
public interface UserServiceI {

	/**
	 * 添加测试方法
	 * 
	 * @parameter
	 */
	public void test();
	
	 /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user);
}
