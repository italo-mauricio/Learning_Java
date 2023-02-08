package Curso_Java.src.Exercicios.Iniciais;

import java.text.DecimalFormat;
import java.util.Scanner;

/***
 * Um funcionário de uma empresa recebe aumento salarial inicial de R$ 1.000.00
 *
 * A - Em 1996 recebeu aumento de 1.5% sobre seu salário atual.
 * B - A partir de 1997, os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
 * Faça um programa que determine o salario atual desse funcionário. Após concluir isto, altere o programa
 */

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();  // 1995
        double percentual = 1.5;
        salario += (salario/100) * percentual;   // 1996

        DecimalFormat format = new DecimalFormat("###,###.###");

        for (int i = 1997; i <= 2023; i++){
            percentual *= 2;
            salario += (salario/100) * percentual;
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }
    }
}
