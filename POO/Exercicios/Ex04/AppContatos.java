package POO.Exercicios.Ex04;

import java.util.Scanner;

public class AppContatos {
    public static void main(String[] args) {
        Contatos contato1 = new Contatos();

        contato1.nome = "italo";
        contato1.email = "italomauricio98@gmail.com";
        contato1.endereco = "rua tal de tal";
        contato1.telefones = new String[2];
        contato1.telefones[0] = "9883423332";
        contato1.telefones[1] = "22324423242";

        Contatos contato2 = new Contatos();

        contato2.nome = "Anna";
        contato2.email = "ana@gmail.com";
        contato2.endereco = "rua de tal";
        contato2.telefones = new String[3];
        contato2.telefones[0] = "2313214213";
        contato2.telefones[1] = "2555342123";
        contato2.telefones[2] = "4565654343";

        System.out.println("Nome: " + contato1.nome);
        System.out.println("Email: " + contato1.email);
        System.out.println("Endereço: " + contato1.endereco);
        System.out.println("Telefone1: " + contato1.telefones[0]);
        System.out.println();
        System.out.println("========================================");
        System.out.println();
        System.out.println("Nome: " + contato2.nome);
        System.out.println("Email: " + contato2.email);
        System.out.println("Endereço: " + contato2.endereco);
        System.out.println("Telefone1: " + contato2.telefones[0]);

    }
}
