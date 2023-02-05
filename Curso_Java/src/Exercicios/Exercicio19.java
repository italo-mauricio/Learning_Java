package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que diga qual dos 3 números pedidos é o maior
 */

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro é o maior");
        }else if (num2 > num1 && num2 > num3){
            System.out.println("O segundo é o maior");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O terceiro é o maior!");
        }else{
            System.out.println("Eles são iguais");
        }
    }
}
