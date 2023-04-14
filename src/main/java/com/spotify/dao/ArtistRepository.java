package com.spotify.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spotify.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer>{

}
