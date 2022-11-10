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
                            System.out.println("New Entry: \nEnter new person's name : ");
                            input.nextLine();
                            String name = input.nextLine();
                            System.out.println("Phone Number (***-***-****): ");
                            String phoneNumber = input.nextLine();
                            System.out.print("Email: ");
                            String email = input.nextLine();
                            System.out.println("Enter Address: ");
                            String address = input.nextLine();

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
                        input.nextLine();
                        String deleteName = input.nextLine();
                        myAddressBook.deleteEntry(deleteName);
                        break;

                    case 4:
                        System.out.format("You have a total of %s contacts in your address book.", myAddressBook.addressBookSize());
                        break;

                    case 5:
                        System.out.println("Please enter the name of the contact, you wish to search in your directory: ");
                        input.nextLine();
                        String searchName = input.nextLine();
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