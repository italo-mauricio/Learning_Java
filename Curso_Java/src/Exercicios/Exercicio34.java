package Exercicios;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String sexo;
        String estadoCivil;
        int idade;
        double salario;
        boolean infoValida = false;

        do{
            System.out.println("Digite o seu nome");
            nome = scan.next();
            if (nome.length() >= 3){
                infoValida = true;
                System.out.println("Nome váliddo!");
            }else{
                System.out.println("Nome invalido");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if(idade >= 0 && idade <= 120){
                infoValida = true;
                System.out.println("Idade válida");
            }else{
                System.out.println("Idade inválida!");
            }
        }while(!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu salario: ");
            salario = scan.nextDouble();

            if (salario > 0){
                infoValida = true;
                System.out.println("Salário válido");
            }else{
                System.out.println("Salario inválido!");
            }
        }while (!infoValida);

        infoValida =  false;

        do {
            System.out.println("Digite o seu sexo: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m") ||
                        sexo.equalsIgnoreCase("o")){
                infoValida = true;
                System.out.println("Sexo válido");
            }else{
                System.out.println("Sexo inválido");
            }
        }while (!infoValida);

    }
}
