package POO.com.italo.exercicios.Ex10;

import java.util.Scanner;


// aula sobre Getters and Setters

public class AppOnibus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Onibus guanabara = new Onibus();

        System.out.print("Qual a marca do ônibus cadastrado no sistema: ");
        guanabara.setMarca(scan.nextLine());
        System.out.print("Qual o modelo do ônibus cadastrado no sistema: ");
        guanabara.setModelo(scan.nextLine());
        System.out.print("Quantos bancos reclináveis o veículo possui: ");
        guanabara.setBancoReclinaveis(scan.nextInt());
        System.out.print("Qual a capacidade de combustível do veículo: ");
        guanabara.setCapCombustivel(scan.nextDouble());
        System.out.print("Quantas poltronas normais o viculo possui: ");
        guanabara.setNumPoltronas(scan.nextInt());

        // set para atribuir valor
        // get para obter o valor

        if(guanabara.getNumPassageiros() >= 50 && guanabara.getBancoReclinaveis() < 10 && guanabara.getCapCombustivel() >= 200){
            System.out.println(" =========================================== ");
            System.out.println(" =========== Guanabara Viagens ============= ");
            System.out.println("                                             ");
            System.out.println(" Nome do veículo: " + guanabara.getMarca());
            System.out.println(" Modelo do veículo: " + guanabara.getModelo());
            System.out.println(" Bancos normais: " + guanabara.getNumPoltronas());
            System.out.println(" Bancos reclináveis: " + guanabara.getBancoReclinaveis());
            System.out.println(" Capacidade de combustível: " + guanabara.getCapCombustivel());
            System.out.println(" Situação do veículo: Normal");
            System.out.println(" Resultado da análise: Aprovado              ");
        } else if (guanabara.getBancoReclinaveis() >= 10 && guanabara.getCapCombustivel() >= 200){
            System.out.println(" =========================================== ");
            System.out.println(" =========== Guanabara Viagens ============= ");
            System.out.println("                                             ");
            System.out.println(" Nome do veículo: " + guanabara.getMarca());
            System.out.println(" Modelo do veículo: " + guanabara.getModelo());
            System.out.println(" Bancos normais: " + guanabara.getNumPoltronas());
            System.out.println(" Bancos reclináveis: " + guanabara.getBancoReclinaveis());
            System.out.println(" Capacidade de combustível: " + guanabara.getCapCombustivel());
            System.out.println(" Situação do veículo: Especial");
            System.out.println(" Resultado da análise: Aprovado              ");
        } else {
            System.out.println("Veículo não liberado, capacidade baixa de combustível.");
        }
    }
}
