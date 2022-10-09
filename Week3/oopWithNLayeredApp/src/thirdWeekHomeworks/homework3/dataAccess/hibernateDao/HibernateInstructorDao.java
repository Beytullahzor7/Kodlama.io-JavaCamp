package thirdWeekHomeworks.homework3.dataAccess.hibernateDao;

import thirdWeekHomeworks.homework3.dataAccess.InstructorDao;
import thirdWeekHomeworks.homework2.staticDemo.model.Instructor;

public class HibernateInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor Added");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor Updated");
    }

    @Override
    public void delete(int instructorId) {
        System.out.println("Instructor Deleted");
    }

    @Override
    public void list() {
        System.out.println("Instructor Listed");
    }
}
