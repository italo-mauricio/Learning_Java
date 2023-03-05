package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a program to calculate a payroll, knowing that the discounts are for income tax,
 which depends on the gross salary (according to the table below)
 and 3% for the union and that the FGTS corresponds to 11% of the gross salary, but is not discounted (it is the company that deposits it).
 The net salary corresponds to the gross salary minus the discounts. The program should ask the user
 the hourly rate and the number of hours worked in the month.
 Income tax discount
 Gross salary up to 900 (inclusive) - exempt
 Gross salary up to 1500 (inclusive) - 5% discount
 Gross salary up to 2500 (inclusive) - 10% discount
 Gross salary above 2500 - 20% discount
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how much you earn per hour: ");
        double hourlyWage = scan.nextDouble();
        System.out.println("Enter how many hours you worked this month: ");
        double hoursWorked = scan.nextDouble();
        double grossSalary = hourlyWage * hoursWorked;

        int irPercent = 0;

        if(grossSalary <= 900){
            irPercent = 0;
        } else if (grossSalary <= 1500) {
            irPercent = 5;
        } else if (grossSalary <= 2500){
            irPercent = 10;
        }else if (grossSalary > 2500){
            irPercent = 20;
        }

        double ir = (grossSalary / 100) * irPercent;
        double inss = (grossSalary / 100) * 10;
        double fgts = (grossSalary / 100) * 11;
        double discounts = ir + inss;
        double netSalary = grossSalary - discounts;

        System.out.println("Gross Salary: " + grossSalary + " R$");
        System.out.println("Income tax discount: " + ir + " R$");
        System.out.println("INSS deposited by the company: " + inss + " R$");
        System.out.println("FGTS discount: " + fgts + " R$");
        System.out.println("Total discounts: " + discounts + " R$");
        System.out.println("Net Salary: " + netSalary + " R$");
    }
}