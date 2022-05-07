package com.info.shows.model;

import java.util.List;

public class Customers {
    private String userId;
    private String firstName;
    private String lastName;
    private String region;
    private String phoneNumber;
    private String emailAddress;
    private String shippingAddress;
    private List<Orders> orders;

    public Customers() {
        super();
    }

    public Customers(String userId, String firstName, String lastName, String region, String phoneNumber,
            String emailAddress, String shippingAddress, List<Orders> orders) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.shippingAddress = shippingAddress;
        this.orders = orders;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegion() {
        return region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    // Setter Methods

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

}
