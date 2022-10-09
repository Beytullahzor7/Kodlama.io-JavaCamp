package thirdWeekHomeworks.homework3.business;

import thirdWeekHomeworks.homework3.core.logging.ILogger;
import thirdWeekHomeworks.homework3.dataAccess.InstructorDao;
import thirdWeekHomeworks.homework3.model.Instructor;
import thirdWeekHomeworks.homework3.util.InstructorValidator;

import java.util.List;

public class InstructorManager {
    private final InstructorDao instructorDao;
    private final ILogger[] loggers;
    private final List<Instructor> instructorList;

    public InstructorManager(InstructorDao instructorDao, ILogger[] loggers, List<Instructor> instructorList) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructorList = instructorList;
    }

    private void logMethod() {
        for (ILogger logger : loggers) {
            logger.log("Logged");
        }
    }

    public void add(Instructor instructor) {
        if (InstructorValidator.isInstructorValid(instructor)) {
            instructorList.add(instructor);
            instructorDao.add(instructor);
            logMethod();
        }
    }

    public void update(Instructor instructor) {
        Instructor instructorUpdate = new Instructor();

        instructorUpdate.setId(instructor.getId());
        instructorUpdate.setName(instructor.getName());
        instructorUpdate.setLastName(instructor.getLastName());
        instructorUpdate.setCourses(instructor.getCourses());

        System.out.println("Updated");
        instructorList.add(instructorUpdate);
        logMethod();
    }

    public void delete(int instructorId) {
        String result = InstructorValidator.isInstructorValidForDelete(instructorId) ? "Deleted" : "Could not Deleted";
        System.out.println(result);
        instructorList.remove(instructorId - 1);
        logMethod();
    }

    public void list() {
        for (Instructor instructor : instructorList) {
            System.out.println(instructor.getName());
        }
        System.out.println("Listed");
        logMethod();
    }
}
