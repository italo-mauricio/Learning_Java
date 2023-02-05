package Curso_Java.src.Exercicios;

import java.util.Scanner;


/***
 * Programa simples para calcular equação do segundo grau
 */
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = scan.nextInt();

        if (a == 0){
            System.out.println("Equação não é do segundo grau");
        } else {
            System.out.print("Informe o valor de B: ");
            int b = scan.nextInt();
            System.out.print("Informe o valor de C: ");
            int c = scan.nextInt();

            double delta = (b*b) - (4 * a * c);
            if (delta < 0){
                System.out.println("Delta negativo");
            }else {

                System.out.println("Delta: " + delta);
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);  // calcula a raiz quadrada no java
                double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
}
