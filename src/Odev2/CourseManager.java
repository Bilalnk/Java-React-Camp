package Odev2;

public class CourseManager {

    Course course;

    public CourseManager(Course course) {
        this.course = course;
    }

    public void joinToCourse(Student student) {
        int std = Course.ID;
        course.students.add(student);
        Course.setId();
    }

    public void leaveTheCourse(Student student) {
        boolean isFind = false;
        int index = -1;
        for (int i = 0; i < course.students.size(); i++) {
            if (course.students.get(i).getId() == student.getId()) {
                isFind = true;
                index = i;
                break;
            }
        }
            if (isFind) {
                    course.students.remove(index);
            }
    }
}
