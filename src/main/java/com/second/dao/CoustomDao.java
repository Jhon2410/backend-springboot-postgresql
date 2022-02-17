package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.Coustom_info_user;

public interface CoustomDao extends JpaRepository<Coustom_info_user, Integer> {

}
