package thirdWeekHomeworks.homework3.business;

import thirdWeekHomeworks.homework3.core.logging.ILogger;
import thirdWeekHomeworks.homework3.dataAccess.CourseDao;
import thirdWeekHomeworks.homework3.model.Course;
import thirdWeekHomeworks.homework3.util.CourseValidator;

import java.util.List;

public class CourseManager {
    private final CourseDao courseDao;
    private final ILogger[] loggers;
    private final List<Course> courseList;

    public CourseManager(CourseDao courseDao, ILogger[] loggers, List<Course> courseList) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courseList = courseList;
    }

    private void logMethod() {
        for (ILogger logger : loggers) {
            logger.log("Logged");
        }
    }

    public void add(Course course) {
        boolean result = courseList.stream().anyMatch(i -> i.getCourseName().equals(course.getCourseName()));

        if (!result && CourseValidator.isCoursePriceValid(course.getCoursePrice())) {
            courseList.add(course);
            courseDao.add(course);
            logMethod();
        } else {
            System.out.println("Error Occured!!!");
        }
    }

    public void update(Course course) {
        Course courseUpdate = new Course();

        courseUpdate.setId(course.getId());
        courseUpdate.setCourseName(course.getCourseName());
        courseUpdate.setCoursePrice(course.getCoursePrice());
        courseUpdate.setCourseCategory(course.getCourseCategory());

        System.out.println("Updated");
        courseList.add(courseUpdate);
        logMethod();
    }

    public void delete(int courseId) {
        String result = CourseValidator.isCourseValidForDelete(courseId) ? "Deleted" : "Could not Deleted";
        System.out.println(result);
        courseList.remove(courseId - 1);
        logMethod();

    }

    public void list() {
        for (Course course : courseList) {
            System.out.println(course.toString());
        }
    }
}
