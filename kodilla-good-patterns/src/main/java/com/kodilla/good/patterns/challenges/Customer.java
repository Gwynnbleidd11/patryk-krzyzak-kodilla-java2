package com.kodilla.good.patterns.challenges;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private String address;

    public Customer(String name, String surname, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
