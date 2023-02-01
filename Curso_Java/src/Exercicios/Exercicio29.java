package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa que peça 2 números e faça operações com eles, depois
 * determine se o número é positivo ou negativo e se ele é par ou ímpar
 */

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite a operação: (+ - / *) ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> resultado = num1 / num2;
            default -> {
                System.out.println("Operação inválida");
                valida = false;
            }
        }

        if (valida){

            System.out.println("Resultado: " + resultado);
            if (resultado >= 0){
                System.out.println("Resultado positivo");
            }else{
                System.out.println("Resultado negativo");
            }
            if (resultado % 2 == 0){
                System.out.println("É um resultado par");
            }else{
                System.out.println("Resultado ímpar");
            }
        }

    }
}
