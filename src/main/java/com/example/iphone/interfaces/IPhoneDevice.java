package com.example.iphone.interfaces;

import com.example.iphone.model.Contact;

public interface IPhoneDevice {
    void powerOn();
    void answer();
    void powerOff();
    void dial(String number);
    void addContact(Contact contact);
    void removeContact(Contact contact);
}
