package Exercicios;


import java.util.Scanner;

/***
 * Faça um programa que converta metros para centímetros.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos metros você deseja converter para CM(centímetros): ");
        float metros = scan.nextFloat();
        float convertido = metros * 100;

        System.out.println("O resultado da conversão de: " +metros+ " metros para CM é de: " + convertido);
    }
}