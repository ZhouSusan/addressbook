package org.example;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Entry> entries = new ArrayList<Entry>();

    public void addEntry(Entry e) {
        entries.add(e);
    }

    public int addressBookSize() {
        return entries.size();
    }

    public void deleteEntry(String thisEntry) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getName().equals(thisEntry)) {
                entries.remove(i);;
            }
        }
    }

    public void printAllContacts() {
        for (Entry e : entries) {
            System.out.println("\n*******\n" + e.getEntryInfo());
        }
    }

    public String searchEntry(String thisEntry) {
        for (int i = 0 ; i < entries.size(); i++) {
            if (entries.get(i).getName().equals(thisEntry)) {
                System.out.format("\nHere is the entry that you have selected: %s", entries.get(i).getEntryInfo());
            }
        }
        return "Sorry, this an invalid entry, and it does not exist in your address nook. Please try again!";
    }
}
