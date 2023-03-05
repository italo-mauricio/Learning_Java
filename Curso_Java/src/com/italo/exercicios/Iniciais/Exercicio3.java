package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Exercise 3:

 Write a program that asks for 4 quarterly grades and shows the average.

 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first grade: ");
        float nota1 = scan.nextFloat();
        System.out.print("Enter the second grade: ");
        float nota2 = scan.nextFloat();
        System.out.print("Enter the third grade: ");
        float nota3 = scan.nextFloat();
        System.out.print("Enter the fourth grade: ");
        float nota4 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media < 3){
            System.out.println("You have failed, your average grade was: " + media);
        } else if (media <= 5) {
            System.out.println("You are in recovery, your average grade was: " + media);
        }else if (media > 5 && media < 10){
            System.out.println("You have been approved, your average grade was: " + media);
        }
    }
}