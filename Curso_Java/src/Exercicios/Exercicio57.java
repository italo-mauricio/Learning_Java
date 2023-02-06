package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * faça um programa que peça uma quantidade de temperaturas, depois diga a maior, a menor e média entre elas
 */

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de temperaturas: ");
        int qtdTemperaturas = scan.nextInt();
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;   // o menor recebe o maior valor pq na primeira ele já troca e vice versa
        double maior = Double.MIN_VALUE;

        for (int i=1; i<=qtdTemperaturas; i++){
            System.out.print("Digite a temperatura: ");
            temp = scan.nextDouble();
            soma += temp;

            if (temp > maior){
                maior = temp;
            }
            if (temp < menor){
                menor = temp;
            }
        }
        System.out.println("Média: " + (soma/qtdTemperaturas));
        System.out.println("Menor temperatura; " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
}
