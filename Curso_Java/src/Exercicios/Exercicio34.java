package Exercicios;

import java.util.Scanner;

/***
 * faça um código que valida informações básicas de cadastro
 */
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
            System.out.print("Digite o seu nome");
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
            System.out.print("Digite sua idade: ");
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
            System.out.print("Digite seu salario: ");
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
            System.out.print("Digite o seu sexo [M/F/O]: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m") ||
                        sexo.equalsIgnoreCase("o")){
                infoValida = true;
                System.out.println("Sexo válido");
                if (sexo.equals("f")) {
                    System.out.println("Feminino");
                    sexo = "feminino";
                }else if (sexo.equals("m")){
                    System.out.println("Masculino");
                    sexo = "Masculino";
                }else if (sexo.equals("o")){
                    System.out.println("Você escolheu outros");
                    System.out.print("Digite seu gênero: ");
                    String sexoNovo = scan.next();
                    sexo = sexoNovo;
                }
            }else{
                System.out.println("Sexo inválido");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.print("Digite seu estado civil [S/C/V]: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                estadoCivil.equalsIgnoreCase("c") ||
                estadoCivil.equalsIgnoreCase("v")){
                infoValida = true;
                System.out.println("Estado civil válido!");
                if (estadoCivil.equals("s")){
                    System.out.println("Solteiro");
                    estadoCivil = "Solteiro(a)";
                }else if(estadoCivil.equals("c")){
                    System.out.println("Casado");
                    estadoCivil = "Casado(a)";
                }else if (estadoCivil.equals("v")){
                    System.out.println("Viuvo(a)");
                    estadoCivil = "Viuvo(a)";
                }
            }else{
                System.out.println("Estado civil inválido!");
            }
        }while (!infoValida);

        System.out.println("As informações digitadas foram!!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Salario: " + salario + " R$");
        System.out.println("CADASTRO EFETIVADO!");
    }

}
