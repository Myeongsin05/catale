package com.web.catale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A01_Controller {
	
	// http://localhost:5050/start
	@RequestMapping("start")
	public String start() {
		return "a01_start";
	}
	
	// http://localhost:5050/start
		@RequestMapping("index")
		public String index() {
			return "index";
		}
	
	@RequestMapping("left")
	public String left_sidebar() {
		return "left-sidebar";
	}

}
