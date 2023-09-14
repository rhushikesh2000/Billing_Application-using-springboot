package com.example.maxxx_retail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class retail {
	@Id
	private String Billno ;
	private String  Customer_name ;
	private long Mobile_no ;
	private String Date ;
	
	private double  Subtotal ;
	private int gst ;
	private double Gst_total ;
	private int Discount ;
	private double FinalTotal ;
	private double RecivedAmount ;
	private double CreditedAmount ;
	public retail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public retail(String billno, String customer_name, long mobile_no, String date, double subtotal, int gst,
			double gst_total, int discount, double finalTotal, double recivedAmount, double creditedAmount) {
		super();
		Billno = billno;
		Customer_name = customer_name;
		Mobile_no = mobile_no;
		Date = date;
		Subtotal = subtotal;
		this.gst = gst;
		Gst_total = gst_total;
		Discount = discount;
		FinalTotal = finalTotal;
		RecivedAmount = recivedAmount;
		CreditedAmount = creditedAmount;
	}
	@Override
	public String toString() {
		return "retail [Billno=" + Billno + ", Customer_name=" + Customer_name + ", Mobile_no=" + Mobile_no + ", Date="
				+ Date + ", Subtotal=" + Subtotal + ", gst=" + gst + ", Gst_total=" + Gst_total + ", Discount="
				+ Discount + ", FinalTotal=" + FinalTotal + ", RecivedAmount=" + RecivedAmount + ", CreditedAmount="
				+ CreditedAmount + "]";
	}
	public String getBillno() {
		return Billno;
	}
	public void setBillno(String billno) {
		Billno = billno;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public double getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public double getGst_total() {
		return Gst_total;
	}
	public void setGst_total(double gst_total) {
		Gst_total = gst_total;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public double getFinalTotal() {
		return FinalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		FinalTotal = finalTotal;
	}
	public double getRecivedAmount() {
		return RecivedAmount;
	}
	public void setRecivedAmount(double recivedAmount) {
		RecivedAmount = recivedAmount;
	}
	public double getCreditedAmount() {
		return CreditedAmount;
	}
	public void setCreditedAmount(double creditedAmount) {
		CreditedAmount = creditedAmount;
	}
	
	





	
}
