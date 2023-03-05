package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;


/***

 Write a program that asks for 2 numbers and performs operations with them, then
 determine if the result is positive or negative and if it's even or odd
 */
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the operation: (+ - / *) ");
        String operation = scan.next();

        double result = 0;
        boolean valid = true;

        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> {
                System.out.println("Invalid operation");
                valid = false;
            }
        }

        if (valid){

            System.out.println("Result: " + result);
            if (result >= 0){
                System.out.println("Positive result");
            }else{
                System.out.println("Negative result");
            }
            if (result % 2 == 0){
                System.out.println("Even result");
            }else{
                System.out.println("Odd result");
            }
        }

    }
}