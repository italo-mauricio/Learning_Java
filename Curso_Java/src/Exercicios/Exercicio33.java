package Exercicios;

import java.util.Scanner;

/***
 * faça um programa que peça um nome de usuario e senha e verifique se são iguais ou nao
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        do {
            System.out.print("Digite o seu nome: ");
            String nome = scan.next();
            System.out.print("Digite uma senha: ");
            String senha = scan.next();

            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Senha igual ao usuario, digite novamente");
            }else{
                infoValida = true;
                System.out.println("Senha válida!");
                System.out.println("Entrou!");
                break;
            }

        }while(!infoValida);
    }
}
