package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
/***

 Make a program that determines whether a year is a leap year or not
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the year: ");
        int year = scan.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The year " + year + " is a leap year.");
        }else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}