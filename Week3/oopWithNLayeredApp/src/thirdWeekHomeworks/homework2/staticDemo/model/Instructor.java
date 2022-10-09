package thirdWeekHomeworks.homework2.staticDemo.model;

import java.util.Set;

public class Instructor {
    private int id;
    private String name;
    private String lastName;
    private Set<Course> courses;

    public Instructor() {
    }

    public Instructor(int id, String name, String lastName, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
