package Odev2;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User{

    private Course course;
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
