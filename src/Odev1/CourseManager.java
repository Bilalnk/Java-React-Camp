package Odev1;

public class CourseManager {

    Course course;

    public CourseManager(Course course) {
        this.course = course;
    }

    public void joinToCourse(Profile student) {
        int std = Course.ID;
        course.students[std] = student;
        Course.setId();
        Profile.setId();
    }

    public void leaveTheCourse(Profile student) {
        boolean isFind = false;
        for (int i = 0; i < course.students.length; i++) {
            int next = i + 1;
            if (!isFind && course.students[i].getId() == student.getId()) {
                isFind = true;
            }
            if (isFind) {
                if (!(next > course.students.length-1))
                    course.students[i] = course.students[next];
            }
        }
    }
}
