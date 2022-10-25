package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao {
    ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("Save to Database with jdbc : "+ course.getName());
        courseList.add(course);
    }

    @Override
    public void update(Course course) {
        System.out.println("Update Database with jdbc");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Delete from Database with jdbc");
    }

    @Override
    public ArrayList<Course> getAllCourses() {
        return courseList;
    }
}
