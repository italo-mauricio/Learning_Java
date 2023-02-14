package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo
 * as seguintes regras de formação: A) C deverá receber 1 quando A for maior que B. B) C deverá receber 0 quando A for igual a B
 * C) C deverá receber -1 quando A for menor que B.
 */

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição A: ");
            vetorA[i] = scan.nextInt();

        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor da posição B: ");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
        }

            System.out.println("\nVetor A: ");
            for (int i = 0; i < vetorA.length; i++){
                System.out.print(vetorA[i] + " ");
            }
            System.out.println("\nVetor B: ");
            for (int i = 0; i < vetorB.length; i++){
                System.out.print(vetorB[i] + " ");
            }
            System.out.println("\nVetor C: ");
            for (int i = 0; i < vetorC.length; i++){
                System.out.print(vetorC[i] + " ");
            }


    }
}
