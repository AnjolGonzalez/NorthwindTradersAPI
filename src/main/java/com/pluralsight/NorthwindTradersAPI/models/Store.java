package com.pluralsight.NorthwindTradersAPI.models;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> products;

    public Store() {
        this.products = new ArrayList<>();
        Product product = new Product(1, "object", 1, 2.25);
        Product product2 = new Product(2, "object", 1, 5.25);
        Product product3 = new Product(3, "object", 1, 10.25);
        Product product4 = new Product(4, "object", 1, 8.25);
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }
    public ArrayList<Product> displayProducts() {
        return this.products;
    }

    public Product toString(int id) {
        for (Product product : products) {
            if (id == product.getProductID()) {
                return product;
            }
        }
        return null;
    }
}
