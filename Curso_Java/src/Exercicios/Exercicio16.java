package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que peça para a pessoa digitar o seu sexo e fazer as comparações
 */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scan.next();

        if (sexo.equals("M")){
            System.out.println("Sexo escolhido foi Masculino!");
        }else if (sexo.equals("F")){
            System.out.println("Sexo escolhido foi Feminino");
        }else if (sexo.equals("O")){
            System.out.println("Sexo escolhido foi Outros");
        }else{
            System.out.println("Sexo inválido");
        }
    }
}
