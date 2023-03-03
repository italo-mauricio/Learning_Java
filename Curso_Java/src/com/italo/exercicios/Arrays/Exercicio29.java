package Curso_Java.src.com.italo.exercicios.Arrays;


import java.util.Scanner;

/***
 * Ler um vetor A com 10 elementos inteiros e construir um vetor B de mesmo tipo e tamanho
 * e com os mesmos elementos de A, sendo que estes deverão estar invertidos, ou seja, o primeiro
 * elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo de B e assim por diante.
 */
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[vetorB.length - i - 1] = vetorA[i];  //O i quando vale zero e o vetor length quando vale 10, (10 - 0 = 10) ou seja
            // daria um erro de compilação, portanto devemos retirar - 1 para corrigir.
            // Portanto, dessa forma, ele sempre pegará da posição i e irá reduzindo 1.

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
