package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro dessa área.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a área do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));


    }
}