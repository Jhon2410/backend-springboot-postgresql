package com.second.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.second.models.videos_publicacion;

public interface VideosDao extends JpaRepository<videos_publicacion, Integer> {

}
