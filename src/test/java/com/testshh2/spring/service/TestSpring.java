package com.testshh2.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testssh2.spring.service.UserServiceI;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-24 上午12:02:26 
 * 类说明 
 */

//public class TestSpring {
//
//	@Test
//	public void test()
//	{
//		//加载spring配置文件
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//
//		//从springIOC容器中获取bean
//		UserServiceI userService = (UserServiceI)ac.getBean("userService");
//		//执行测试方法
//		userService.test();
//	}
public class TestSpring {

    @Test
    public void test(){
        //通过spring.xml配置文件创建Spring的应用程序上下文环境
        //ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        /**
         *因为已经整合了Hibernate，UserServiceImpl类中使用到了userDao，
         *userDao是由spring创建并且注入给UserServiceImpl类的，而userDao中又使用到了sessionFactory对象
         *而创建sessionFactory对象时需要使用到spring-hibernate.xml这个配置文件中的配置项信息，
         *所以创建Spring的应用程序上下文环境时，需要同时使用spring.xml和spring-hibernate.xml这两个配置文件
         *否则在执行Maven install命令时，因为maven会先执行test方法中的代码，而代码执行到
         *UserServiceI userService = (UserServiceI) ac.getBean("userService");
         *这一行时就会因为userDao中使用到sessionFactory对象无法正常创建的而出错，这样执行Maven install命令编译项目时就会失败！
         *
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","spring-hibernate.xml"});
        //从Spring的IOC容器中获取bean对象
        UserServiceI userService = (UserServiceI) ac.getBean("userService");
        //执行测试方法
        userService.test();
    }

}
