package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;
/***

 Create a program that checks which shift the student studies
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("CHOOSE ONE OF THE OPTIONS: [M / V / N]  ");
        String shift = scan.next();
//OPTION WITH IF ELSE
        if (shift.equalsIgnoreCase("m")){
            System.out.println("You chose M-Morning");
            System.out.println("UFRN wishes you a GOOD MORNING!");
        } else if (shift.equalsIgnoreCase("v")){
            System.out.println("You chose V-Afternoon");
            System.out.println("UFRN wishes you a GOOD AFTERNOON!");
        } else if (shift.equalsIgnoreCase("n")){
            System.out.println("You chose N-Night");
            System.out.println("UFRN wishes you a GOOD NIGHT!");
        } else {
            System.out.println("Invalid shift entered");
        }

// OPTION WITH SWITCH CASE
        switch (shift){
            case "m":
            case "M":
                System.out.println("Good morning!"); break;
            case "v":
            case "V":
                System.out.println("Good afternoon!"); break;
            case "n":
            case "N":
                System.out.println("Good night!"); break;
            default:
                System.out.println("Invalid value!"); break;
        }
    }
}