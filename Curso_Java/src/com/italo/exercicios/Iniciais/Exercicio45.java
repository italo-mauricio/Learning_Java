package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num;
        int evens = 0;
        int odds = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                evens++;
            }else{
                odds++;
            }

        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);
    }
}