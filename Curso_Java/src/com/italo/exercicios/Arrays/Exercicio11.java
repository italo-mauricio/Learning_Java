package Curso_Java.src.com.italo.exercicios.Arrays;

import java.util.Scanner;

/***
 *  Criar um vetor A inteiro com 10 elementos. Construir um vetor B de mesmo tipo e tamanho,
 *  sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2
 *  B[i] = A[i] % 2;
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];



        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor do vetor A da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;

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


    }
}
