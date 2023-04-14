package com.spotify.services;

import java.util.List;

import com.spotify.entity.Artist;

public interface ArtistService {

	public Artist saveArtist(Artist artist);
	
	public List<Artist> getAllArtists();
	

}
