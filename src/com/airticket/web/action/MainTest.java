package com.airticket.web.action;


import test.Test;

import com.airticket.biz.IFlightSerchBiz;
import com.airticket.dao.BaseDao;
import com.airticket.tripapi.bean.request.FlightRoute;
import com.airticket.tripapi.bean.request.FlightSearchRequest;
import com.opensymphony.xwork2.ActionSupport;


public class MainTest extends ActionSupport {

	private Test test;
	private BaseDao dao;

	//
	private FlightSearchRequest request;
	//
	private FlightRoute flightRoute;

	private IFlightSerchBiz flightSerch;
	
	private String val;

	public String add() {

			
		return null;
	}

	// getter and setter

	public BaseDao getDao() {
		return dao;
	}

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public FlightSearchRequest getRequest() {
		return request;
	}

	public void setRequest(FlightSearchRequest request) {
		this.request = request;
	}

	public IFlightSerchBiz getFlightSerch() {
		return flightSerch;
	}

	public void setFlightSerch(IFlightSerchBiz flightSerch) {
		this.flightSerch = flightSerch;
	}

	public FlightRoute getFlightRoute() {
		return flightRoute;
	}

	public void setFlightRoute(FlightRoute flightRoute) {
		this.flightRoute = flightRoute;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
