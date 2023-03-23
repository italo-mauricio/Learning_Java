package POO.com.italo.exercicios.Ex17;

import java.util.Scanner;

public class AppFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(Fibonacci.fibonacci(i) + " ");
        }


    }
}
