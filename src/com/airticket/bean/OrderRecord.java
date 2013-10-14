package com.airticket.bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_record", catalog = "airticket")
public class OrderRecord implements java.io.Serializable {

	// Fields

	//订单操作记录ID
	private String recordid;
	//订单操作时间
	private Timestamp recordTime;
	//订单操作状态
	private OrderRecordStatus recordstatus;
	//订单操作备注
	private String comment;
	//订单ID
	private Order orderid;
	//操作人ID
	private String userid;

	// Constructors

	/** default constructor */
	public OrderRecord() {
	}

	/** minimal constructor */
	public OrderRecord(String recordid, Timestamp recordTime,
			OrderRecordStatus recordstatus, Order orderid, String userid) {
		this.recordid = recordid;
		this.recordTime = recordTime;
		this.recordstatus = recordstatus;
		this.orderid = orderid;
		this.userid = userid;
	}

	/** full constructor */
	public OrderRecord(String recordid, Timestamp recordTime,
			OrderRecordStatus recordstatus, String comment, Order orderid, String userid) {
		this.recordid = recordid;
		this.recordTime = recordTime;
		this.recordstatus = recordstatus;
		this.comment = comment;
		this.orderid = orderid;
		this.userid = userid;
	}

	// Property accessors
	@Id
	@Column(name = "recordid", unique = true, nullable = false, length = 20)
	public String getRecordid() {
		return this.recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	@Column(name = "recordTime", nullable = false, length = 19)
	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

	@Column(name = "recordstatus", nullable = false, length = 20)
	public OrderRecordStatus getRecordstatus() {
		return this.recordstatus;
	}

	public void setRecordstatus(OrderRecordStatus recordstatus) {
		this.recordstatus = recordstatus;
	}

	@Column(name = "comment", length = 200)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "orderid", nullable = false, length = 20)
	public Order getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Order orderid) {
		this.orderid = orderid;
	}

	@Column(name = "userid", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}