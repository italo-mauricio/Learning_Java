package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sacan = new Scanner(System.in);

        System.out.print("Digite quanto você recebe por hora: ");
        double valorHora = sacan.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = sacan.nextDouble();

        double salarioBruto = valorHora * horas;
        double impostoRenda = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("=====================================================");
        System.out.println("Seu salário bruto foi de: " + salarioBruto + " R$");
        System.out.println("Desconto do imposto de renda: " + impostoRenda + " R$");
        System.out.println("Desconto do INSS: " + inss + " R$");
        System.out.println(("Desconto do Sindicato: " + sindicato + " R$"));
        System.out.println("Seu saldo liquido: " + salarioLiquido + " R$");
        System.out.println("======================================================");

    }
}