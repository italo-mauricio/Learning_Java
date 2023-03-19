package POO.com.italo.aulas.MetodosEstaticos;

public class AppCalculadora {
    static int resultSoma = 0;  // aqui exemplifica como o método estatico funciona
    public static void main(String[] args) {


        // retiro a necessidade de instanciar a classe
       resultSoma = Calculadora.soma(2, 3);
       System.out.println("Resultado da soma é: " + resultSoma);

    }
}
