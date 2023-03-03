package Curso_Java.src.com.italo.exercicios.Matrizes;


import java.util.Scanner;

/***
 * Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizado por mês, dia e hora (só 8 horas por dia).
 *
 */

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        int dia = 0;
        int hora = 0;
        int mes = 0;
        boolean sair = false;
        int opcao;
        while (!sair){

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextInt();

            if (opcao == 1){ //adicionar compromisso

                boolean mesValido = false;
                while (!mesValido){
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }

                boolean diaValido = false;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean horaValida = false;

                while (!horaValida){
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso");
                compromissos[mes][dia][hora] = scan.next();

            } else if (opcao == 2){ //verificar compromisso
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[mes][dia][hora] + " ");

            } else if (opcao == 0){
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }

    }
}
