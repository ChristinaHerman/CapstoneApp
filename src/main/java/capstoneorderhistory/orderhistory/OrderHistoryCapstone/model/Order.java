package capstoneorderhistory.orderhistory.OrderHistoryCapstone.model;

import java.math.BigDecimal;

public class Order {
	private Customer customer;
	private String productName;
	private Integer quantity;
	private BigDecimal unitCost;
	
	public Order() {}
	
	public Order(Customer customer, String productName, Integer quantity, BigDecimal unitCost) {
		super();
		this.customer = customer;
		this.productName = productName;
		this.quantity = quantity;
		this.unitCost = unitCost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

}
