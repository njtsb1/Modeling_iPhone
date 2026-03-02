package com.example.iphone.devices;

import com.example.iphone.interfaces.IMusicPlayer;
import com.example.iphone.interfaces.IPhoneDevice;
import com.example.iphone.interfaces.IInternetBrowser;
import com.example.iphone.model.Song;
import com.example.iphone.model.Playlist;
import com.example.iphone.model.Contact;
import com.example.iphone.model.Favorite;

import java.util.ArrayList;
import java.util.List;

public class iPhone extends Smartphone implements IMusicPlayer, IPhoneDevice, IInternetBrowser {

    private Playlist playlist;
    private final List<Contact> contacts;
    private final List<Favorite> favorites;

    private final List<String> history;
    private int historyIndex;

    private boolean playing;
    private int currentIndex;

    public iPhone(String model, String manufacturer, String imei, int memoryGb) {
        super(model, manufacturer, imei, memoryGb);
        this.playlist = new Playlist("Default");
        this.contacts = new ArrayList<>();
        this.favorites = new ArrayList<>();
        this.history = new ArrayList<>();
        this.historyIndex = -1;
        this.playing = false;
        this.currentIndex = -1;
    }

    // IMusicPlayer
    @Override
    public void play() {
        if (playlist.getSongs().isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (currentIndex < 0) currentIndex = 0;
        playing = true;
        Song current = playlist.getSongs().get(currentIndex);
        System.out.println("Playing: " + current.getTitle() + " - " + current.getArtist());
    }

    @Override
    public void pause() {
        if (playing) {
            playing = false;
            System.out.println("Playback paused.");
        } else {
            System.out.println("No song is playing.");
        }
    }

    @Override
    public void next() {
        if (playlist.getSongs().isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        currentIndex = (currentIndex + 1) % playlist.getSongs().size();
        playing = true;
        System.out.println("Next: " + playlist.getSongs().get(currentIndex).getTitle());
    }

    @Override
    public void previous() {
        if (playlist.getSongs().isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        currentIndex = (currentIndex - 1 + playlist.getSongs().size()) % playlist.getSongs().size();
        playing = true;
        System.out.println("Previous: " + playlist.getSongs().get(currentIndex).getTitle());
    }

    @Override
    public void addSong(Song song) {
        playlist.addSong(song);
        System.out.println("Song added: " + song.getTitle());
    }

    @Override
    public void removeSong(Song song) {
        playlist.removeSong(song);
        System.out.println("Song removed: " + song.getTitle());
    }

    @Override
    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    // IPhoneDevice
    @Override
    public void powerOn() {
        powerOnDevice();
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
    }

    @Override
    public void powerOff() {
        powerOffDevice();
    }

    @Override
    public void dial(String number) {
        System.out.println("Dialing " + number + "...");
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
    }

    @Override
    public void removeContact(Contact contact) {
        contacts.remove(contact);
        System.out.println("Contact removed: " + contact.getName());
    }

    // IInternetBrowser
    @Override
    public void openUrl(String url) {
        navigateTo(url);
    }

    @Override
    public void navigateTo(String url) {
        if (!poweredOn) {
            System.out.println("Please power on the device to browse.");
            return;
        }
        if (historyIndex < history.size() - 1) {
            history.subList(historyIndex + 1, history.size()).clear();
        }
        history.add(url);
        historyIndex = history.size() - 1;
        System.out.println("Navigating to: " + url);
    }

    @Override
    public void back() {
        if (historyIndex > 0) {
            historyIndex--;
            System.out.println("Back to: " + history.get(historyIndex));
        } else {
            System.out.println("No previous page in history.");
        }
    }

    @Override
    public void forward() {
        if (historyIndex < history.size() - 1) {
            historyIndex++;
            System.out.println("Forward to: " + history.get(historyIndex));
        } else {
            System.out.println("No next page in history.");
        }
    }

    @Override
    public void refresh() {
        if (historyIndex >= 0 && historyIndex < history.size()) {
            System.out.println("Refreshing: " + history.get(historyIndex));
        } else {
            System.out.println("No page to refresh.");
        }
    }

    @Override
    public void addFavorite(Favorite favorite) {
        favorites.add(favorite);
        System.out.println("Favorite added: " + favorite.getTitle());
    }

    @Override
    public void removeFavorite(Favorite favorite) {
        favorites.remove(favorite);
        System.out.println("Favorite removed: " + favorite.getTitle());
    }

    // Utilities
    public List<Contact> getContacts() { return contacts; }
    public List<Favorite> getFavorites() { return favorites; }
    public List<String> getHistory() { return history; }
}
