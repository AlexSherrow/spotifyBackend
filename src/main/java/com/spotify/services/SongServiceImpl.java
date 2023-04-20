package com.spotify.services;

import com.spotify.dao.SongRepository;
import com.spotify.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class SongServiceImpl implements  SongService{

    @Autowired
    private SongRepository songRepository;

    @Override
    public Song saveSong(Song song) {return songRepository.save(song);}

    @Override
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

	@Override
	public List<Song> getAllSongsByAlbum(String albumName) {
		return songRepository.findAllByAlbum(albumName);
	}

	@Override
	public List<Song> getAllSongsByArtist(String artistName) {
		// TODO Auto-generated method stub
		return songRepository.findAllByArtist(artistName);
	}
}
