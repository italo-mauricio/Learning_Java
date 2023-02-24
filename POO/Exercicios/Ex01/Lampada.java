package POO.Exercicios.Ex01;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String corLuz;
    String cor;
    int garantiaMeses;
    String [] tipos;
    boolean tipoAbajur;
    boolean ligado;

    void ligar(){
        ligado = true;
    }

    void desligar(){
       ligado = false;
    }
}
