package com.spotify.services;

import java.util.List;

import com.spotify.entity.Album;

public interface AlbumService {
	
	public List<Album> getAllAlbums();
	
	public Album saveAlbum(Album album);

	

}
