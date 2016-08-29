package com.test.generateDatabaseTable;

import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.matter.lifePlan.entity.Users;
import com.matter.lifePlan.service.UserService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-30 上午1:52:50 
 * 类说明 
 */
public class TestAddDateToUsers {

	@Test
	public void testAdddate()
	{
		//加载配置文件
		ApplicationContext at = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml","spring-hibernate.xml"});
	
		UserService userService = (UserService)at.getBean("usersService");
		
		Users users = new Users();
		
		users.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		users.setUserDeleteDate("null");
		users.setUserCreateDate("null");
		users.setUserEmail("ltwuyanlong@163.com");
		users.setUserFlag("0");
		users.setUserName("wuyanlong!");
		users.setUserPassword("111111");
		users.setUserPhone("18817312933");
		users.setUserUpdateDate("null");
		
		userService.save(users);
	}
}
