package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exporter {
    private List<Contact> contacts;

    public void ContactManager() {
        this.contacts = new ArrayList<>();
    }

  //  public void addContact(Contact contact) {
  //      this.contacts.add(contact);
  //  }

    public void exportToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Name,Email,Phone,Category\n");
            for (Contact contact : contacts) {
                writer.write(contact.getName() + ","
                        + contact.getEmail() + ","
                        + contact.getPhoneNumber() + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importFromCSV(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] data = line.split(",");
                Contact contact = new Contact(data[0], data[1], data[2]);
                this.contacts.add(contact);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
