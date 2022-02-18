package com.second.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.FriendsDao;
import com.second.models.Friends;
import com.second.models.usuarios;


import responses.Respuesta;
import responses.RespuestaAmigos;

@RestController
@RequestMapping("/friends")
public class AmigosController {
	
	
	@Autowired
	private FriendsDao friendsDao;
	
	
	@PostMapping("/")
	public RespuestaAmigos getUser(@RequestBody usuarios usuario) {
		
		RespuestaAmigos res = new RespuestaAmigos();
		List<Friends> amigos = friendsDao.findAll();
		
		
		List<Friends> misAmigos = new ArrayList<>();
		  for (int i=0;i<amigos.size();i++) {
		      
			  	Friends amigo = amigos.get(i);
			  
			    if(amigo.getId_usuario_pertenece() == usuario.getId_usuario()) {
			    	//respondiendo en caso de que el amigo le pertenezca
					misAmigos.add(amigo);
			    	
			    }
		  }
		
		res.setData(misAmigos);
		res.setMsg("successfull");
		res.setStatus(1);
		return res;
	}
	
	@PostMapping("/add")
	public Respuesta agregarAmigo(@RequestBody Friends amigo) {
		
		Respuesta res = new Respuesta();
		String msg = "no se puedo agregar";
		int status = 0;
		if(amigo.getEstado() != null && amigo.getFoto_url() != null   && amigo.getNombre_amigo() != null) {
		friendsDao.save(amigo);
		msg = "agregado";
		status = 1;
				
			
			
			
		}
		
		res.setMsg(msg);
		res.setStatus(status);
		
	
		
		return res;
	}
	
	@PutMapping("/update")
	public Respuesta actualiza(@RequestBody usuarios usuario) {
		Respuesta res = new Respuesta();
		
		
		/*if() {}*/
		
		String msg = "hubo un error";
		Integer status = 0;
		
		res.setMsg(msg);
		res.setStatus(status);
		
		
		return res;
	}
	
	@DeleteMapping("/delete")
	public Respuesta eliminar(@RequestBody Friends amigo) {
		
		Respuesta  res = new Respuesta();
		
		String msg = "El usuario no ha sido eliminado";
		Integer status = 0;
		System.out.print(amigo.getId_friend());
		if(amigo.getId_friend() >=0) {
			friendsDao.deleteById(amigo.getId_friend());
			msg = "El Usuario ha sido eliminado.";
			status = 1;
		}
		
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
}
