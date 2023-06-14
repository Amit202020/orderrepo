package com.example.demo.bean;

public class Order {
	
	private int orderId;
	private String orderName;
	private String OrderDesc;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderDesc() {
		return OrderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		OrderDesc = orderDesc;
	}
	public Order(int orderId, String orderName, String orderDesc) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		OrderDesc = orderDesc;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", OrderDesc=" + OrderDesc + "]";
	}
	
	
	

}
