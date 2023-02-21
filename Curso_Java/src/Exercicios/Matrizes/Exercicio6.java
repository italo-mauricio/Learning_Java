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

        String [][] compromissos = new String[31][24];

        Boolean sair = false;
        int opcao;
        boolean diaValido = false;
        int dia = 0;

        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextInt();

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


            }else if (opcao == 2){

            }else if (opcao == 0){

            }else {
                System.out.println("Opção inválida!");
            }

        }
    }
}
