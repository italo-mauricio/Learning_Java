package Curso_Java.src.com.italo.exercicios.Arrays;

import java.util.Scanner;

/***
 *  * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C
 *  * é a divisão dos respectivos elementos em A e B, ou seja:
 *  * C[i] = A[i] / B[i];
 */

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];


        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor do vetor A da posição específica: " + i);
            vetorA[i] = scan.nextInt();

        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite o valor do vetor B da posição específica: " + i);
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
