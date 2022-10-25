package business.abstracts;

import entities.concretes.Instructor;

import java.util.List;

public interface InstructorService {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(Instructor instructor);
    List<Instructor> getAllInstructors();
}
