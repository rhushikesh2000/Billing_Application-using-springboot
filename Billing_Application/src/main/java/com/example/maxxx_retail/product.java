package com.example.maxxx_retail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
    @Id
	private String  Srno ;
	private String ItemCode;
	private String ProductName ;
	private int Quantity;
	private double Price ;
	private int  ItemTotal ;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(String srno, String itemCode, String productName, int quantity, double price, int itemTotal) {
		super();
		Srno = srno;
		ItemCode = itemCode;
		ProductName = productName;
		Quantity = quantity;
		Price = price;
		ItemTotal = itemTotal;
	}
	@Override
	public String toString() {
		return "product [Srno=" + Srno + ", ItemCode=" + ItemCode + ", ProductName=" + ProductName + ", Quantity="
				+ Quantity + ", Price=" + Price + ", ItemTotal=" + ItemTotal + "]";
	}
	public String getSrno() {
		return Srno;
	}
	public void setSrno(String srno) {
		Srno = srno;
	}
	public String getItemCode() {
		return ItemCode;
	}
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getItemTotal() {
		return ItemTotal;
	}
	public void setItemTotal(int itemTotal) {
		ItemTotal = itemTotal;
	}
	
	 
	
	
	
}
	