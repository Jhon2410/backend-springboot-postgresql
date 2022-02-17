package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.estadisticas_wallet;

public interface EstadisticasDao extends JpaRepository<estadisticas_wallet, Integer> {

}
