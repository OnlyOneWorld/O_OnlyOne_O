package com.testajax.service;

import java.io.Serializable;

import com.testajax.entity.TestAjax;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:02:47 
 * 类说明 
 */
public interface AjaxService {
	//保存数据
	public Serializable save(TestAjax ta);
}
