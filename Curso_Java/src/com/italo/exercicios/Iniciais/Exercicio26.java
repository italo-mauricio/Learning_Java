package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Simple program to calculate second degree equation
 */
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the value of A: ");
        int a = scan.nextInt();

        if (a == 0){
            System.out.println("Equation is not a second degree equation");
        } else {
            System.out.print("Enter the value of B: ");
            int b = scan.nextInt();
            System.out.print("Enter the value of C: ");
            int c = scan.nextInt();

            double delta = (b*b) - (4 * a * c);
            if (delta < 0){
                System.out.println("Negative delta");
            }else {

                System.out.println("Delta: " + delta);
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);  // calculates the square root in Java
                double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
}