package Curso_Java.src.Aulas;

import java.util.Scanner;

public class CondicionalSaidaBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        System.out.print("Digite um limite: ");
        int maximo = scan.nextInt();

        for (int i = num; i <= maximo; i++){
            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}
