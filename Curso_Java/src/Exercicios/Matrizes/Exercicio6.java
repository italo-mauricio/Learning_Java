package Curso_Java.src.Exercicios.Matrizes;


import java.util.Scanner;

/***
 * Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
 * Cada dia do mês deve conhter 24 horas, onde para cada uma destas 24 horas podemos associar
 * uma tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês
 * que deseja alterar e a hora; entrando em seguida com o compromisso, ou então, o usuário pode também
 * consultar a agenda, fornecendo o dia e a hora para obter o compromisso agendado.
 *
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        boolean diaValido = false;
        boolean horaValida = false;
        int dia = 0;
        int hora = 0;

        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextByte();

            if (opcao == 1){

                while (!diaValido){
                    System.out.println("Digite o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;

                    }else{
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }
                while (!horaValida){
                    System.out.println("Digite o horário do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;

                    }else{
                        System.out.println("Hora inválida, digite novamente!");
                    }
                }
                dia--;  // retirar 1 dia para bater as 31 posições
                System.out.println("Digite o compromisso: ");
                compromissos[dia][hora] = scan.next();

            }else if (opcao == 2){

                while (!diaValido){
                    System.out.println("Digite o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else{
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }
                while (!horaValida){
                    System.out.println("Digite o horário do compromisso: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    }else{
                        System.out.println("Hora inválida, digite novamente!");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);

            }else if (opcao == 0){
                System.out.println("Obrigado, volte sempre!");
                sair = true;
            }else {
                System.out.println("Opção inválida!");
            }

        }
    }
}
