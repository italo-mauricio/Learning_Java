package Curso_Java.src.com.italo.exercicios.Iniciais;


import java.util.Scanner;

/***

 Exercise 2:

 Write a program that asks for two numbers and prints their sum.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("The sum of the two numbers is: " + (num1 + num2));
    }
}





