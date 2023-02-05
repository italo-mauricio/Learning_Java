package Curso_Java.src.Exercicios;

import java.util.Scanner;

/***
 * Verificar se uma letra digitada é uma vogal ou consoante
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.next();
// primeira forma com IF ELSE

        if (letra.length() > 1){
            System.out.println("Impossivel continuar, você digitou mais de uma letra");
        }else{
            if (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                System.out.println("Vogal");
            }else {
                System.out.println("Consoante");
            }
        }
// segunda forma com SWTICH CASE
        if (letra.length() > 1){
            System.out.println("Impossível continuar, você digitou mais de uma letra");
        }else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        }
    }
}
