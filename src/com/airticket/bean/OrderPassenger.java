package com.airticket.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderPassenger entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_passenger", catalog = "airticket")
public class OrderPassenger implements Serializable {

	// Fields
	
	//乘机人ID
	private String passengerid;
	//乘机人姓名
	private String passengerName;
	//乘机人年龄
	private Integer birthday;
	//证件类型
	private String cardTypeName;
	//证件号码
	private String cardTypeNumber;
	//舱位等级
	private String flightClass;
	//舱位等级中文名称
	private String flightClassName;
	//机票单价
	private Double price;
	//机票订单ID
	private Order orderid;

	// Constructors

	/** default constructor */
	public OrderPassenger() {
	}

	/** full constructor */
	public OrderPassenger(String passengerid, String passengerName,
			Integer birthday, String cardTypeName, String cardTypeNumber,
			String flightClass, String flightClassName, Double price,
			Order orderid) {
		this.passengerid = passengerid;
		this.passengerName = passengerName;
		this.birthday = birthday;
		this.cardTypeName = cardTypeName;
		this.cardTypeNumber = cardTypeNumber;
		this.flightClass = flightClass;
		this.flightClassName = flightClassName;
		this.price = price;
		this.orderid = orderid;
	}

	// Property accessors
	@Id
	@Column(name = "passengerid", unique = true, nullable = false, length = 20)
	public String getPassengerid() {
		return this.passengerid;
	}

	public void setPassengerid(String passengerid) {
		this.passengerid = passengerid;
	}

	@Column(name = "passengerName", nullable = false, length = 20)
	public String getPassengerName() {
		return this.passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	@Column(name = "birthday", nullable = false)
	public Integer getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	@Column(name = "cardTypeName", nullable = false, length = 20)
	public String getCardTypeName() {
		return this.cardTypeName;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	@Column(name = "cardTypeNumber", nullable = false, length = 20)
	public String getCardTypeNumber() {
		return this.cardTypeNumber;
	}

	public void setCardTypeNumber(String cardTypeNumber) {
		this.cardTypeNumber = cardTypeNumber;
	}

	@Column(name = "flightClass", nullable = false, length = 20)
	public String getFlightClass() {
		return this.flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	@Column(name = "flightClassName", nullable = false, length = 20)
	public String getFlightClassName() {
		return this.flightClassName;
	}

	public void setFlightClassName(String flightClassName) {
		this.flightClassName = flightClassName;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "orderid", nullable = false, length = 20)
	public Order getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Order orderid) {
		this.orderid = orderid;
	}

}