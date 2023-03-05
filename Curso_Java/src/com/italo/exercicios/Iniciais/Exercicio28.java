package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Make a program that checks whether a number is even or odd
 */
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}