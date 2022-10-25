package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {
    ArrayList<Course> courseArrayList = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("Save to Database with hibernate : " + course.getName());
        courseArrayList.add(course);
    }

    @Override
    public void update(Course course) {
        System.out.println("Update Database with hibernate");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Delete from Database with hibernate");
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        return courseArrayList;
    }
}
