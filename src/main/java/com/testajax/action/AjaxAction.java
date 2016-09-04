package com.testajax.action;

import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.testajax.entity.TestAjax;
import com.testajax.service.AjaxService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:03:26 
 * 类说明 
 */
//编写package名字和struts.xml文件里面定义的统一
@ParentPackage("ajax")
//编写Action
@Action(value = "ajaxTest", results = { 
		@Result(name = "success", location = "/oo_index.jsp")}) 
//为注册Action指定命名空间
@Namespace("/")
public class AjaxAction {

	@Autowired
	private AjaxService ajaxService;
	
	private String userName;
	
	private String text;
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public String ajaxDemo()
	{
		
		TestAjax ta = new TestAjax();
		
		ta.setId(UUID.randomUUID().toString().replaceAll("_", ""));
		ta.setUserName(getUserName());
		ta.setText(getText());
		
		ajaxService.save(ta);
		
		return "success";
	}
	
}
