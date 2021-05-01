package Odev2;


public class Sample {


    public static void main(String[] args) {

        Instructor instructor1 = new Instructor();
        instructor1.setName("Engin");
        instructor1.setSurname("Demiroğ");

        Course javaCourse = new Course("Java");
        javaCourse.setInstructor(instructor1);
        instructor1.setCourse(javaCourse);
        CourseManager courseManager = new CourseManager(javaCourse);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

        Student student1 = new Student();
        student1.setName("Mustafa");
        student1.setSurname("Gazi");

        Student student2 = new Student();
        student2.setName("Selim");
        student2.setSurname("Ehli");

        Student student3 = new Student();
        student3.setName("Buğra");
        student3.setSurname("Akça");

        User[] users = {student1, student2, student3};

        StudentManager studentManager = new StudentManager();
        studentManager.addAll(users);

        for(Student user: studentManager.students){
            instructor1.getStudents().add(user);
            courseManager.joinToCourse(user);
            System.out.println(user.getName()+" "+user.getSurname());
        }


    }
}
