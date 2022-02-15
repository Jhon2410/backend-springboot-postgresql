package com.second.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	String index() {
		return "<style>body{background:#000; text-align:center;color:#fff;}</style><h1>Welcome to jhon API</h1>";
	}
	
}
