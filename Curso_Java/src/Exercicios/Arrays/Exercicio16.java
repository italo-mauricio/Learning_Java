package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

/***
 * Crie um veotor A de 10 elementos inteiros. Implemente um programa que defina o percetual de elementos pares e ímpares
 * respectivamente, armazenados neste valor..
 */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA =  new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição: ");
            vetorA[i] = scan.nextInt();
        }

        int impar = 0;

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                impar++;
            }
        }

        int par = vetorA.length - impar;

        /* Calculando a porcentagem
        *
        * vetorA.length    - 100 %
        * par              - X
        *
        * X * vetorA.length == par * 100
        * X == (par * 100) / vetorA.length
        * */

        double porcPar = (par * 100) / vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.println("Vetor A: " );
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem de números Pares: " + porcPar + " %");
        System.out.println("Porcentagem de números ímpares: " + porcImpar + " %");


    }
}
