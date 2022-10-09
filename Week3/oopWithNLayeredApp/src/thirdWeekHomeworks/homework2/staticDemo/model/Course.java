package thirdWeekHomeworks.homework2.staticDemo.model;

public class Course {

    private int id;
    private String courseName;
    private double coursePrice;
    private Category courseCategory;

    public Course() {
    }
    public Course(int id, String courseName, double coursePrice, Category courseCategory) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseCategory = courseCategory;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", courseCategory=" + courseCategory +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }
}
