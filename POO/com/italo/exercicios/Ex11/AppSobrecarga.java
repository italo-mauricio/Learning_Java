package POO.com.italo.exercicios.Ex11;

public class AppSobrecarga {
    public static void main(String[] args) {

        ExemploSobrecarga carga = new ExemploSobrecarga();

        // elas possuem o mesmo nome, porém a assinatura do método é diferente
        carga.soma(1, 2);
        carga.soma(1, 2);
        carga.soma(1, 2);
    }
}
