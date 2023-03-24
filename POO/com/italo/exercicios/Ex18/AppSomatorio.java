package POO.com.italo.exercicios.Ex18;

import java.util.Scanner;

public class AppSomatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir o seu somatório: ");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
            System.out.print((i) + " + ");
        }
        System.out.println("\nSomátório: " + sum);
    }
}
