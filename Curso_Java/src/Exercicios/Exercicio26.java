package Exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = scan.nextInt();


        if (a == 0){
            System.out.println("Equação não é do segundo grau");
        } else {
            System.out.println("Informe o valor de B: ");
            int b = scan.nextInt();

            System.out.println("Informe o valor de C: ");
            int c = scan.nextInt();

            double delta = (b*b) - (4 * a * c);
            if (delta < 0){
                System.out.println("Delta negativo");
            }
        }
    }
}
