package com.zybooks.mealmatch.models;

public class Donation {
    private final String foodItem;
    private final String quantity;
    private final String location;

    public Donation(String foodItem, String quantity, String location) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.location = location;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }
}
