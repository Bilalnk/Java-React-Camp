package Odev1;

public class Main {

    public static void main(String[] args) {

        Address addressAnkara = new Address("Turkiye", "Kızılay", "Ankara");
        Address addressIstanbul = new Address("Turkiye", "Seyit Nizam", "İstanbul");

        Profile student1 = new Profile("Ahmet", "Aktaş", "aaktas@gmail.com", addressAnkara);
        Profile student2 = new Profile("Mehmet", "Candan", "mcandan@gmail.com", addressIstanbul);

        Course course = new Course("Java");

        CourseManager courseManager = new CourseManager(course);
        courseManager.joinToCourse(student1);
        courseManager.joinToCourse(student2);

        System.out.println(course.courseName+" Kursuna katılanlar:");
        showStudents(course);

        System.out.println("\n**-------------------------**\n");

        courseManager.leaveTheCourse(student1);
        System.out.println(course.courseName+" Kursundan ayrılan:");
        showStudents(course);
    }

    public static void showStudents(Course course){
        for( Profile student: course.students){
            if(student != null){
                System.out.println(student.getName()+" "+student.getSurname());
            }
        }
    }
}


