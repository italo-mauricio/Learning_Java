package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que verifique o maior número digitado
 */
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i=0; i < 5; i++){
            System.out.print("Digite um número: ");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                System.out.println("O numero maior mudou: " + maior);
            }

        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
