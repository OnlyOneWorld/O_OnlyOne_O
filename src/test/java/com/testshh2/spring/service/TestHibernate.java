package com.testshh2.spring.service;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testssh2.spring.model.User;
import com.testssh2.spring.service.UserServiceI;
/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-24 上午11:22:53 
 * 类说明 
 */
public class TestHibernate {

    private UserServiceI userService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","spring-hibernate.xml"});
        userService = (UserServiceI) ac.getBean("userService");
    }
    
    @Test
    public void testSaveMethod(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("独孤求败");
        user.setPwd("123");
        user.setCreatedatetime(new Date()); 
        userService.save(user);
    }
}