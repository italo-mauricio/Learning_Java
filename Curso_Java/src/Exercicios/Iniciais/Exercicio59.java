package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que inicie uma tabuada partindo de um ponto especifico até outro ponto especifico
 */

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean invalido = true;
        System.out.print("Digite um número para gerar a tabuada: ");
        int num = scan.nextInt();
        int numInicio, numFinal;

        do{
            System.out.print("Digite com o inicio da tabuada: ");
            numInicio = scan.nextInt();

            System.out.print("Digite o final da tabuada: ");
            numFinal = scan.nextInt();
            if (numFinal > numInicio){
                invalido = false;
            }


        }while(invalido);

        System.out.println("Tabuada de " + num + ";");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();
        for (int i = numInicio; i <= numFinal; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
