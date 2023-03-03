package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println("Número não é primo, é divisivel por: " + i);
                primo = false;
            }
        }
        if (primo){
            System.out.println("É número primo" );
        }
    }
}
