package com.second.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class store_publicacion {
	
	@Id
	@GeneratedValue
	private Integer id_store;
	
	@Column
	private Integer id_publicacion;
	
	@Column
	private Integer id_network;
	
	@Column
	private String titulo_producto;
	
	@Column
	private String descripcion_producto;
	
	@Column
	private Integer precio;
	
	@Column
	private Integer calificacion_producto;
	
	@Column
	private String url_portada;
	
	@Column
	private Date fecha_publicacion;
	
	@Column
	private String estado_producto;
	
	@Column
	private Integer suply_producto;
	
	@Column
	private Integer descuento_producto;

	public Integer getId_store() {
		return id_store;
	}

	public void setId_store(Integer id_store) {
		this.id_store = id_store;
	}

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

	public String getTitulo_producto() {
		return titulo_producto;
	}

	public void setTitulo_producto(String titulo_producto) {
		this.titulo_producto = titulo_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getCalificacion_producto() {
		return calificacion_producto;
	}

	public void setCalificacion_producto(Integer calificacion_producto) {
		this.calificacion_producto = calificacion_producto;
	}

	public String getUrl_portada() {
		return url_portada;
	}

	public void setUrl_portada(String url_portada) {
		this.url_portada = url_portada;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public String getEstado_producto() {
		return estado_producto;
	}

	public void setEstado_producto(String estado_producto) {
		this.estado_producto = estado_producto;
	}

	public Integer getSuply_producto() {
		return suply_producto;
	}

	public void setSuply_producto(Integer suply_producto) {
		this.suply_producto = suply_producto;
	}

	public Integer getDescuento_producto() {
		return descuento_producto;
	}

	public void setDescuento_producto(Integer descuento_producto) {
		this.descuento_producto = descuento_producto;
	}
	
}
