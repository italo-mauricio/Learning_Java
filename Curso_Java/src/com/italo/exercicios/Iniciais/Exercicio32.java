package Curso_Java.src.com.italo.exercicios.Iniciais;
import java.util.Scanner;

/***
 * Make a simple program to validate a grade
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validGrade = false;
        System.out.println("Let's check a simple validation!");
        do {
            System.out.print("Enter a grade: ");
            double grade = scan.nextDouble();

            if (grade >= 0 && grade <= 10) {
                validGrade = true;
                System.out.println("You entered: " + grade);
            } else {
                System.out.println("Invalid grade, please try again");
            }
        } while (!validGrade);
    }
}