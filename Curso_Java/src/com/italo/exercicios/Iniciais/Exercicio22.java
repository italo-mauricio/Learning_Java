package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * Faça um programa que peça o salario de um funcionário e faça reajustes
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your salary: ");
        double salary = scan.nextDouble();
        double twentyPercent = (20.0/100.0) * salary;
        double fifteenPercent = (15.0/100.0) * salary;
        double tenPercent = (10.0/100.0) * salary;
        double fivePercent = (5.0/100.0) * salary;

        if (salary <= 280){
            System.out.println("Your salary before the adjustment: " + salary + " R$");
            System.out.println("Your salary increased by: " + twentyPercent + " R$");
            System.out.println("Your salary after a 20% increase is: " + (salary += twentyPercent) + " R$");
        }else if(salary <= 700){
            System.out.println("Your salary before the adjustment: " + salary + " R$");
            System.out.println("Your salary increased by: " + fifteenPercent + " R$");
            System.out.println("Your salary after a 15% increase is: " + (salary += fifteenPercent) + " R$");
        }else if (salary <= 1500){
            System.out.println("Your salary before the adjustment: " + salary + " R$");
            System.out.println("Your salary increased by: " + tenPercent + " R$");
            System.out.println("Your salary after a 10% increase is: " + (salary += tenPercent) + " R$");
        }else {
            System.out.println("Your salary before the adjustment: " + salary + " R$");
            System.out.println("Your salary increased by: " + fivePercent + " R$");
            System.out.println("Your salary after a 5% increase is: " + (salary += fivePercent) + " R$");
        }
    }
}