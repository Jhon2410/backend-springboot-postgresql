package com.second.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.UsuarioDao;
import com.second.models.usuarios;
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	// inyeccion de dependencias o dao
	@Autowired
	private UsuarioDao usuarioDao;
	
	// leer usuarios perticion get endponit /usuarios
	@GetMapping("/")
	public List<usuarios> getUsuarios() {
		return usuarioDao.findAll();
	}
	
	
}
