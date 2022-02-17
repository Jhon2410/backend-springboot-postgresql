package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class usuarios {
	@Id
	@GeneratedValue
	private Integer id_usuario;
	@Column
	private String usuario_username;
	@Column
	private String usuario_contraseña;
	@Column
	private Integer wallet;
	@Column
	private Integer personalInfo;
	@Column
	private Integer coustom_info;
	@Column
	private String foto_url;

	public String getUsuario_username(){
		return usuario_username;
	}

	public void setUsuario_username(String usuario_username){
		this.usuario_username=usuario_username;
	}

	public String getUsuario_contraseña(){
		return usuario_contraseña;
	}

	public void setUsuario_contraseña(String usuario_contraseña){
		this.usuario_contraseña=usuario_contraseña;
	}

	public int getWallet(){
		return wallet;
	}

	public void setWallet(int wallet){
		this.wallet=wallet;
	}

	public int getPersonalinfo(){
		return personalInfo;
	}

	public void setPersonalinfo(int personalInfo){
		this.personalInfo=personalInfo;
	}

	public int getCoustom_info(){
		return coustom_info;
	}

	public void setCoustom_info(int coustom_info){
		this.coustom_info=coustom_info;
	}

	public String getFoto_url(){
		return foto_url;
	}

	public void setFoto_url(String foto_url){
		this.foto_url=foto_url;
	}
}
