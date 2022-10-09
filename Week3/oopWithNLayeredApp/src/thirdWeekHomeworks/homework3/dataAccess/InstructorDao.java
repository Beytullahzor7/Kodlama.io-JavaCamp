package thirdWeekHomeworks.homework3.dataAccess;

import thirdWeekHomeworks.homework3.model.Instructor;

public interface InstructorDao {

    void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(int instructorId);

    void list();
}
