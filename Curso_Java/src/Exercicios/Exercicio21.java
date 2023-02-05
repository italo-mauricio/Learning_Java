package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que verifica em qual turno o aluno estuda
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ESCOLHA UMA DAS OPÇÕES: [M / V / N]  ");
        String turno = scan.next();

//OPÇÃO COM IF ELSE
        if (turno.equalsIgnoreCase("m")){
            System.out.println("Você digitou M-Matutino");
            System.out.println("A UFRN te deseja um BOM DIA!");
        } else if (turno.equalsIgnoreCase("v")){
            System.out.println("Você digitou V-Vespertino");
            System.out.println("A UFRN te deseja uma BOA TARDE!");
        } else if (turno.equalsIgnoreCase("n")){
            System.out.println("Você digitou N-Noturno");
            System.out.println("A UFRN te deseja uma BOA NOITE!");
        } else {
            System.out.println("Turno digitado é inválido");
        }

// OPÇÃO com SWITCH CASE
    switch (turno){
        case "m":
        case "M":
            System.out.println("Bom dia!"); break;
        case "v":
        case "V":
            System.out.println("Boa tarde!"); break;
        case "n":
        case "N":
            System.out.println("Boa noite!"); break;
        default:
            System.out.println("Valor inválido!"); break;
    }
    }
}
