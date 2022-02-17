package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.Network;

public interface NetworkDao extends JpaRepository<Network, Integer> {

}
