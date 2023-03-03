package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

/***
 * fazer um programa que simule uma nota fiscal
 */

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Lojas Tabajara");

        boolean sair = false;
        int qtdProdutos;
        String continuarCompra;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? [S/N] ");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")){
                output = "Lojas Tabaraja\n";
                System.out.print("Digite a quantidade de produtos da compra: ");
                qtdProdutos = scan.nextInt();
                total = 0;


                for (int i = 1; i <= qtdProdutos; i++){
                    System.out.println("Informe o preço do produto: " + i);
                    preco = scan.nextDouble();
                    output += "Produto " + i + ": R$ " + preco + "\n";
                    total += preco;
                }
                output += "Total: R$ " + total;
                System.out.println("Total: R$ " + total);
                System.out.println("Digite o valor pago: ");
                valorPago = scan.nextDouble();

                if (valorPago < total){
                    System.out.println("Ainda faltam: " + (valorPago - total));
                    System.out.println("Por favor, pague o valor correto do produto!");

                }else{
                    output += "\nDinheiro: R$ " + valorPago + "\n";
                    troco = total - valorPago;
                    output += "Troco: R$ " + troco;
                    System.out.println(output);
                }
            }else{
                System.out.println("Obrigado, volte sempre!");
                sair = true;
            }
        }while (!sair);
    }
}
