package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.prestamos;

public interface PrestamosDao extends JpaRepository<prestamos, Integer> {

}
