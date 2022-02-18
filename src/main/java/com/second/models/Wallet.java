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
	public Integer getId_wallet() {
		return id_wallet;
	}
	public void setId_wallet(Integer id_wallet) {
		this.id_wallet = id_wallet;
	}
	public Integer getStarts() {
		return starts;
	}
	public void setStarts(Integer starts) {
		this.starts = starts;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getEstadisticas() {
		return estadisticas;
	}
	public void setEstadisticas(Integer estadisticas) {
		this.estadisticas = estadisticas;
	}



}
