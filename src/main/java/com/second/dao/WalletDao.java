package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.Wallet;

public interface WalletDao extends JpaRepository<Wallet, Integer> {

}
