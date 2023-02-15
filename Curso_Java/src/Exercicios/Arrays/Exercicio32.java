package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares utilizando apenas um vetor extra B.
 * Sugestão: no inicio do vetor B armazene os elementos pares de  A e nas posições restantes do vetor B armazene
 * os elementos de A que são ímpares
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares e ímpares

        int posB = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
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



    }
}
