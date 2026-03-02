package com.example.iphone;

import com.example.iphone.devices.iPhone;
import com.example.iphone.model.Song;
import com.example.iphone.model.Contact;
import com.example.iphone.model.Favorite;

public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone("iPhone 14", "Apple", "123456789012345", 128);

        // Power on
        myPhone.powerOn();

        // Music player demo
        Song s1 = new Song("Blinding Lights", "The Weeknd", 200);
        Song s2 = new Song("Levitating", "Dua Lipa", 203);
        myPhone.addSong(s1);
        myPhone.addSong(s2);
        myPhone.play();
        myPhone.next();
        myPhone.pause();

        // Phone demo
        Contact contact = new Contact("Ana", "+5511999999999", "ana@example.com");
        myPhone.addContact(contact);
        myPhone.dial(contact.getPhone());
        myPhone.answer();
        myPhone.removeContact(contact);

        // Browser demo
        myPhone.navigateTo("https://www.example.com");
        myPhone.navigateTo("https://www.wikipedia.org");
        myPhone.back();
        Favorite fav = new Favorite("Wikipedia", "https://www.wikipedia.org");
        myPhone.addFavorite(fav);
        myPhone.refresh();

        // Power off
        myPhone.powerOff();
    }
}
