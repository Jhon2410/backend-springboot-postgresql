package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.store_publicacion;

public interface StoreDao extends JpaRepository<store_publicacion, Integer> {

}
