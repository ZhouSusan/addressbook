package org.example;

import java.util.Scanner;

public class AddressBookApp {
    public static void displayUserMenu() {
        System.out.println("\nWelcome to your personal address book. Please enter a number 1 - 6.  \n1 - Add a new Contact " +
                "\n2 - Print out all contacts" +
                "\n3 - Delete a contact " +
                "\n4 - Total number of contacts so far in your address book " +
                "\n5 - Search Directory for a specific contact" +
                "\n6 Quit \nPlease Enter choice here : ");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AddressBook myAddressBook = new AddressBook();
        displayUserMenu();

        try {
            int userChoice = input.nextInt();
            while (userChoice != 6) {
                switch (userChoice) {
                    case 1:
                        if (myAddressBook.addressBookSize() < 101) {
                            System.out.println("New Entry: \nEnter new person's name (lastName,firstname (no spaces)) : ");
                            String name = input.next();
                            System.out.println("Phone Number (***-***-****) no spaces:");
                            String phoneNumber = input.next();
                            System.out.print("Email (do not enter spaces): ");
                            String email = input.next();
                            System.out.println("Enter Address (Please uses dashes(-) instead of spaces for the main address. " +
                                    "And use comma to separate the zipCode, State, City, and main address. Please do not add an spaces.): ");
                            String address = input.next();

                            myAddressBook.addEntry(new Entry(name, address, phoneNumber, email));
                            break;
                        } else {
                            System.out.println("Sorry, this address book is full!");
                            break;
                        }

                    case 2:
                        System.out.println("Here are all your contacts so far: ");
                        myAddressBook.printAllContacts();
                        break;

                    case 3:
                        System.out.println("Please enter the name of the contact, you wish to delete? ");
                        String deleteName = input.next();
                        myAddressBook.deleteEntry(deleteName);
                        break;

                    case 4:
                        System.out.format("You have a total of %s contacts in your address book.", myAddressBook.addressBookSize());
                        break;

                    case 5:
                        System.out.println("Please enter the name of the contact, you wish to search in your directory:" +
                                "Please enter this desired name in this format (last name,first name) with no spaces.");
                        String searchName = input.next();
                        myAddressBook.searchEntry(searchName);
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1 - 5.");
                        break;
                }
                displayUserMenu();
                userChoice = input.nextInt();
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Looks like something went wrong. Please try again!");
        }
    }
}