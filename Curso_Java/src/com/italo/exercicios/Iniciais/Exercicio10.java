package Curso_Java.src.com.italo.exercicios.Iniciais;


import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Calculations
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        float num3 = scan.nextFloat();

        int num4 = 3;
        double result1 = (num1 * 2) + (num2 % 2);
        double result2 = (num1 * 3) + num3;
        double result3 = Math.pow(num3, num4);

        // Results
        System.out.println("The product of the double of the first with the half of the second is: " + result1);
        System.out.println("The sum of the triple of the first with the third is: " + result2);
        System.out.println("The third number raised to the power of 3 is: " + result3);
    }
}