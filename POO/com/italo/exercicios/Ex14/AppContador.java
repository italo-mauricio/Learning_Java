package POO.com.italo.exercicios.Ex14;

/**
 * 1) Escreva uma classe chamada contador, que tem um atributo estático que é incrementado
 * sempre que a classe for inscanticada. Crie métodos para zerar, incrementar e retornar o valor do contador.
 * Desenvolva um programa para testar a classe.
 */

public class AppContador {
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
    }
}
