package com.example.pramod.a295bllogin;

/**
 * Created by nirupama on 4/8/2017.
 */

public class User {
    private String Name;
    private String Email;
    private String Password;
    private String ContactNumber;

    public User() {
        //required for firebase database
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }
}