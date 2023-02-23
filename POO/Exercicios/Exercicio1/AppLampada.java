package POO.Exercicios.Exercicio1;

public class AppLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 6;
        lampada.potencia = 7;
        lampada.cor = "Amarelo";
        lampada.corLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];   // precisamos instanciar o array para poder utilizar
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";

        System.out.println(lampada.tipos[0]);
    }
}
