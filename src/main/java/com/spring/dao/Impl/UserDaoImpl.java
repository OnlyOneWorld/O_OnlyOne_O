package com.spring.dao.Impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.UserDao;


/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-4 下午9:06:01 
 * 类说明 
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save(String data) {
		System.out.println("使用Spring保存的数据:"+data);
	}

}
