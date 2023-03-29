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

        course.setTeacher(teacher);

        System.out.println("     Students     ");

        Student[] students = new Student[5];
        for (int i=0; i < 5; i++){
            System.out.println("Enter student's name: " + (i + 1));
            String nameStudent = scan.nextLine();
            System.out.println("Enter student's registration: ");
            String regStudent = scan.nextLine();

            double[] notes = new double[4];

            for(int j=0; j < 4; j++){
                System.out.println("Enter the note: " + (j + 1));
                notes[j] = scan.nextDouble();
            }
            Student student = new Student();
            student.setNameStudent(nameStudent);
            student.setRegistration(regStudent);

        }




    }
}
