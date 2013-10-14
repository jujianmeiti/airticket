package com.airticket.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 
 * @author ALLEN
 *
 */
public class BaseDao extends HibernateDaoSupport {

	
	/**
	 * ��ѯ��
	 * @param hql 
	 * @param param  封装好查询参数的实体
	 * @return query查询对象交给具体的dao处理
	 * @throws Exception
	 */
	public Query queryInfo(String hql,Object param) throws Exception{
		Query query = null;
		if(null!=param&&null!=hql){
			query = this.getSession().createQuery(hql).setProperties(param);
		}
		return query;
	}
	
	/**
	 * ����
	 * @param param  要插入信息的实体
	 * 事务交由Spring管理
	 * @return
	 */
	public Serializable insert(Object param) throws Exception{
		Serializable id = null;
		if(null!=param){
			id = this.getSession().save(param);
		}
		return id;
	}
	
	
	/**
	 * �޸�
	 * @param param �?��更新信息的实�?
	 * @throws Exception
	 */
	public void update(Object param) throws Exception{
		if(null!=param){
			this.getSession().update(param);
		}
	}
	
	
	
	
}
