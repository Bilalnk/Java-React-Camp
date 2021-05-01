package Odev2;

import java.util.List;

public class Course {

    static int ID;
    String courseName;
    private Instructor instructor;
    List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        ID = 0;
    }
    public static void setId() {
        ID += 1;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
