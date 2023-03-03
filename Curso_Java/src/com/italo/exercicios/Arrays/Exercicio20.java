package Curso_Java.src.com.italo.exercicios.Arrays;

import java.util.Scanner;

/***
 * refatorando um código anterior
 */

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for(int i = 0; i < idades.length; i++){
            System.out.println("Digite sua idade: " + (i+1));
            idades[i] = scan.nextInt();
        }
        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++){
            if (idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            }else if (idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }
        }
        System.out.println("Vetor idades; ");
        for (int i=0; i < idades.length; i++){
            System.out.print(" / " +idades[i] + " ");
        }
        System.out.println();
        System.out.println("Menor idade: " + menor);
        System.out.println("Posição menor idade no vetor: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Posição maior idade no vetor: " + indexMaior);
    }
}
