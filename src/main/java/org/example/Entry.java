package org.example;

public class Entry {
    private String name;

    private String address;
    private String phoneNumber;
    private String email;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Entry(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEntryInfo() {
        return "\nName: " + this.name + "\nPhone Number : " +  this.phoneNumber
        + "\nAddress : " + this.address +  "\nEmail : " + this.email;
    }
}
