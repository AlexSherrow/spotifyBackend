package com.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spotify.entity.Album;
import com.spotify.services.AlbumService;

@RestController
@RequestMapping("/album")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
    //Production Credentials
    
	final String url = "http://www.soundslounge.com/";
    //Local credentials
	//final String url = "http://localhost:3000";
	
	@CrossOrigin(origins = url)
	@PostMapping("/addAlbum")
	public String add(@RequestBody Album album)
	{
		albumService.saveAlbum(album);
		return "New album added";
	}
	
	@CrossOrigin(origins = url)
	@GetMapping("/getAllAlbums")
	public List<Album> getAllAlbums(){
		return albumService.getAllAlbums();
	}
}
