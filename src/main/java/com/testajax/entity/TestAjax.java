package com.testajax.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:01:04 
 * 类说明 
 */
@Entity
@Table(name="oo_testAjax")
public class TestAjax {
	//用户ID
	private String id;
	
	//用户名
	private String userName;
	
	//检索信息
	private String text;

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
	
	//无参数构造方法
	public TestAjax()
	{
		
	}
			
	//全参数构造方法
	public TestAjax(String id, String userName, String text) {
		this.id = id;
		this.userName = userName;
		this.text = text;
	}

	//方便测试
	@Override
	public String toString() {
		return "TestAjax [id=" + id + ", userName=" + userName + ", text="
				+ text + "]";
	}
}
