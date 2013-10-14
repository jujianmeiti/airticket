package com.airticket.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderTravelInvoices entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_travelinvoices", catalog = "airticket")
public class OrderTravelInvoices implements Serializable {

	// Fields

	//旅游发票ID
	private String travelinvoicesid;
	//收件人
	private String receiver;
	//省名称
	private String rrovince;
	//市名称
	private String city;
	//区名称
	private String canton;
	//详细地址
	private String address;
	//邮政编码
	private String postCode;
	//订单ID
	private Order orderid;
	//联系人ID
	private OrderPassenger passengerid;

	// Constructors

	/** default constructor */
	public OrderTravelInvoices() {
	}

	/** full constructor */
	public OrderTravelInvoices(String travelinvoicesid, String receiver,
			String rrovince, String city, String canton, String address,
			String postCode, Order orderid, OrderPassenger passengerid) {
		this.travelinvoicesid = travelinvoicesid;
		this.receiver = receiver;
		this.rrovince = rrovince;
		this.city = city;
		this.canton = canton;
		this.address = address;
		this.postCode = postCode;
		this.orderid = orderid;
		this.passengerid = passengerid;
	}

	// Property accessors
	@Id
	@Column(name = "travelinvoicesid", unique = true, nullable = false, length = 20)
	public String getTravelinvoicesid() {
		return this.travelinvoicesid;
	}

	public void setTravelinvoicesid(String travelinvoicesid) {
		this.travelinvoicesid = travelinvoicesid;
	}

	@Column(name = "receiver", nullable = false, length = 20)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Column(name = "rrovince", nullable = false, length = 20)
	public String getRrovince() {
		return this.rrovince;
	}

	public void setRrovince(String rrovince) {
		this.rrovince = rrovince;
	}

	@Column(name = "city", nullable = false, length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "canton", nullable = false, length = 20)
	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	@Column(name = "address", nullable = false, length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "postCode", nullable = false, length = 20)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "orderid", nullable = false, length = 20)
	public Order getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Order orderid) {
		this.orderid = orderid;
	}

	@Column(name = "passengerid", nullable = false, length = 20)
	public OrderPassenger getPassengerid() {
		return this.passengerid;
	}

	public void setPassengerid(OrderPassenger passengerid) {
		this.passengerid = passengerid;
	}

}