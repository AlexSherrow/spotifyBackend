package com.spotify.services;

import com.spotify.dao.SongRepository;
import com.spotify.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
