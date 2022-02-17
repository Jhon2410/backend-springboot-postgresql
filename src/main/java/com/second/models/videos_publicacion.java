package com.second.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class videos_publicacion {
	@Id
	@GeneratedValue
	private Integer  id_video_publicacion;
	
	@Column
	private Integer id_network;
	
	@Column
	private String tipo_video;
	
	@Column
	private String titulo_video;
	
	@Column
	private String portada_video;
	
	@Column
	private String url_video;
	
	@Column
	private Integer videos_calificacion;
	
	@Column
	private Date fecha_publicacion;

	public Integer getId_video_publicacion() {
		return id_video_publicacion;
	}

	public void setId_video_publicacion(Integer id_video_publicacion) {
		this.id_video_publicacion = id_video_publicacion;
	}

	public Integer getId_network() {
		return id_network;
	}

	public void setId_network(Integer id_network) {
		this.id_network = id_network;
	}

	public String getTipo_video() {
		return tipo_video;
	}

	public void setTipo_video(String tipo_video) {
		this.tipo_video = tipo_video;
	}

	public String getTitulo_video() {
		return titulo_video;
	}

	public void setTitulo_video(String titulo_video) {
		this.titulo_video = titulo_video;
	}

	public String getPortada_video() {
		return portada_video;
	}

	public void setPortada_video(String portada_video) {
		this.portada_video = portada_video;
	}

	public String getUrl_video() {
		return url_video;
	}

	public void setUrl_video(String url_video) {
		this.url_video = url_video;
	}

	public Integer getVideos_calificacion() {
		return videos_calificacion;
	}

	public void setVideos_calificacion(Integer videos_calificacion) {
		this.videos_calificacion = videos_calificacion;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	
	


}
