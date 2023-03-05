package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Write a program that asks for a number and tells if it is positive or negative

 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("The number is negative, and it is: " + num);
        }else{
            System.out.println("The number is positive, and it is: " + num);
        }
    }
}