package Exercicios;


import java.util.Scanner;

    /***
     * Faça um programa que peça dois números e imprima a soma
     */
    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Informe o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Informe o segundo número ");
            int num2 = scan.nextInt();

            System.out.println("A soma dos dois números é: " + (num1+num2));
        }
    }