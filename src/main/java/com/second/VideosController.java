package com.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.VideosDao;
import com.second.models.videos_publicacion;

import responses.Respuesta;

@RestController
@RequestMapping("/videos")
public class VideosController {
	
	@Autowired
	private VideosDao videosDao;
	
	@GetMapping("/")
	public String index() {
		return "get";
	}
	
	@PostMapping("/create")
	public Respuesta create(@RequestBody videos_publicacion video) {
		Respuesta res = new Respuesta();
		String msg ="";
		int status = 0;
		if(video.getTitulo_video() != null) {
			videosDao.save(video);
			 msg ="video agregado";
			 status = 1;
		}

		
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}
	
	
	@PutMapping("/update")
	public Respuesta update(@RequestBody videos_publicacion video) {
		Respuesta res = new Respuesta();
		String msg ="";
		int status = 0;
		if(video.getTitulo_video() != null) {
			videosDao.save(video);
			 msg ="video agregado";
			 status = 1;
		}

		
		res.setMsg(msg);
		res.setStatus(status);
		return res;
	}

}
