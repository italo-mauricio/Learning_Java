package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que peça para a pessoa digitar o seu sexo e fazer as comparações
 */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo escolhido foi Masculino!");
        }else if (sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo escolhido foi Feminino");
        }else if (sexo.equalsIgnoreCase("o")){
            System.out.println("Sexo escolhido foi Outros");
        }else{
            System.out.println("Sexo inválido");
        }
    }
}
