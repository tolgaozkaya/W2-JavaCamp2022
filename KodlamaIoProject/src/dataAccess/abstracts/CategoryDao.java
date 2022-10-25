package dataAccess.abstracts;

import entities.concretes.Category;

import java.util.List;


public interface CategoryDao {
    void add(Category category);

    void delete(Category category);

    List<Category> getAllCategories();

}
