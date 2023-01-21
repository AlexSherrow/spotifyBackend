package com.spotify.controller;
import com.spotify.entity.Song;
import com.spotify.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;
    @CrossOrigin(origins = "https://alexsherrowspotifyfrontend.herokuapp.com/")
    @PostMapping("/add")
    public String add(@RequestBody Song song)
    {
        songService.saveSong(song);
        return "New Song is added";
    }
    @CrossOrigin(origins = "https://alexsherrowspotifyfrontend.herokuapp.com/")
    @GetMapping("/getAll")
    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }

}
