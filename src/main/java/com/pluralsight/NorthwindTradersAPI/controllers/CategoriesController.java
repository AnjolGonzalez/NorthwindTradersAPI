package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Lists;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> categories() {
        Lists categoryList = new Lists();
        return categoryList.getCategoryList();
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.GET)
    public Category getID ( @PathVariable int id) {
    Lists categoryLists = new Lists();
    return categoryLists.toString(id);
    }

}
