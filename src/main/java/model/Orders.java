package com.info.shows.model;

import java.util.List;

public class Orders {
    private String orderId;
    private String currency;
    private float subtotal;
    private float discountAmount;
    private float taxAmount;
    private float grandTotal;
    private List<LineItems> lineItems;

    public Orders() {
        super();
    }

    public Orders(String orderId, String currency, float subtotal, float discountAmount, float taxAmount,
            float grandTotal, List<LineItems> lineItems) {
        this.orderId = orderId;
        this.currency = currency;
        this.subtotal = subtotal;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.grandTotal = grandTotal;
        this.lineItems = lineItems;
    }

    // Getter Methods

    public String getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public List<LineItems> getlineItems() {
        return lineItems;
    }

    // Setter Methods

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public void setlineItems(List<LineItems> lineItems) {
        this.lineItems = lineItems;
    }
}
