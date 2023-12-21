package com.pluralsight.NorthwindTradersAPI.models;

import com.pluralsight.NorthwindTradersAPI.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

@Component
public class Lists implements CategoryDao {
    List<Category> categoryList = new ArrayList<>();

    @Autowired
    public Lists() {
        categoryList.add(new Category(1, "Object"));

    }
    public List<Category> getCategoryList() {
        return categoryList;
    }

    public Category toString(int id) {
        for (Category category : categoryList) {
            if (id == category.categoryID) {
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        ArrayList<Category> categories = new ArrayList<>();
        for (Category c : categories) {
            categories.add(c);
        }
        return categories;
    }

    @Override
    public Category getByID(int id) {
        return null;
    }
}
