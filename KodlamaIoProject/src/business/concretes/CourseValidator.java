package business.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;

public class CourseValidator {
    public static boolean isValid(Course course, CourseDao courseDao) {
        ArrayList<Course> courseList = courseDao.getAllCourses();
        for (Course course1 : courseList) {
            if (course1.getName() == course.getName()) {
                System.out.println(("Kurs ismi mevcut. Lutfen degistiriniz.."));
                return false;
            }
        }

        if (course.getPrice() < 0) {
            System.out.println("Kurs fiyati 0'dan kucuk olamaz..");
            return false;
        }
        return true;
    }

}
