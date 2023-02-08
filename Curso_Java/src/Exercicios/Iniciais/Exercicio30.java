package Curso_Java.src.Exercicios.Iniciais;

import java.util.Scanner;

/***
 * faça um mini jogo de perguntas e respostas perguntando se uma pessoa presenciou ou nao um crime
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("-    JOGO DETETIVE    -");
        System.out.println("-                     -");
        System.out.println("=======================");
        System.out.println("Por favor digite o nome do seu personagem: ");
        String nome = scan.next();
        System.out.println("Bem vindo " + nome + " houve um assasinato esta manhã\n" +
                " e populares disseram que viram você pelas redondezas hoje, vamos te fazer algumas perguntas.");
        System.out.print("Você telefonou para a vitima [S/N]: ");
        String pergunta1 = scan.next();
        System.out.print("Você esteve no local do crime [S/N]: ");
        String pergunta2 = scan.next();
        System.out.print("Você mora perto da vítima [S/N]: ");
        String pergunta3 = scan.next();
        System.out.print("Você devia para a vítima [S/N]: ");
        String pergunta4 = scan.next();
        System.out.print("Você já trabalhou com a vítima [S/N]");
        String pergunta5 = scan.next();

        int cont = 0;
        if (pergunta1.equalsIgnoreCase("S")){
            cont++;
        }
        if (pergunta2.equalsIgnoreCase("S")){
            cont++;
        }
        if (pergunta3.equalsIgnoreCase("S")){
            cont++;
        }
        if (pergunta4.equalsIgnoreCase("S")){
            cont++;
        }
        if (pergunta5.equalsIgnoreCase("S")){
            cont++;
        }
        if (cont == 2 || cont == 1){
            System.out.println("Okay, você é suspeito");
        }else if(cont == 3 || cont == 4){
            System.out.println("Você é cúmplice");
        }else if(cont == 5){
            System.out.println("Você está preso, você é o culpado!");
        }else {
            System.out.println("Okay, está liberado!");
        }
    }
}
