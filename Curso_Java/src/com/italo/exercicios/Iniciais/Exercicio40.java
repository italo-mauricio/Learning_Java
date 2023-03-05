package Curso_Java.src.com.italo.exercicios.Iniciais;


/***
 * Write a program that only displays odd numbers
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
