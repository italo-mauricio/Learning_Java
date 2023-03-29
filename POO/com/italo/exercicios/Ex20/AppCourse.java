package POO.com.italo.exercicios.Ex20;

import java.util.Scanner;

public class AppCourse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter course name: ");
        String nameCourse = scan.nextLine();
        System.out.println("Enter course time: ");
        String timeCourse = scan.nextLine();
        System.out.println("Enter the teacher's name: ");
        String nameTeacher = scan.nextLine();
        System.out.println("Enter the teacher's email: ");
        String depEmail = scan.nextLine();
        System.out.println("Enter the teacher's department: ");
        String depDepartment = scan.nextLine();

        Course course = new Course();
        course.setNameCourse(nameCourse);
        course.setTime(timeCourse);

        Teacher teacher = new Teacher();
        teacher.setNameTeacher(nameTeacher);
        teacher.setEmail(depEmail);
        teacher.setDepartment(depDepartment);
    }
}
