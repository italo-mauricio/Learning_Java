package POO.Exercicios.Ex01;


/***
 * Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        String estado = String.valueOf(lampada.ligado);

        if(lampada.ligado){
            estado = "Ligado";
        }else{
            estado = "Desligado";
        }

        System.out.println("A lâmpada está " + estado);
    }
}
