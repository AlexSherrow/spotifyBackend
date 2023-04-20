package com.spotify.services;

import com.spotify.entity.Song;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface SongService {

    public Song saveSong(Song songs);

    public List<Song> getAllSongs();
    
    public List<Song> getAllSongsByArtist(String artistName);
    
	public List<Song> getAllSongsByAlbum(String albumName);
    
}
