package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * Faça um programa que calcule a quantidade de anos que a população A vai ultrapassar a população B
 */
public class Exercicio36 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        boolean valido = false;
        double popA;
        double popB;
        double taxaA;
        double taxaB;

        do{
            System.out.println("Digite a população A: ");
            popA = scan.nextDouble();

            if (popA > 0){
                valido = true;
            }else{
                System.out.println("População A menor que zero");
            }
        }while(!valido);

        valido = false;

        do {
            System.out.println("Digite a população B: ");
            popB = scan.nextDouble();
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B menor que zero");
            }
        }while(!valido);
        valido = false;
        do{
            System.out.println("Digite a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0){
                valido = true;
            }else{
                System.out.println("Taxa de crescimento da população A precisa ser maior que zero");
            }
        }while(!valido);
        valido = false;

        do{
            System.out.println("Digite a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0){
                valido = true;
            }else{
                System.out.println("Taxa de crescimento da população B precisa ser maior que zero");
            }
        }while(!valido);

        int cont = 0;

        while(popA < popB){
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);



    }
}
