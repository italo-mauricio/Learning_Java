package Curso_Java.src.com.italo.aulas;

public class ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 19;
        String categoria;
        if (idade < 15) {
            categoria = "ifantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "juvenil";

        }else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}