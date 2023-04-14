package com.spotify.services;

import com.spotify.dao.ArtistRepository;
import com.spotify.dao.SongRepository;
import com.spotify.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService{

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Artist saveArtist(Artist artist) {return artistRepository.save(artist);}

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

}
