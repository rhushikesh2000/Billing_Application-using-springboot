package com.example.maxxx_retail;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class restcontroller {
	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("rhushikesh")
	public ModelAndView getAll(HttpServletRequest request ) {
		
		
		String billno= request.getParameter("Billno");
		
		String Customer_name= request.getParameter("Customer_name");
		String Mobile_no =request.getParameter("Mobile_no");
		long mobno=Long.parseLong(Mobile_no);
		String Date=request.getParameter("Date");
		String Subtotal=request.getParameter("Subtotal");
		double st =Double.parseDouble(Subtotal);
		String gst=request.getParameter("gst");
		int gst1=Integer.parseInt(gst);
		String Gst_total=request.getParameter("Gst_total");
		double gstot =Double.parseDouble(Gst_total);
		
		String Discount=request.getParameter("Discount");
		int Discount1=Integer.parseInt(Discount);
		String FinalTotal=request.getParameter("FinalTotal");
		double FinalTotal1 =Double.parseDouble(FinalTotal);
		String RecivedAmount=request.getParameter("RecivedAmount");
		double RecivedAmount1 =Double.parseDouble(RecivedAmount);
		String CreditedAmount=request.getParameter("CreditedAmount");
		double CreditedAmount1 =Double.parseDouble(CreditedAmount);
		
//		String billno=    retail.getBillno();
//		double credamount =retail.getCreditedAmount();
//		String  custname=retail.getCustomer_name();
//		String date=retail.getDate();
//		int discount=retail.getDiscount();
//		double finaltotal=retail.getFinalTotal();
//		int gst=retail.getGst();
//		double gstotal=retail.getGst_total();
//		long mobileno=retail.getMobile_no();
//		double recamount= retail.getRecivedAmount();
//		double  subtotal=retail.getSubtotal();
//		
		retail retail2=new retail(billno, Customer_name, mobno, Date, st, gst1, gstot, Discount1, FinalTotal1, RecivedAmount1, CreditedAmount1);
		
		Session session = sessionFactory.openSession();
 
	            
	
			Transaction transaction = session.beginTransaction();
			session.save(retail2);
			transaction.commit();
			ModelAndView view= new ModelAndView("form");
				return view ;
			
		
	 
		
	
		
	}

}
