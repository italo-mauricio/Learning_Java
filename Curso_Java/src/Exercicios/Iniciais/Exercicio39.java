package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que pela um número 5 vezes, some e tire a média
 */

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media;
        int num;
        int soma = 0;

        for (int i=0; i<5; i++){
            System.out.print("Digite um número: ");
            num = scan.nextInt();
            soma += num;
        }
        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
