package Curso_Java.src.com.italo.aulas;

/***
 * Comentário de documentação oficial Java
 *
 * São 8 tipos primivitos
 *
 * int, float, long, double, char, short, boolean, byte
 * @param args parâmetro de entrada do método main
 */

public class Primitivos {
    public static void main(String[] args) {
        int idade = 19;
        double salarioDouble = 1350;
        float salarioFloat = 1350;
        byte idadeByte = 12;
        short idadeShort = 32434;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10000L;
        char caractere = 'I';  // 2 bytes
        String nome = "Italo";
        System.out.println("A idade é: " + idade);
    }
}