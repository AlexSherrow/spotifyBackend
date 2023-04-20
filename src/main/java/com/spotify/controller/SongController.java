package com.spotify.controller;
import com.spotify.entity.Song;
import com.spotify.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    //Production Credentials
    final String url = "http://www.soundslounge.com/";

    //Local Credentials
    //final String url = "http://localhost:3000";
    @Autowired
    private SongService songService;
    @CrossOrigin(origins = url)
    @PostMapping("/addSong")
    public String add(@RequestBody Song song)
    {
        songService.saveSong(song);
        return "New Song is added";
    }
    @CrossOrigin(origins = url)
    @GetMapping("/getAllSongs")
    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }
    
    @CrossOrigin(origins = url)
    @GetMapping("/getAllSongsByAlbum")
    public List<Song> getAllSongsByAlbum(@RequestParam String albumName){
        return songService.getAllSongsByAlbum(albumName);
    }
    
    @CrossOrigin(origins = url)
    @GetMapping("/getAllSongsByArtist")
    public List<Song> getAllSongsByArtist(@RequestParam String artistName){
        return songService.getAllSongsByArtist(artistName);
    }

}
