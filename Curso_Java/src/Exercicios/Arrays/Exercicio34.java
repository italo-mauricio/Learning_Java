package Curso_Java.src.Exercicios.Arrays;


import java.util.Scanner;

/***
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem
 * indicando se o respectivo elemento é um número primo ou não.
 */
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        String msg = "";
        boolean primo = true;
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){

            for (int j = 2; j < vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                msg = "é Primo";
            }else{
                msg = "Não é primo";
            }
            System.out.println("O número: " + vetorA[i] + " é " + msg);
        }

    }
}
