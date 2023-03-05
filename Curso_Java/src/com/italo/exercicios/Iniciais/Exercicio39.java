package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Make a program that prompts the user to enter a number 5 times, sums them up and calculates the average.
 */
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average;
        int num;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            num = scan.nextInt();
            sum += num;
        }
        average = sum / 5.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}