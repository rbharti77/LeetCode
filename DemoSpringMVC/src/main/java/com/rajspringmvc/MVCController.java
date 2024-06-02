package com.rajspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController 
{
    
	@RequestMapping("/add")
	public String add()
	{
		return "display.jsp";
	}
}
