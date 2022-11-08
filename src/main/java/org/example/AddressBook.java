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
        int deleteThisEntry = -1;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getName().equals(i)) {
                deleteThisEntry = i;
            }
        }

        if (deleteThisEntry >= 0) {
            entries.remove(deleteThisEntry);
        }
    }

    public void printAllContacts() {
        for (Entry e : entries) {
            System.out.println("\n*******\n" + e);
        }
    }
}
