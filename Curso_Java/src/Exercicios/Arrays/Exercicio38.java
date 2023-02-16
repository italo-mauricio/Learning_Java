package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada
 * elemento do vetor B seja o fatorial do elemento correspondente em A.
 */
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = 1;  // é opcional, pois sempre será inicializado com zero
            for(int j = 1; j <= vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }
        System.out.println("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ==> ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ==> ");
        }


    }
}
