package com.spotify.dao;

import com.spotify.entity.Song;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

	@Query("SELECT s from Song s where s.album = :albumName")
	List<Song> findAllByAlbum(@Param("albumName") String albumName);
	
	@Query("SELECT s from Song s where s.artist = :artistName")
	List<Song> findAllByArtist(@Param("artistName") String artistName);
}
