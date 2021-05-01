package Odev2;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends UserManager {

    List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(User user) {
        Instructor instructor = (Instructor) user;
        instructors.add(instructor);
    }
}
