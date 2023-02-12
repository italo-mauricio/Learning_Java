package Curso_Java.src.Exercicios.Arrays;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite sua idade: " + (i+1));
            vetorA[i] = scan.nextInt();
        }
        int qtd = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > 35){
                qtd++;
            }
        }


    }
}
