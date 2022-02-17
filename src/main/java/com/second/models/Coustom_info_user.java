package com.second.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coustom_info_user {
	
	@Id
	@GeneratedValue
	private Integer id_coustom_info;
	@Column
	private String theme;
	@Column
	private String lenguaje;
	@Column
	private String pricing;

	public String getTheme(){
		return theme;
	}

	public void setTheme(String theme){
		this.theme=theme;
	}

	public String getLenguaje(){
		return lenguaje;
	}

	public void setLenguaje(String lenguaje){
		this.lenguaje=lenguaje;
	}

	public String getPricing(){
		return pricing;
	}

	public void setPricing(String pricing){
		this.pricing=pricing;
	}
}
