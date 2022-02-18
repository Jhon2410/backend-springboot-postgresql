package com.second.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("store/productos")
public class ProductosController {

	@GetMapping("/")
	public String index() {
		return "productos";
				
	}
}
