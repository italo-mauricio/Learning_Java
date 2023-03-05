package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***

 Create a program that verifies if the typed letter is uppercase or lowercase.
 */

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a letter: ");
        String user = scan.next();

        if (user.equals(user.toUpperCase())){
            System.out.println("You typed an UPPERCASE letter");
        }else{
            System.out.println("You typed a LOWERCASE letter");
        }
    }
}