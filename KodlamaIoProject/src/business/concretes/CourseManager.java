package business.concretes;

import business.abstracts.CourseService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.CourseDao;
import dataAccess.concretes.JdbcInstructorDao;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {

    private CourseDao courseDao;
    private LoggerService[] loggerServices;

    public CourseManager(CourseDao courseDao, LoggerService[] loggerServices) {
        this.courseDao = courseDao;
        this.loggerServices = loggerServices;

    }

    @Override
    public void add(Course course) {
        if (CourseValidator.isValid(course,courseDao)) {
            courseDao.add(course);
            for (LoggerService loggerService1: loggerServices) {
                loggerService1.log(course.getName());
            }
        }
    }


    @Override
    public void update(Course course) {
        courseDao.update(course);
    }

    @Override
    public void delete(Course course) {
        courseDao.delete(course);
    }


    public ArrayList<Course> getAllCourses(CourseDao[] courseDaos) {
        ArrayList<Course> AllCourseList = new ArrayList<>();
        for (CourseDao courseDao1 : courseDaos) {
            AllCourseList.addAll(courseDao1.getAllCourses());
        }
        return AllCourseList;
    }

}
