package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Digite o tipo de combustível: ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlcool = 1.9;
        int precoDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")){
            if (litros <= 20){
                precoDesconto = 3;
            }else{
                precoDesconto = 5;
            }
            total = litros * precoAlcool;

        } else if (tipo.equalsIgnoreCase("g")){
            if (litros <= 20){
                precoDesconto = 4;
            }else {
                precoDesconto = 6;
            }
            total = litros * precoGas;
        }
        totalDesconto = (total / 100) * precoDesconto;
        double precoApagar = total - totalDesconto;
        System.out.println("Valor a ser pago: " + precoApagar);
    }
}
