package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class prestamos {
	
	@Id
	@GeneratedValue
	private Integer id_prestamo;

	@Column
	private Integer cantidad;
	
	@Column
	private Integer id_prestador;

	@Column
	private Integer id_deudor;
	
	@Column
	private String estado;

	public Integer getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(Integer id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getId_prestador() {
		return id_prestador;
	}

	public void setId_prestador(Integer id_prestador) {
		this.id_prestador = id_prestador;
	}

	public Integer getId_deudor() {
		return id_deudor;
	}

	public void setId_deudor(Integer id_deudor) {
		this.id_deudor = id_deudor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
