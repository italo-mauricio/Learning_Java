package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Basic program to calculate semester average in Java
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("UFRN SEMESTER GRADE REPORT");
        System.out.println(" ");
        System.out.print("Enter student's name: ");
        String studentName = scan.next();
        System.out.print("Enter student's ID number: ");
        int studentID = scan.nextInt();
        System.out.print("Enter student's first grade: ");
        float grade1 = scan.nextFloat();
        System.out.print("Enter student's second grade: ");
        float grade2 = scan.nextFloat();
        System.out.print("Enter student's third grade: ");
        float grade3 = scan.nextFloat();
        System.out.print("Enter student's fourth grade: ");
        float grade4 = scan.nextFloat();
        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        if (average < 3){
            System.out.println("Student: " + studentName + "\nID number: " + studentID + "\nStatus: FAILED\n" +
                    "\bFinal average: " + average);
        }else if (average <= 5){
            System.out.println("Student: " + studentName + "\nID number: " + studentID + "\nStatus: IN RECOVERY\n" +
                    "\bFinal average: " + average);
        } else if (average <= 10) {
            System.out.println("Student: " + studentName + "\nID number: " + studentID + "\nStatus: APPROVED\n" +
                    "\bFinal average: " + average);
        } else {
            System.out.println("INVALID GRADE!");
        }
    }
}