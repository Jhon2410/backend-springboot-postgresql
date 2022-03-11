package com.second.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wallet/movimientos")
@CrossOrigin(origins = "*")
public class MovimientosController {

	@GetMapping("/")
	public String index() {
		return "moviemientos";
	}
}
