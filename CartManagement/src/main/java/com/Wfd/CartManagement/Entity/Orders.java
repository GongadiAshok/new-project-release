/**
 * 
 */
package com.Wfd.CartManagement.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author DELL
 *
 */
@Table(name="orders")
@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer orderId;
	@OneToMany(cascade=CascadeType.ALL)
	public List<OrderDetails> orderDetails;
	
	 @Column(nullable=true)
	public Date orderDate;
	 @Column
	 public Date requiredDate;
	 @Column
	 public Date shippedDate;
	 @Column
	 public String ShipName;
	 @Column
	 public String shipAddress;
	 public String getShipName() {
		return ShipName;
	}
	public void setShipName(String shipName) {
		ShipName = shipName;
	}
	@Column
	 public String shipCity;
	 @Column
	 public String shipRegion;
	 @Column
	 public Integer shipPostalCode;
	 @Column
	 public String shipCountry;

	public Date getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipRegion() {
		return shipRegion;
	}
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}
	public Integer getShipPostalCode() {
		return shipPostalCode;
	}
	public void setShipPostalCode(Integer shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	

}
