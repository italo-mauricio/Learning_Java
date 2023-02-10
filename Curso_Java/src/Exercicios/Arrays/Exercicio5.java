package Curso_Java.src.Exercicios.Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        DecimalFormat df = new DecimalFormat("#,###.###");  // talvez não funciona no java atual

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
           System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(df.format(vetorB[i] + " "));
        }
        System.out.println();

    }
}
