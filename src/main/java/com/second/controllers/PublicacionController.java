package com.second.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import responses.Respuesta;

@RestController
@RequestMapping("/network/publicacion")
public class PublicacionController {
	
	@GetMapping("/")
	public String index() {
		return "publicaciones";
	}
	
	@PostMapping("/create")
	public Respuesta crear() {
		Respuesta res = new Respuesta();
		
		String msg = "no se ha podido crer la publicacion.";
		Integer status = 0;
		
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
}
