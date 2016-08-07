package com.matter.lifePlan.service;

import java.io.Serializable;

import com.common.base.dao.BaseDao;
import com.matter.lifePlan.entity.Users;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-7 下午6:54:24 
 * 类说明 
 */
public interface UserService{

	Serializable save(Users user);
}
