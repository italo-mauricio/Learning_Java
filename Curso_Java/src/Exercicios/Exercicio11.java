package Exercicios;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        float altura = scan.nextFloat();
        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scan.next();
        System.out.print("Digite o seu peso: ");
        int peso = scan.nextInt();
        double resultado = calculadoraImc(peso, altura);

        if (sexo.equals("M") && resultado < 18.5) {
            System.out.println("Você é Homem\n");
            System.out.println("Abaixo do peso ideal, seu imc é de : " + resultado);
        } else if (sexo.equals("M") && resultado <= 24.9) {
            System.out.println("Você é Homem\n");
            System.out.println("Seu peso esta ideal, seu imc é de: " + resultado);
        } else if (sexo.equals("M") && resultado <= 29.9) {
            System.out.println("Você é Homem\n");
            System.out.println("Seu peso esta um pouco acima da média, seu imc é de: " + resultado);
        } else if (sexo.equals("M") && resultado <= 39.9) {
            System.out.println("Você é Homem\n");
            System.out.println("Seu peso esta bem acima da média, seu imc é de: " + resultado);
        } else if (sexo.equals("M") && resultado > 40) {
            System.out.println("Você é Homem\n");
            System.out.println("Você está obeso, procure um médico, seu imc é de: " + resultado);
        }
        if (sexo.equals("F") && resultado < 18.5) {
            System.out.println("Você é Mulher\n");
            System.out.println("Abaixo do peso ideal, seu imc é de: " + resultado);
        } else if (sexo.equals("F") && resultado <= 24.9) {
            System.out.println("Você é Mulher\n");
            System.out.println("Seu peso esta ideal, seu imc é de: " + resultado);
        } else if (sexo.equals("F") && resultado <= 29.9) {
            System.out.println("Você é Mulher\n");
            System.out.println("Seu peso está um pouco acima da média, seu imc é de: " + resultado);
        } else if (sexo.equals("F") && resultado <= 39.9) {
            System.out.println("Você é Mulher\n");
            System.out.println("Seu peso está bem acima da média, seu imc é de: " + resultado);
        } else if (sexo.equals("F") && resultado > 40) {
            System.out.println("Você é Mulher\n");
            System.out.println("Você está obesa, procure um médico, seu imc é de: " + resultado);
        }

    }
    static float calculadoraImc(float peso, float altura){
        return peso/(altura * altura);
    }
}