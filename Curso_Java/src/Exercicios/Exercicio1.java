package Exercicios;

import java.util.Scanner;

/***
 * Exercicio 1:
 *
 * Faça um programa que peça um número e então mostre a mensagem: O número informado foi[numero]
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número ");
        int num = scan.nextInt();

        System.out.println("O número informado foi: " + num);

    }
}