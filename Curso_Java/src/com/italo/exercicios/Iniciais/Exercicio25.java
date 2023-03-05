package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
/***

 Write a program that asks for the 3 sides of a triangle. The program should inform

 whether the values can form a triangle, and if so, whether it is:

 equilateral, isosceles or scalene.
 */
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter side 1: ");
        int side1 = scan.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scan.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scan.nextInt();

        if (((side1 + side2) > side3) ||
                ((side1 + side3) > side2) ||
                ((side2 + side3) > side1)){
            if (side1 == side2 && side1 == side3){
                System.out.println("Equilateral Triangle");
            }else if (side1 == side2 || side1 == side3 || side2 == side3){
                System.out.println("Isosceles Triangle");
            }else {
                System.out.println("Scalene Triangle");
            }
        }else {
            System.out.println("Does not form a triangle");
        }
    }
}