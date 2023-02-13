package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/**
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo
 * as seguintes regras de formação:
 * A) B deverá receber 1 quando A for par.
 * B) B deverá receber zero quando A[i] for ímpar.
 */
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i]  % 2 == 0) ? 1 : 0;
        }
        System.out.println("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
