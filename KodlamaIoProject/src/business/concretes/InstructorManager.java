package business.concretes;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void add(Instructor instructor) {
        instructorDao.add(instructor);
    }

    @Override
    public void update(Instructor instructor) {
        instructorDao.update(instructor);
    }

    @Override
    public void delete(Instructor instructor) {
        instructorDao.delete(instructor);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return null;
    }


}
