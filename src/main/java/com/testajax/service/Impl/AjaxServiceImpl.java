package com.testajax.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testajax.dao.AjaxDao;
import com.testajax.entity.TestAjax;
import com.testajax.service.AjaxService;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:03:06 
 * 类说明 
 */
@Service("ajaxService")
public class AjaxServiceImpl implements AjaxService {

	//注入AjaxDao
	@Autowired
	private AjaxDao ajaxDao;
	
	@Override
	public Serializable save(TestAjax ta) {
		//保存信息
		//log
		System.out.println("我进入了service了！");
		return ajaxDao.save(ta);
	}
}
