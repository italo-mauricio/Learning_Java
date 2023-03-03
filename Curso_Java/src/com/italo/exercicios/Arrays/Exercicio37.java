package Curso_Java.src.com.italo.exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetorA é formado pela potência
 * de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2 ^ 1;
 */
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[11];


        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = Math.pow(2, i);
        }

        System.out.println("\nVetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ==> ");
        }

    }

}
