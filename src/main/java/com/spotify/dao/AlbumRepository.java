package com.spotify.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spotify.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
