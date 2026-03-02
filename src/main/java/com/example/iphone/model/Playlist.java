package com.example.iphone.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private final List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Song> getSongs() { return songs; }

    public void addSong(Song s) {
        songs.add(s);
    }

    public void removeSong(Song s) {
        songs.remove(s);
    }

    @Override
    public String toString() {
        return "Playlist: " + name + " (" + songs.size() + " songs)";
    }
}
