package POO.com.italo.exercicios.Ex01;


/***
 * Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
