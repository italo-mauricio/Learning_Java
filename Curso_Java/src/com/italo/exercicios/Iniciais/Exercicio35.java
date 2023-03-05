package Curso_Java.src.com.italo.exercicios.Iniciais;

/***

 Create a program that calculates how long population A will surpass population B by a specific growth margin
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

        System.out.println("Results!");
        System.out.println("Population A: " + popA);
        System.out.println("Population B: " + popB);
        System.out.println("Number of years: " + cont);
    }
}