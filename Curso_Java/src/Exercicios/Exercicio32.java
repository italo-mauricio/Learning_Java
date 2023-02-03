package Exercicios;

import java.util.Scanner;

/***
 * Faça um programa simples de validação de nota
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;
        System.out.println("Vamos verificar uma validação simples!");
        do{
            System.out.print("Digite uma nota: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            }else{
                System.out.println("Nota inválida, digite novamente");
            }
        }while (!notaValida);

    }
}
