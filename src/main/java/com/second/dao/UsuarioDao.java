package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.usuarioModel;

public interface UsuarioDao extends JpaRepository<usuarioModel, Integer> {

}
