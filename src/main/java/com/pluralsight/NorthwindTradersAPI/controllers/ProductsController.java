package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import com.pluralsight.NorthwindTradersAPI.models.Store;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

public class ProductsController {
    @RequestMapping(path = "/products" , method = RequestMethod.GET)
    public ArrayList<Product> getProducts()
    {
        Store store = new Store();
        return store.displayProducts();
    }

    @RequestMapping(path="/products/{id}", method=RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        Store store = new Store();
        return store.toString(id);
    }

}
