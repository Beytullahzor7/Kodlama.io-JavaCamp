package thirdWeekHomeworks.homework3;

import thirdWeekHomeworks.homework3.business.CategoryManager;
import thirdWeekHomeworks.homework3.business.CourseManager;
import thirdWeekHomeworks.homework3.business.InstructorManager;
import thirdWeekHomeworks.homework3.core.logging.DatabaseLogger;
import thirdWeekHomeworks.homework3.core.logging.FileLogger;
import thirdWeekHomeworks.homework3.core.logging.ILogger;
import thirdWeekHomeworks.homework3.core.logging.SmsLogger;
import thirdWeekHomeworks.homework3.dataAccess.hibernateDao.HibernateCategoryDao;
import thirdWeekHomeworks.homework3.dataAccess.jdbcDao.JdbcCourseDao;
import thirdWeekHomeworks.homework3.dataAccess.jdbcDao.JdbcInstructorDao;
import thirdWeekHomeworks.homework3.model.Category;
import thirdWeekHomeworks.homework3.model.Course;
import thirdWeekHomeworks.homework3.model.Instructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new SmsLogger()};

        List<Category> categoryList = new ArrayList<>();
        Category backend = new Category(1, "Backend");
        Category frontend = new Category(2, "Frontend");
        categoryList.add(backend);
        categoryList.add(frontend);

        List<Course> courseList = new ArrayList<>();
        Course javaCourse = new Course(1, "Java", 200.0, backend);
        Course javaScriptCourse = new Course(2, "JavaScript", 300.0, frontend);
        courseList.add(javaCourse);
        courseList.add(javaScriptCourse);

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(javaCourse);
        courseSet.add(javaScriptCourse);

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(1, "Engin", "Demirog", courseSet));
        instructorList.add(new Instructor(2, "Beytullah", "Zor", courseSet));
        instructorList.add(new Instructor(3, "Mehmet", "Kilic", courseSet));

        System.out.println("******************************");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
        categoryManager.add(new Category(3, "Devops"));
        categoryManager.add(new Category(4, "Devops"));
        categoryManager.delete(3);
        categoryManager.list();

        System.out.println("******************************");

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseList);
        courseManager.add(new Course(3, "C#", 175.0, backend));
        courseManager.add(new Course(4, "C#", 195.0, backend));
        courseManager.list();
        courseManager.add(new Course(5, "Python", -5, backend));
        courseManager.list();

        System.out.println("******************************");

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers, instructorList);
        instructorManager.list();
        instructorManager.add(new Instructor(4, "Ali", "Yilmaz", courseSet));
        instructorManager.list();

        instructorManager.delete(4);
        instructorManager.list();
    }
}
