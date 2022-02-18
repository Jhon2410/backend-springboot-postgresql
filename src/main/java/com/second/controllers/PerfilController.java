package com.second.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import responses.Respuesta;

@RestController
@RequestMapping("/profile")
public class PerfilController {
	@GetMapping("/")
	public Respuesta index() {
	Respuesta res = new Respuesta();
	
	String msg = "perfil";
	int status = 0;
	
	res.setMsg(msg);
	res.setStatus(status);
	
	return res;
	}
}
