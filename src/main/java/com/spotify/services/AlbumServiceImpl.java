package com.spotify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spotify.dao.AlbumRepository;
import com.spotify.entity.Album;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumRepository albumRepository;
	
	@Override
	public Album saveAlbum(Album album) {
		// TODO Auto-generated method stub
		return albumRepository.save(album);
	}
	
	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return albumRepository.findAll();
	}

}
