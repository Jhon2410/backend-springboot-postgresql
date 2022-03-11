package com.second.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "";
	}
	@RequestMapping("/show")
	public String img() {
		return "";
	}
	
}
