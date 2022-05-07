package com.info.shows.model;

public class LineItems {
    private String sku;
    private String name;
    private String description;
    private String category;
    private float unitPrice;
    private float salePrice;
    private float quantity;
    private float totalPrice;

    public LineItems() {
        super();
    }

    public LineItems(String sku, String name, String description, String category, float unitPrice,
            float salePrice, float quantity, float totalPrice) {
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.category = category;
        this.unitPrice = unitPrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    // Getter Methods

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    // Setter Methods

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
