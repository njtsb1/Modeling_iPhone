package com.example.iphone;

import com.example.iphone.devices.iPhone;
import com.example.iphone.model.Song;
import com.example.iphone.model.Contact;
import com.example.iphone.model.Favorite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class iPhoneTest {

    private iPhone phone;

    @BeforeEach
    void setUp() {
        phone = new iPhone("iPhone 14", "Apple", "123456789012345", 128);
        phone.powerOn();
    }

    @Test
    void testMusicPlayer() {
        Song s1 = new Song("Blinding Lights", "The Weeknd", 200);
        Song s2 = new Song("Levitating", "Dua Lipa", 203);

        phone.addSong(s1);
        phone.addSong(s2);

        assertEquals(2, phone.getPlaylist().getSongs().size(), "Playlist should contain 2 songs");

        // play should set current index and playing state (behavior observed via console)
        phone.play();
        phone.next();
        phone.previous();
        phone.pause();

        // ensure playlist still intact after playback operations
        assertEquals(2, phone.getPlaylist().getSongs().size(), "Playlist should remain unchanged after playback operations");
    }

    @Test
    void testPhoneFunctions() {
        Contact contact = new Contact("Ana", "+5511999999999", "ana@example.com");

        phone.addContact(contact);
        assertTrue(phone.getContacts().contains(contact), "Contact should be present after adding");

        phone.dial(contact.getPhone());
        phone.answer();

        phone.removeContact(contact);
        assertFalse(phone.getContacts().contains(contact), "Contact should be removed");
    }

    @Test
    void testBrowserFunctions() {
        phone.navigateTo("https://www.example.com");
        phone.navigateTo("https://www.wikipedia.org");

        assertEquals(2, phone.getHistory().size(), "History should contain two entries after navigation");

        phone.back();
        phone.forward();

        Favorite fav = new Favorite("Wikipedia", "https://www.wikipedia.org");
        phone.addFavorite(fav);
        assertTrue(phone.getFavorites().contains(fav), "Favorite should be present after adding");

        phone.removeFavorite(fav);
        assertFalse(phone.getFavorites().contains(fav), "Favorite should be removed");
    }
}
