package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 *  Faça um programa que determine se um ano é bissexto ou nao
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = scan.nextInt();

        if ((ano % 400 == 0)|| (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("Você nasceu no ano: " + ano + "\nO ano é bissexto");
        }else {
            System.out.println("Você nasceu no ano: " + ano + "\nO ano não é bissexto");
        }

    }
}
