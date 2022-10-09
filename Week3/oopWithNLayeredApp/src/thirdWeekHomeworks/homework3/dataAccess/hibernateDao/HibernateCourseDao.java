package thirdWeekHomeworks.homework3.dataAccess.hibernateDao;

import thirdWeekHomeworks.homework3.dataAccess.CourseDao;
import thirdWeekHomeworks.homework2.staticDemo.model.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course Added");
    }

    @Override
    public void update(Course course) {
        System.out.println("Course Updated");
    }

    @Override
    public void delete(int courseId) {
        System.out.println("Course Deleted");
    }

    @Override
    public void list() {
        System.out.println("Course Listed");
    }
}
