package org.example;

import java.util.Scanner;

public class AddressBookApp {
    public static void displayUserMenu() {
        System.out.println("Welcome to your personal address book. Please enter : \n1 - Add a new Contact \n2 - Print out all contacts" +
                "\n3 - Delete a contact \n4 - Total number of contacts so far in your address book \n5 Quit");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AddressBook myAddressBook = new AddressBook();
        displayUserMenu();
    }
}