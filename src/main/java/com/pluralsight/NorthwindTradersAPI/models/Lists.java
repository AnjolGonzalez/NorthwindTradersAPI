package com.pluralsight.NorthwindTradersAPI.models;

import java.util.ArrayList;

public class Lists {
    ArrayList<Category> categoryList;

    public Lists() {
        this.categoryList = new ArrayList<>();
        Category category = new Category(1, "Object");
        Category category2 = new Category(1, "Object");
        Category category3 = new Category(1, "Object");
        Category category4 = new Category(1, "Object");

        categoryList.add(1, category);
        categoryList.add(2, category2);
        categoryList.add(3, category3);
        categoryList.add(4, category4);

    }
    public ArrayList<Category> getCategoryList() {
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

}
