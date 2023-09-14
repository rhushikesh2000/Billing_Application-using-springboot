package com.example.maxxx_retail;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class productRestController {

	@Autowired
	SessionFactory factory;

	@RequestMapping("producteee")
	public ModelAndView getall(HttpServletRequest request) {

		String srno = request.getParameter("Sr_no");
		String itemcode = request.getParameter("Item");
		String productname = request.getParameter("prod");

		String Quantity = request.getParameter("qty");
		int qut = Integer.parseInt(Quantity);
		String price = request.getParameter("Price");
		double price1 = Double.parseDouble(price);
		String itemtotal = request.getParameter("int");
		int it = Integer.parseInt(itemtotal);

		product p = new product(srno, itemcode, productname, qut, price1, it);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		ModelAndView view= new ModelAndView("product");
		return view;

	}

}
