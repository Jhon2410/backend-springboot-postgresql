package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personalinfo{
	@Id
	@GeneratedValue
	private Integer id_personalInfo;
	
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String country;
	@Column
	private Integer code_country;

	public String getFirst_name(){
		return first_name;
	}

	public void setFirst_name(String first_name){
		this.first_name=first_name;
	}

	public String getLast_name(){
		return last_name;
	}

	public void setLast_name(String last_name){
		this.last_name=last_name;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getCountry(){
		return country;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public int getCode_country(){
		return code_country;
	}

	public void setCode_country(int code_country){
		this.code_country=code_country;
	}
}