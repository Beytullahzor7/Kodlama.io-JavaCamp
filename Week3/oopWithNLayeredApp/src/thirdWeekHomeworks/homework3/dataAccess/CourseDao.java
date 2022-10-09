package thirdWeekHomeworks.homework3.dataAccess;

import thirdWeekHomeworks.homework3.model.Course;

public interface CourseDao {

    void add(Course course);

    void update(Course course);

    void delete(int courseId);

    void list();
}
