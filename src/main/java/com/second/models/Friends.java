package com.second.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Friends {
	
	@Id
	@GeneratedValue
	private Integer id_friend;
	@Column
	private Integer id_usuario_pertenece;
	@Column
	private String nombre_amigo;
	@Column
	private String estado;
	@Column
	private String foto_url;

	public Integer getId_friend() {
		return id_friend;
	}

	public void setId_friend(Integer id_friend) {
		this.id_friend = id_friend;
	}

	public int getId_usuario_pertenece(){
		return id_usuario_pertenece;
	}

	public void setId_usuario_pertenece(int id_usuario_pertenece){
		this.id_usuario_pertenece=id_usuario_pertenece;
	}

	public String getNombre_amigo(){
		return nombre_amigo;
	}

	public void setNombre_amigo(String nombre_amigo){
		this.nombre_amigo=nombre_amigo;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getFoto_url(){
		return foto_url;
	}

	public void setFoto_url(String foto_url){
		this.foto_url=foto_url;
	}
}
