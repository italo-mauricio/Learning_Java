package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a program that checks the greatest number entered.
 */
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int greatest = Integer.MIN_VALUE;


        for (int i=0; i < 5; i++){
            System.out.print("Enter a number: ");
            num = scan.nextInt();

            if (num > greatest){
                greatest = num;
                System.out.println("The greatest number has changed: " + greatest);
            }

        }
        System.out.println("The greatest number entered was: " + greatest);
    }
}





