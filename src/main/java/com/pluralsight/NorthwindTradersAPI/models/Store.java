package com.pluralsight.NorthwindTradersAPI.models;

import com.pluralsight.NorthwindTradersAPI.dao.ProductDao;

import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class Store implements ProductDao {
    List<Product> products = new ArrayList<>();

    public Store() {
        add(new Product(1 , "Object", 1, 2.25));
        add(new Product(2, "object", 1, 5.25));
        add(new Product(3, "object", 1, 10.25));
        add(new Product(4, "object", 1, 8.25));

    }

    private void add(Product product) { products.add(product);
    }

    public List<Product> displayProducts() {
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

    @Override
    public ArrayList<Product> getAll() {
        ArrayList<Product> products1 = new ArrayList<>();
        for (Product p : products) {
            products1.add(p);
        }
        return products1;
    }

    @Override
    public Category getByID(int id) {
        return null;
    }
}
