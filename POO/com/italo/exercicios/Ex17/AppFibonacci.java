package POO.com.italo.exercicios.Ex17;

import java.util.Scanner;

public class AppFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        if(num < 0){
            System.out.println("Número inválido");
        }else{
            for (int i = 0; i < num; i++) {
                System.out.print(" | " + Fibonacci.fibonacci(i) + " | ");
            }
        }
    }
}
