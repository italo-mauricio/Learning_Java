package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um programa que peça um nome de usuario e senha e verifique se são iguais ou nao
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // dica: para melhorar um pouco a perfomance de memória no java, é uma boa prática declarar as variáveis fora do escopo de código.
        boolean infoValida = false;
        String nome;
        String senha;
        do {
            System.out.print("Digite o seu nome: ");
            nome = scan.next();
            System.out.print("Digite uma senha: ");
            senha = scan.next();

            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Senha igual ao usuario, digite novamente");
            }else{
                infoValida = true;
                System.out.println("Senha válida!");
                System.out.println("Entrou!");

            }

        }while(!infoValida);
    }
}
