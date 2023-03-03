package Curso_Java.src.com.italo.aulas;

/***
 * Operador ternário
 *
 * Não deve-se utilizar operador ternário quando temos duas ou mais instruções
 */



public class ControleDeFluxoDois {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}