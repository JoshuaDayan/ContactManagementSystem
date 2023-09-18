package org.example;

import java.util.Scanner;

public class Main {
    private static ContactManager manager = new ContactManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("Enter choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> searchContact();
            }
        }
    }

    private static void addContact() {
        System.out.println("Enter Category (Personal/Work):");
        String category = scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, email, phone);
        manager.addContact(category, contact);
    }

    private static void searchContact() {
        System.out.println("Enter Category (Personal/Work):");
        String category = scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        Contact contact = (Contact) manager.searchContact(category, name);
        System.out.println(contact);
    }
}
