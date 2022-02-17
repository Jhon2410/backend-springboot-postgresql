package com.second.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class movimientos {
	
	@Id
	@GeneratedValue
	private Integer id_movimiento;
	
	@Column
	private Integer id_wallet;
	
	@Column
	private Date fecha_movimiento;
	
	@Column
	private Integer cantidad_movimiento;
	
	@Column
	private Integer de;
	
	@Column
	private Integer para;
	
	@Column 
	private String tipo_movimiento;
	
	@Column
	private String estado_movimiento;

	public Integer getId_movimiento() {
		return id_movimiento;
	}

	public void setId_movimiento(Integer id_movimiento) {
		this.id_movimiento = id_movimiento;
	}

	public Integer getId_wallet() {
		return id_wallet;
	}

	public void setId_wallet(Integer id_wallet) {
		this.id_wallet = id_wallet;
	}

	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	public Integer getCantidad_movimiento() {
		return cantidad_movimiento;
	}

	public void setCantidad_movimiento(Integer cantidad_movimiento) {
		this.cantidad_movimiento = cantidad_movimiento;
	}

	public Integer getDe() {
		return de;
	}

	public void setDe(Integer de) {
		this.de = de;
	}

	public Integer getPara() {
		return para;
	}

	public void setPara(Integer para) {
		this.para = para;
	}

	public String getTipo_movimiento() {
		return tipo_movimiento;
	}

	public void setTipo_movimiento(String tipo_movimiento) {
		this.tipo_movimiento = tipo_movimiento;
	}

	public String getEstado_movimiento() {
		return estado_movimiento;
	}

	public void setEstado_movimiento(String estado_movimiento) {
		this.estado_movimiento = estado_movimiento;
	}
	
}
