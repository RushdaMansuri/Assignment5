package com.info.shows.model;

import java.util.List;

public class Details {
    private List<Customers> customers;

    public Details() {
        super();
    }

    public Details(List<Customers> customers) {
        this.customers = customers;
    }

    // Getter Methods
    public List<Customers> getCustomers() {
        return customers;
    }

    // Setter Methods
    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }
}
