package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDao {
    List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        System.out.println("Save to Database with jdbc : "+ instructor.getFirstName()+" "+instructor.getLastName());
        instructors.add(instructor);
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Update Database with jdbc");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Delete from Database with jdbc");
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructors;
    }
}
