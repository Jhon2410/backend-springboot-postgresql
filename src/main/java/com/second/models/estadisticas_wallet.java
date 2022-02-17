package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class estadisticas_wallet {
	@Id
	@GeneratedValue
	private Integer id_estadistica_walletl;

	@Column
	private Integer apostado;
	
	@Column
	private Integer prestado;
	
	@Column
	private Integer retirado;
	
	@Column
	private Integer recargado;

	public Integer getId_estadistica_walletl() {
		return id_estadistica_walletl;
	}

	public void setId_estadistica_walletl(Integer id_estadistica_walletl) {
		this.id_estadistica_walletl = id_estadistica_walletl;
	}

	public Integer getApostado() {
		return apostado;
	}

	public void setApostado(Integer apostado) {
		this.apostado = apostado;
	}

	public Integer getPrestado() {
		return prestado;
	}

	public void setPrestado(Integer prestado) {
		this.prestado = prestado;
	}

	public Integer getRetirado() {
		return retirado;
	}

	public void setRetirado(Integer retirado) {
		this.retirado = retirado;
	}

	public Integer getRecargado() {
		return recargado;
	}

	public void setRecargado(Integer recargado) {
		this.recargado = recargado;
	}
	

}
