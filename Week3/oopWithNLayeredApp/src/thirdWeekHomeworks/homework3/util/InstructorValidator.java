package thirdWeekHomeworks.homework3.util;

import thirdWeekHomeworks.homework3.model.Instructor;

public class InstructorValidator {

    public static boolean isInstructorValid(Instructor instructor) {
        if (instructor.getId() >= 0 && !instructor.getName().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isInstructorValidForDelete(int id) {
        if (id >= 0) {
            return true;
        }
        return false;
    }
}
