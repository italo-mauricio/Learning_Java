package POO.com.italo.exercicios.Ex12;




public class AppLampada2 {
    public static void main(String[] args) {

        Lampada2 lampada = new Lampada2("bivolt","45voltz", 5,
                "Roxa", "Roxa", 2, new String[]{"abajur"}, true, false);
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();


    }
}
