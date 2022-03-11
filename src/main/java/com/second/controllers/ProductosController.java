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

import com.second.dao.StoreDao;
import com.second.models.store_publicacion;

import responses.Respuesta;
import responses.RespuestaProducto;

@RestController
@RequestMapping("store/productos")
@CrossOrigin(origins = "*")
public class ProductosController {
	@Autowired
	private StoreDao storeDao;
	@GetMapping("/")
	public RespuestaProducto index() {
		RespuestaProducto res = new RespuestaProducto();
		String msg = "";
		int status = 0;
		res.setMsg(msg);
		res.setStatus(status);
		res.setData(storeDao.findAll());
		return res;
	}
	
	@PostMapping("/create")
	public Respuesta create (@RequestBody store_publicacion store_publicacion) {
		Respuesta res = new Respuesta();
		String msg = "No publicado.";
		int status = 0;
		if(store_publicacion.getId_publicacion() != null) {
			storeDao.save(store_publicacion);
			 msg = "publicado.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
	
	
	@PutMapping("/uptdate")	
	public Respuesta update (@RequestBody store_publicacion store_publicacion) {
		Respuesta res = new Respuesta();
		String msg = "No actualizado";
		int status = 0;
		if(store_publicacion.getId_publicacion() != null) {
			storeDao.save(store_publicacion);
			 msg = "actualizado.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
	
	
	@DeleteMapping("/delete")
	public Respuesta delete (@RequestBody store_publicacion store_publicacion) {
		Respuesta res = new Respuesta();
		String msg = "No eliminado";
		int status = 0;
		if(store_publicacion.getId_publicacion() != null) {
			storeDao.deleteById(store_publicacion.getId_publicacion());
			 msg = "Eliminado.";
			 status = 1;
		}
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
}
