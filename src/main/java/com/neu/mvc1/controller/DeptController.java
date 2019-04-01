package com.neu.mvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
	@RequestMapping("/test")
	public String testcontroller()
	{
		System.out.println("testcontroller");
		return "ret.jsp";
	}
}
