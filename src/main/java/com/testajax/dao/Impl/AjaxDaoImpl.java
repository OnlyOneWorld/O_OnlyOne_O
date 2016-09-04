package com.testajax.dao.Impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testajax.dao.AjaxDao;
import com.testajax.entity.TestAjax;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-9-3 下午10:01:53 
 * 类说明 
 */
@Repository("ajaxDao")
public class AjaxDaoImpl implements AjaxDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Serializable save(TestAjax ta) {
		
		//保存数据
		return sessionFactory.getCurrentSession().save(ta);
	}
}
