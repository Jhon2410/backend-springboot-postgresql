package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.Friends;



public interface FriendsDao extends JpaRepository<Friends, Integer> {

}