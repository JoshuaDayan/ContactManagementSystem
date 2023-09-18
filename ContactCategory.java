package org.example;

import java.util.List;

public interface ContactCategory {
    void addContact(Contact contact);
    Contact removeContact(String name);
    List<Contact> viewContacts();
    Contact searchContact(String name);
}
