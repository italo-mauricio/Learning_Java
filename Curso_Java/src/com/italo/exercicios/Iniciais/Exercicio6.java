package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
/***

 Make a program that calculates the area of a square, then shows double that area.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the square side length: ");
        double side = scan.nextDouble();

        double area = Math.pow(side, 2);

        System.out.println("The area of the square is: " + area);
        System.out.println("Twice the area of the square is: " + (area * 2));
    }
}