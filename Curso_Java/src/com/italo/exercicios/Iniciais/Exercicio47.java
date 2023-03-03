package Curso_Java.src.com.italo.exercicios.Iniciais;


/***
 * A série de fibonacci é formada pela sequência de 0,1,1,2,3,5,8.. faça um programa que gere a série até o valor que seja maior que 500
 */
public class Exercicio47 {
    public static void main(String[] args) {
        int primeiro = 1;
        int segundo = 1;
        int aux = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (aux <= 500){
            aux = primeiro + segundo;
            primeiro = segundo;
            segundo = aux;

            System.out.println(aux);
        }
    }
}
