package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que peça um código pré estabelecido pela hamburgueria e diga quais os itens e o total a pagar.
 */


public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod, qtd;
        int total = 0;
        String output = "";

        boolean naoTerminar = true;
        do{
            System.out.print("Digite o código: ");
            cod = scan.nextInt();
            System.out.print("Digite a quantidade (0 para sair): ");
            qtd = scan.nextInt();

            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "Total a pagar = " + total + " R$";
            }else{

                if (cod == 100){
                    output += "Cachorro Quente -> R$ 1.20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += (1.2 * qtd);
                } else if (cod == 101){
                    output += "Bauru Simples -> R$ 1.30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += (1.3 * qtd);
                } else if (cod == 102){
                    output += "Bauru com Ovo -> R$ 1.50 * " + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += (1.5 * qtd);
                } else if (cod == 103){
                    output += "Hamburguer -> R$ 1.20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += (1.2 * qtd);
                } else if (cod == 104){
                    output += "Chesseburguer -> R$ 1.30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += (1.2 * qtd);
                } else if (cod == 105){
                    output += "Refrigerante -> R$ 1.00 * " + qtd;
                    output += " = " + (1.0 * qtd) + "\n";
                    total += (1.0 * qtd);
                } else{
                    System.out.println("Código invalido");
                }



            }

        }while(naoTerminar);

        System.out.println(output);

    }
}
