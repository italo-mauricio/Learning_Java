package Curso_Java.src.com.italo.exercicios.Iniciais;

/***
 * montar uma tabela de preços de uma panificadora
 */
public class Exercicio54 {
    public static void main(String[] args) {

        System.out.println("O Preço do Pão: R$ 0.10");
        System.out.println("Panificadora - Tabela de preços");
        for (int i=1; i <= 50; i++){
            System.out.println(i + " R$ " + (0.18 * i));
        }
    }
}
