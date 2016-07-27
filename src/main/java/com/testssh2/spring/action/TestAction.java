package com.testssh2.spring.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.testssh2.spring.model.User;
import com.testssh2.spring.service.UserServiceI;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-7-24 上午10:24:17 
 * 类说明 
 */
@ParentPackage("basePackage")
@Action(value="strust2Test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class TestAction {
    
    /**
     * 注入userService
     */
    @Autowired
    private UserServiceI userService;

    /**
     * http://localhost:8080/OnlyOne/strust2Test!test.action
     * MethodName: test
     * Description: 
     * @author xudp
     */
    public void test(){
        System.out.println("进入TestAction");
        userService.test();
    }
    
    /**
     * http://localhost:8080/SSHE/strust2Test!saveUser.action
     */
    public void saveUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("xdp孤傲苍狼");
        user.setPwd("123456");
        user.setCreatedatetime(new Date()); 
        userService.save(user);
    }
}