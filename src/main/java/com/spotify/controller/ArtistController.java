package com.spotify.controller;
import com.spotify.entity.Artist;
import com.spotify.services.ArtistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    //Production Credentials
    final String url = "http://www.soundslounge.com/";

    //Local Credentials
    //final String url = "http://localhost:3000";
    @Autowired
    private ArtistService artistService;
    @CrossOrigin(origins = url)
    @PostMapping("/addArtist")
    public String add(@RequestBody Artist artist)
    {
        artistService.saveArtist(artist);
        return "New Song is added";
    }
    @CrossOrigin(origins = url)
    @GetMapping("/getAllArtists")
    public List<Artist> getAllArtists(){
        return artistService.getAllArtists();
    }

}
