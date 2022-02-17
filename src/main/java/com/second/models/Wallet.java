package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wallet {
	
	@Id
	@GeneratedValue
	private Integer id_wallet;
	
	@Column
	private Integer starts;
	@Column
	private String estado;
	@Column
	private Integer estadisticas;

	public int getStarts(){
		return starts;
	}

	public void setStarts(int starts){
		this.starts=starts;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public int getEstadisticas(){
		return estadisticas;
	}

	public void setEstadisticas(int estadisticas){
		this.estadisticas=estadisticas;
	}

}
