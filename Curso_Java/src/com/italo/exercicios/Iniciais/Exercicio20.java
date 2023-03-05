package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Check if a typed letter is a vowel or consonant
 */

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a letter: ");
        String letter = scan.next();


        // first way with IF ELSE
        if (letter.length() > 1) {
            System.out.println("Impossible to continue, you typed more than one letter");
        } else {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        // second way with SWITCH CASE
        if (letter.length() > 1) {
            System.out.println("Impossible to continue, you typed more than one letter");
        } else {
            switch (letter) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
}