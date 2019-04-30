package com.spring.app.order.vo;

import java.sql.Date;

public class IhubOrderVO {
	
	private String orderId;
	private String userId;
	private Date order_created_date;
	private Date order_deliver_date;
	private String orderName;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getOrder_created_date() {
		return order_created_date;
	}
	public void setOrder_created_date(Date order_created_date) {
		this.order_created_date = order_created_date;
	}
	public Date getOrder_deliver_date() {
		return order_deliver_date;
	}
	public void setOrder_deliver_date(Date order_deliver_date) {
		this.order_deliver_date = order_deliver_date;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public IhubOrderVO(String orderId, String userId, Date order_created_date, Date order_deliver_date,
			String orderName) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.order_created_date = order_created_date;
		this.order_deliver_date = order_deliver_date;
		this.orderName = orderName;
	}
	public IhubOrderVO() {}

}
