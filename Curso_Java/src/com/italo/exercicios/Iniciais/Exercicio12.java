package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
public class Exercicio12 {
    public static final double INSS_TAX = 0.08;
    public static final double IR_TAX = 0.11;
    public static final double UNION_TAX = 0.05;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how much you earn per hour: ");
        double hourlyRate = scan.nextDouble();

        System.out.print("Enter the amount of hours worked in the month: ");
        double hoursWorked = scan.nextDouble();

        double grossSalary = calculateGrossSalary(hourlyRate, hoursWorked);
        double totalDeductions = calculateDeductions(grossSalary);
        double netSalary = grossSalary - totalDeductions;

        System.out.println("=====================================================");
        System.out.printf("Your gross salary was: %.2f R$\n", grossSalary);
        System.out.printf("Income tax deduction: %.2f R$\n", calculateIncomeTax(grossSalary));
        System.out.printf("INSS deduction: %.2f R$\n", calculateINSS(grossSalary));
        System.out.printf("Union tax deduction: %.2f R$\n", calculateUnionTax(grossSalary));
        System.out.printf("Your net salary: %.2f R$\n", netSalary);
        System.out.println("======================================================");
    }

    public static double calculateGrossSalary(double hourlyRate, double hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    public static double calculateINSS(double grossSalary) {
        return grossSalary * INSS_TAX;
    }

    public static double calculateIncomeTax(double grossSalary) {
        return grossSalary * IR_TAX;
    }

    public static double calculateUnionTax(double grossSalary) {
        return grossSalary * UNION_TAX;
    }

    public static double calculateDeductions(double grossSalary) {
        return calculateINSS(grossSalary) + calculateIncomeTax(grossSalary) + calculateUnionTax(grossSalary);
    }
}