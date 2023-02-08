package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * Faça um programa que verifique se a letra digitada é maiuscula ou minuscula
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String usuario = scan.next();

        if (usuario.equals(usuario.toUpperCase())){
            System.out.println("Vc digitou uma letra MAIUSCULA");
        }else{
            System.out.println("Você digitou uma letra MINUSCULA");
        }
    }
}
