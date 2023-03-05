package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Exercise 1:

 Write a program that asks for a number and then shows the message: The number entered was [number]

 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("The number entered was: " + num);
    }
}