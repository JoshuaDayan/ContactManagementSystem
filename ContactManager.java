package org.example;

import java.util.HashMap;
import java.util.List;

public class ContactManager {
    private HashMap<String, ContactCategory> categories = new HashMap<>();

    public ContactManager() {
        categories.put("Personal", new ContactCategory() {
            @Override
            public void addContact(Contact contact) {

            }

            @Override
            public Contact removeContact(String name) {
                return null;
            }

            @Override
            public List<Contact> viewContacts() {
                return null;
            }

            @Override
            public Contact searchContact(String name) {
                return null;
            }
        });
        categories.put("Work", new ContactCategory() {
            @Override
            public void addContact(Contact contact) {

            }

            @Override
            public Contact removeContact(String name) {
                return null;
            }

            @Override
            public List<Contact> viewContacts() {
                return null;
            }

            @Override
            public Contact searchContact(String name) {
                return null;
            }
        });
    }

    public void addContact(String categoryName, Contact contact) {
        ContactCategory category = categories.get(categoryName);
        if (category != null) {
            category.addContact(contact);
        }
    }

    public ContactCategory searchContact(String categoryName, String name) {
        ContactCategory category = categories.get(categoryName);
       // return category != null ? category.searchContact(name) : null;
        return category;
    }

}
