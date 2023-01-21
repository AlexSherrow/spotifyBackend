package com.spotify.services;

import com.spotify.entity.Song;

import java.util.List;

public interface SongService {

    public Song saveSong(Song songs);

    public List<Song> getAllSongs();

}
