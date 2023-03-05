package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Write a program that asks the user to input their gender and makes comparisons
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your gender [M/F/O]: ");
        String gender = scan.next();

        if (gender.equalsIgnoreCase("m")){
            System.out.println("The chosen gender is Male!");
        }else if (gender.equalsIgnoreCase("f")){
            System.out.println("The chosen gender is Female!");
        }else if (gender.equalsIgnoreCase("o")){
            System.out.println("The chosen gender is Other!");
        }else{
            System.out.println("Invalid gender");
        }
    }
}