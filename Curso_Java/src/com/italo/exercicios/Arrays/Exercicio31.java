package Curso_Java.src.com.italo.exercicios.Arrays;

import java.util.Scanner;

/***
 * Ler um vetor A de 20 elementos. Construir dois vetores B e C, sendo que nos vetores B e C serão armazenados os valores pares e ímpares de A respectivamente.
 */

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; // ímpares

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição A: " + i);
            vetorA[i] = scan.nextInt();

        }
        int posB = 0;
        int posC = 0;

        for (int i=0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }else{
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }
        System.out.println("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("\nVetor C: ");
        for (int i = 0; i < posC; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
