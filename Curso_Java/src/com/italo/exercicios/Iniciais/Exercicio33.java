package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * Make a program that asks for a username and password and verifies if they are the same or not
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Tip: to improve memory performance in Java, it is a good practice to declare variables outside the code scope.
        boolean validInfo = false;
        String username;
        String password;
        do {
            System.out.print("Enter your username: ");
            username = scan.next();
            System.out.print("Enter a password: ");
            password = scan.next();

            if (username.equalsIgnoreCase(password)) {
                System.out.println("Password equals username, please try again");
            } else {
                validInfo = true;
                System.out.println("Valid password!");
                System.out.println("Access granted!");
            }

        } while (!validInfo);
    }
}