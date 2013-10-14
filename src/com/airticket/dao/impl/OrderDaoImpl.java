package com.airticket.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.airticket.bean.Order;
import com.airticket.dao.OrderDao;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	public boolean saveByOrder(Order order) {
		if(null!=order){
			this.getSession().save(order);
			return true;
		}
		return false;
	}

	public boolean deleteByOrder(Order order) {
		return false;
	}

	public boolean updateByOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Order> selectByOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
