package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Refatorando exercicio anterior de numeros primos
 */

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

         for (int i = 1; i <= num; i++){
             boolean primo = true;

             for (int j = 2; j < i; j++){
                 if (i % j == 0){

                     primo = false;
                 }
             }
             if (primo){
                 System.out.println(i);
             }
         }
    }
}
