package com.xpanxion.assignments.student;

public class Product extends Base {
    private String name;
    private double price;

    public Product(int newID, String newName, double newPrice) {
        this.id = newID;
        this.name = newName;
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

}
