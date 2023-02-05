package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Faça um programa para o cálculo de uma folha de pagamentos, sabendo que os descontos
 * são do imposto de renda, que depende do salário bruto (conforme a tabela abaixo)
 * e 3% para o sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado ( é a empresa que deposita)
 * . O salário liquido corresponde ao salário bruto menos os descontos. O programa deverá pedir a o usuário
 * o valor hora e a quantidade de horas trabalhadas no mÊs.
 *
 * - Desconto do IR
 * - Salário bruto até 900 (inclusive) - isento
 * - Salário bruto até 1500 (inclusive) - desconto de 5%
 * - Salário bruto até 2500 (inclusive) - desconto de 10%
 * - Salário bruto acima de 2500 - desconto de 20%
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Digite quantas horas você trabalhou neste mês: ");
        double horas = scan.nextDouble();
        double salarioBruto = salarioHora * horas;

        int percentualIr = 0;

        if(salarioBruto <= 900){
            percentualIr = 0;
        } else if (salarioBruto <= 1500) {
            percentualIr = 5;
        } else if (salarioBruto <= 2500){
            percentualIr = 10;
        }else if (salarioBruto > 2500){
            percentualIr = 20;
        }

        double ir = (salarioBruto / 100) * percentualIr;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double descontos = ir + inss;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto: " + salarioBruto + " R$");
        System.out.println("Desconto Imposto de Renda: " + ir + "R$");
        System.out.println("INSS depositado pela empresa: " + inss + " R$");
        System.out.println("Desconto FGTS: " + fgts + " R$");
        System.out.println("Total de descontos: " + descontos + " R$");
        System.out.println("Salário Liquido: " + salarioLiquido + " R$");
    }
}
