package com.second.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class publicacion_network {
	
	@Id
	@GeneratedValue
	private Integer id_publicacion;
	
	@Column
	private Integer id_network;
	
	@Column
	private String titulo;
	
	@Column
	private Date fecha_publicacion;
	
	public Integer getId_publicacion() {
		return id_publicacion;
	}

	public void setId_publicacion(Integer id_publicacion) {
		this.id_publicacion = id_publicacion;
	}

	public Integer getId_network() {
		return id_network;
	}

	public void setId_network(Integer id_network) {
		this.id_network = id_network;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public String getContenido_publicacion() {
		return contenido_publicacion;
	}

	public void setContenido_publicacion(String contenido_publicacion) {
		this.contenido_publicacion = contenido_publicacion;
	}

	public Integer getUsuario_publicacion() {
		return usuario_publicacion;
	}

	public void setUsuario_publicacion(Integer usuario_publicacion) {
		this.usuario_publicacion = usuario_publicacion;
	}

	@Column
	private String contenido_publicacion;
	
	@Column
	private Integer usuario_publicacion;
	
	

}
