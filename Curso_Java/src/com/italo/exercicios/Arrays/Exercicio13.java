package Curso_Java.src.com.italo.exercicios.Arrays;

import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma
 * de todos os elementos armazenados neste vetor.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            soma += vetorA[i];
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma é: " + soma);
    }
}
