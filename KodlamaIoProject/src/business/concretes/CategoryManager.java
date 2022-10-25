package business.concretes;

import business.abstracts.CategoryService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private LoggerService[] loggerServices;

    public CategoryManager(CategoryDao categoryDao, LoggerService[] loggerServices) {
        this.categoryDao = categoryDao;
        this.loggerServices = loggerServices;
    }

    @Override
    public void add(Category category) {
        if (CategoryValidator.isValid(category,categoryDao)) {
            categoryDao.add(category);
            for (LoggerService loggerService1: loggerServices) {
                loggerService1.log(category.getName());
            }
        }
    }



    @Override
    public void delete(Category category) {

    }

    @Override
    public ArrayList<Category> getAllCategories() {
        return null;
    }


}
