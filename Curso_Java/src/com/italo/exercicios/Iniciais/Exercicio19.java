package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a program that tells which of the 3 requested numbers is the largest
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();


        if (num1 > num2 && num1 > num3){
            System.out.println("The first is the largest");
        }else if (num2 > num1 && num2 > num3){
            System.out.println("The second is the largest");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("The third is the largest!");
        }else{
            System.out.println("They are equal");
        }
    }
}