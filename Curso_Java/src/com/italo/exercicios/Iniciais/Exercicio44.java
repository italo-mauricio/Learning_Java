package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the base: ");
        int base = scan.nextInt();

        System.out.println("Enter the exponent: ");
        int exp = scan.nextInt();

        int result = base;

        for (int i = 1; i < exp; i++){
            result *= base;
        }

        System.out.println("Result: " + result);

    }
}