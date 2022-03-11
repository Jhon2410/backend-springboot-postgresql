package com.second.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.PublicacionDao;
import com.second.models.publicacion_network;

import responses.Respuesta;

@RestController
@RequestMapping("/network/publicacion")
@CrossOrigin(origins = "*")
public class PublicacionController {
	
	@Autowired
	private PublicacionDao publicacionDao;
	
	@GetMapping("/")
	public String index() {
		return "publicaciones";
	}
	
	@PostMapping("/create")
	public Respuesta crear(@RequestBody publicacion_network publicNet) {
		Respuesta res = new Respuesta();
		String msg = "No se ha podido crear la publicacion.";
		Integer status = 0;
		if(publicNet.getContenido_publicacion() != null) {
			publicacionDao.save(publicNet);
			 msg = "La publicacion ha sido creado.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}

	@PutMapping("/update")
	public Respuesta actualizar(@RequestBody publicacion_network publicNet) {
		Respuesta res = new Respuesta();
		String msg = "No se ha podido crear actualizar.";
		Integer status = 0;
		if(publicNet.getContenido_publicacion() != null) {
			publicacionDao.save(publicNet);
			 msg = "La publicacion ha sido actualizada.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}

	@DeleteMapping("/delete")
	public Respuesta delete(@RequestBody publicacion_network publicNet) {
		Respuesta res = new Respuesta();
		String msg = "No se ha podido eliminar la publicacion.";
		Integer status = 0;
		if(publicNet.getId_publicacion() != null) {
			publicacionDao.deleteById(publicNet.getId_publicacion());
			 msg = "La publicacion ha sido eliminada.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
}
