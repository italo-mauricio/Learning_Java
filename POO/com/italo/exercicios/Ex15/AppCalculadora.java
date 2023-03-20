package POO.com.italo.exercicios.Ex15;


/***
 * 2) Escreva uma classe calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir e potencia;
 * Desenvolva um programa para testar todos eles.
 */

public class AppCalculadora {
    public static void main(String[] args) {

        imprime(Calculadora.soma(5, 5));
        imprime(Calculadora.subtracao(6,9));
        imprime(Calculadora.multiplicacao(2,6));
        imprime(Calculadora.divisao(6,4));
        imprime(Calculadora.potencia(5,7));
    }
    static void imprime(int num){
        System.out.println(num);
    }
}
