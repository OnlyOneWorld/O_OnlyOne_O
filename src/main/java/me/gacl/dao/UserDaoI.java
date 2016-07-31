package me.gacl.dao;

import java.io.Serializable;

import me.gacl.model.User;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-31 上午1:19:27 
 * 类说明 
 */
public interface UserDaoI {

	 /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}
