package com.tedu.pojo;

import java.util.Date;

/**
 * POJO:类封装订单信息
 * @author UID
 *
 */
public class Order {
	private Integer id;
	private Integer doorId;
	private String orderNo;
	private String orderType;
	private Integer pnum;
	private String cashier;
	private Date orderTime;
	private Date payTime;
	private String payType;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoorId() {
		return doorId;
	}
	public void setDoorId(Integer doorId) {
		this.doorId = doorId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Integer getPnum() {
		return pnum;
	}
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", doorId=" + doorId + ", orderNo=" + orderNo + ", orderType=" + orderType
				+ ", pnum=" + pnum + ", cashier=" + cashier + ", orderTime=" + orderTime + ", payTime=" + payTime
				+ ", payType=" + payType + ", price=" + price + "]";
	}
	public Order(Integer id, Integer doorId, String orderNo, String orderType, Integer pnum, String cashier,
			Date orderTime, Date payTime, String payType, Double price) {
		super();
		this.id = id;
		this.doorId = doorId;
		this.orderNo = orderNo;
		this.orderType = orderType;
		this.pnum = pnum;
		this.cashier = cashier;
		this.orderTime = orderTime;
		this.payTime = payTime;
		this.payType = payType;
		this.price = price;
	}
	public Order() {
		super();
	}
	
}
