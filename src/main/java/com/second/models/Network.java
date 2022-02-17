package com.second.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Network {


	@Id
	@GeneratedValue
	private Integer id_network;
	
	@Column
	private Integer usuario_net;
	
	public Integer getId_network() {
		return id_network;
	}

	public void setId_network(Integer id_network) {
		this.id_network = id_network;
	}

	public int getUsuario_net(){
		return usuario_net;
	}

	public void setUsuario_net(int usuario_net){
		this.usuario_net=usuario_net;
	}
}
