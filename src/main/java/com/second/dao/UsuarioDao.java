package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.second.models.usuarios;

public interface UsuarioDao extends JpaRepository<usuarios, Integer> {

}


