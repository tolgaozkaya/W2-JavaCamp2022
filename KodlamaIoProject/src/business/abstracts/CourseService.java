package business.abstracts;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public interface CourseService {
    void add(Course course);
    void update(Course course);
    void delete(Course course);
    ArrayList<Course> getAllCourses(CourseDao [] courseDaos);
}
