package com.second.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.UsuarioDao;
import com.second.models.usuarioModel;

import responses.Respuesta;
import security.encoder;

@RestController
@RequestMapping("/user")
public class usuarios {
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping("/getUsuarios")
	List<usuarioModel> index() {
		List<usuarioModel> user = new ArrayList<>();
		usuarioModel miUsuario = new usuarioModel();
		miUsuario.setAge(18);
		miUsuario.setName("jhon");
		user.add(miUsuario);
		return user ;
	}
	
	@GetMapping("/saludar/{n}")
	List<String> saludar(@PathVariable String n){
		
		List<String> saludo  = new ArrayList<>(); 
		
		
		encoder crypto = new encoder();
		n = crypto.ecnode(n);
		saludo.add(n);
		
		String decodePassword = crypto.deecnode(n);
		if("jhon".equals(decodePassword)){
			saludo.add("True");
		}else {
			saludo.add("False");
		}
		
		
		return saludo;
	}


	@PostMapping("/create")
	public List<Respuesta> create(@RequestBody usuarioModel usuario){
		usuarioDao.save(usuario);
		List<usuarioModel> data = new ArrayList<>();
		data.add(usuario);
		List<Respuesta> res = new ArrayList<>();
		Respuesta response = new Respuesta();
		response.setMsg("Todo good");
		response.setData(data);
		
		res.add(response);
		return res;
	}

}
