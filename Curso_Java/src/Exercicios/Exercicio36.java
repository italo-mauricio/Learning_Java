package Exercicios;

import java.util.Scanner;

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
                System.out.println("População menor que zero");
            }
        }while(!valido);

        valido = false;

        do {
            System.out.println("Digite a população B: ");
            popB = scan.nextDouble();
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População menor que zero");
            }
        }while(!valido);
        valido = false;




    }
}
