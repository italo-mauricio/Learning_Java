package Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = scan.nextDouble();
        double vinteCent = (20.0/100.0) * salario;
        double quinzeCent = (15.0/100.0) * salario;
        double dezCent = (10.0/100.0) * salario;
        double cincoCent = (5.0/100.0) * salario;

        if (salario <= 280){
            System.out.println("Seu salário antes do reajuste: " + salario + " R$");
            System.out.println("Seu salário aumentou: " + vinteCent + " R$");
            System.out.println("Seu salário com um aumento de 20% fica: " + (salario += vinteCent) + " R$");
        }else if(salario <= 700){
            System.out.println("Seu salário antes do reajuste: " + salario + " R$");
            System.out.println("Seu salário aumentou: " + quinzeCent + " R$");
            System.out.println("Seu salário com um aumento de 15% fica: " + (salario += quinzeCent) + " R$");
        }else if (salario <= 1500){
            System.out.println("Seu salário antes do reajuste: " + salario + " R$");
            System.out.println("Seu salário com um aumento de 10% fica: " + (salario += dezCent) + " R$");
        }else {
            System.out.println("Seu salário antes do reajuste: " + salario + " R$");
            System.out.println("Seu salário com um aumento de 5% fica: " + (salario += cincoCent) + " R$");
        }
    }

}
