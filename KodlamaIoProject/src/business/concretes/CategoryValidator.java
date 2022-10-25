package business.concretes;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Category;

public class CategoryValidator {
    public static boolean isValid(Category category, CategoryDao categoryDao) {
        for (Category category1 : categoryDao.getAllCategories()) {
            if (category1.getName() == category.getName()) {
                System.out.println("Kategori ismi mevcut. Lutfen degiştiriniz...");
                return false;
            }
        }
        return true;
    }
}
