package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * Faça um programa que verifique se um número é par ou ímpar
 */

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
    }
}
