package com.kodilla.good.patterns.challenges.food2door;

public class Producer {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private int code;

    public Producer(String name, String email, String phoneNumber, String address, int code) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getCode() {
        return code;
    }
}
