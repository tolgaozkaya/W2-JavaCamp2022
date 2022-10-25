import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import core.abstracts.LoggerService;
import core.concretes.DatabaseLogger;
import core.concretes.EmailLogger;
import core.concretes.FileLogger;
import dataAccess.abstracts.CourseDao;
import dataAccess.concretes.HibernateCategoryDao;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.JdbcCourseDao;
import dataAccess.concretes.JdbcInstructorDao;
import entities.concretes.Category;
import entities.concretes.Course;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LoggerService[] loggerServices = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggerServices);
        Course course1 = new Course(1, "C# Kursu", 23, "Engin Demirog", "Android Developing");
        Course course2 = new Course(2, "C# Kursu", 23, "Engin Demirog", "Android Developing");
        Course course3 = new Course(2, "Java Kursu", -15, "Engin Demirog", "Android Developing");

        System.out.println("Course1: ");
        courseManager.add(course1);   //Kurs1 ekliyoruz..

        System.out.println("\nCourse2: ");
        courseManager.add(course2);   //Kurs2 ile Kurs1 ismi ayni oldugu için hata vericek..

        System.out.println("\nCourse3: ");
        courseManager.add(course3);  //Kurs3 fiyati eksi oldugu için hata verecek..


        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggerServices);
        Category category1= new Category(1, "Android Programming");
        Category category2 = new Category(2, "Machine Learning");
        Category category3 = new Category(3, "Android Programming");

        System.out.println("\nCategory1: ");
        categoryManager.add(category1);  //Kategori 1'i ekliyoruz..

        System.out.println("\nCategory2: ");
        categoryManager.add(category2);  //Kategori 2'yi ekliyoruz..

        System.out.println("\nCategory3: ");
        categoryManager.add(category3);  //Kategori 3 ile Kategori 1 ismi ayni oldugu icin hata verecek..

    }
}