package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a program that reads two partial grades obtained by a student in a discipline during the semester

 and calculates the student's average.
 */
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the first grade: ");
        float grade1 = scan.nextFloat();
        System.out.print("Enter the second grade: ");
        float grade2 = scan.nextFloat();

        double average = (grade1 + grade2) / 2;

        String performance = "";

        if (average >= 9 && average <= 10){
            performance = "A";
        } else if (average >= 7.5 && average < 9){
            performance = "B";
        } else if (average >= 6 && average < 7.5){
            performance = "C";
        } else if (average >= 4 && average < 6){
            performance = "D";
        } else if (average >= 0 && average < 4){
            performance = "E";
        }

        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Average: " + average);
        System.out.println("Performance: " + performance);

        switch (performance){
            case "A":
                System.out.println("Approved");
                break;
            case "B":
                System.out.println("Approved");
                break;
            case "C":
                System.out.println("Approved");
                break;
            case "D":
                System.out.println("Failed");
                break;
            case "E":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid data!");
                break;
        }
    }
}