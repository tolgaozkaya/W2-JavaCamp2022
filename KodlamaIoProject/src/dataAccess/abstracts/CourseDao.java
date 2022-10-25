package dataAccess.abstracts;

import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public interface CourseDao {
    void add(Course course);
    void update(Course course);
    void delete(Course course);
    ArrayList<Course> getAllCourses();
}
