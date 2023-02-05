package Curso_Java.src.Exercicios;

/***
 * faça um programa que apresente só os números ímpares
 */
public class Exercicio40 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
