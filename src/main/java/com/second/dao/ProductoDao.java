package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.ProductoModel;
import com.second.models.usuarioModel;

public interface ProductoDao extends JpaRepository<ProductoModel, Integer> {



}
