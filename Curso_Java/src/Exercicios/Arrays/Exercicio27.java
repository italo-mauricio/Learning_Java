package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho.
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
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite o valor da posição B: ");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }else if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }else{
                vetorC[i] = -1;
            }

        }

    }
}
