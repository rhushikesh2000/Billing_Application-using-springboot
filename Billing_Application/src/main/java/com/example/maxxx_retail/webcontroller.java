package com.example.maxxx_retail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class webcontroller {
	
	@RequestMapping("pro")
	public String getJspPage2() {
		System.out.println("Web Controller");
		return "form";
	}

}
