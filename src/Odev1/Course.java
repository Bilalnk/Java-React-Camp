package Odev1;

public class Course {

    static int ID;
    String courseName;
    Profile[] students = new Profile[1000];

    public Course(String courseName) {
        this.courseName = courseName;
        ID = 0;
    }
    public static void setId() {
        ID += 1;
    }
}
