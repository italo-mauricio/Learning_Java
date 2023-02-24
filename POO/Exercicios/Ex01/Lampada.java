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

    void mostrarEstado(){
        if(ligado){
            System.out.println("A lâmpada está Ligada");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if(ligado){
            ligar();
        }else{
            desligar();
        }
    }
}
