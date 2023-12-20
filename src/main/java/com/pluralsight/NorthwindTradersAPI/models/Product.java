package com.pluralsight.NorthwindTradersAPI.models;

public class Product {
    private int productID;
    private String name;
    private int category;
    private double price;

    public Product(int productID, String name, int category, double price) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", categoryID='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
