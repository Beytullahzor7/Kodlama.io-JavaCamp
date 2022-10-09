package thirdWeekHomeworks.homework3.util;

public class CourseValidator {

    public static boolean isCoursePriceValid(double price) {
        return price >= 0;
    }

    public static boolean isCourseValidForDelete(int id) {
        if (id >= 0) {
            return true;
        }
        return false;
    }
}
