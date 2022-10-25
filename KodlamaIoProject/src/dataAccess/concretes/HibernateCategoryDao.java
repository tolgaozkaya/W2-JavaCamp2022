package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    ArrayList<Category> categoryArrayList= new ArrayList<>();

    @Override
    public void add(Category category) {
        categoryArrayList.add(category);
        System.out.println("Save to Database with hibernate : " + category.getName());
    }


    @Override
    public void delete(Category category) {
        System.out.println("Delete from Database with hibernate");
    }

    @Override
    public ArrayList<Category> getAllCategories() {
        return categoryArrayList;
    }
}
