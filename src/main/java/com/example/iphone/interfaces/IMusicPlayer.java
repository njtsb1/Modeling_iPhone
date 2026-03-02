package com.example.iphone.interfaces;

import com.example.iphone.model.Song;
import com.example.iphone.model.Playlist;

public interface IMusicPlayer {
    void play();
    void pause();
    void next();
    void previous();
    void addSong(Song song);
    void removeSong(Song song);
    Playlist getPlaylist();
}
