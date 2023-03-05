package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio12 {
    public static final double TAXA_INSS = 0.08;
    public static final double TAXA_IR = 0.11;
    public static final double TAXA_SINDICATO = 0.05;

    public static void main(String[] args) {
        Scanner scannerEntrada = new Scanner(System.in);

        System.out.print("Digite quanto você recebe por hora: ");
        double valorHora = scannerEntrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scannerEntrada.nextDouble();

        double salarioBruto = calcularSalarioBruto(valorHora, horas);
        double totalDescontos = calcularDescontos(salarioBruto);
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("=====================================================");
        System.out.printf("Seu salário bruto foi de: %.2f R$\n", salarioBruto);
        System.out.printf("Desconto do imposto de renda: %.2f R$\n", calcularImpostoRenda(salarioBruto));
        System.out.printf("Desconto do INSS: %.2f R$\n", calcularINSS(salarioBruto));
        System.out.printf("Desconto do Sindicato: %.2f R$\n", calcularSindicato(salarioBruto));
        System.out.printf("Seu saldo liquido: %.2f R$\n", salarioLiquido);
        System.out.println("======================================================");
    }

    public static double calcularSalarioBruto(double valorHora, double horas) {
        return valorHora * horas;
    }

    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * TAXA_INSS;
    }

    public static double calcularImpostoRenda(double salarioBruto) {
        return salarioBruto * TAXA_IR;
    }

    public static double calcularSindicato(double salarioBruto) {
        return salarioBruto * TAXA_SINDICATO;
    }

    public static double calcularDescontos(double salarioBruto) {
        return calcularINSS(salarioBruto) + calcularImpostoRenda(salarioBruto) + calcularSindicato(salarioBruto);
    }
}