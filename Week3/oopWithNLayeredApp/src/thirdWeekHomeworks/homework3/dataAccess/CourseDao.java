package thirdWeekHomeworks.homework3.dataAccess;

import thirdWeekHomeworks.homework2.staticDemo.model.Course;

public interface CourseDao {

    void add(Course course);

    void update(Course course);

    void delete(int courseId);

    void list();
}
