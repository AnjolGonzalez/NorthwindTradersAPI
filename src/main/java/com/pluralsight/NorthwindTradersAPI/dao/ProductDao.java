package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;

import java.util.ArrayList;

public interface ProductDao {
    ArrayList<Product> getAll();
    Category getByID(int id);
}
