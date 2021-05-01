package Odev2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager extends UserManager{

    List<Student> students = new ArrayList<>();

    @Override
    public void add(User user) {
        Student student = (Student) user;
        students.add(student);
    }

    public void addAll(User[] users){
        for(User user: users){
            add(user);
        }
    }


}
