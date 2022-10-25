package business.abstracts;

import entities.concretes.Category;

import java.util.ArrayList;
import java.util.List;

public interface CategoryService {
    void add(Category category);
    void delete(Category category);
    ArrayList<Category> getAllCategories();
}
