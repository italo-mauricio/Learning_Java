package Curso_Java.src.Exercicios;

/***
 * faça um programa que calcule quanto tempo a população A vai ultrapassar a população B em uma margem especifica de crescimento
 */

public class Exercicio35 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while(popA < popB){
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont ++;
        }

        System.out.println("Resultados!");
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);


    }
}
