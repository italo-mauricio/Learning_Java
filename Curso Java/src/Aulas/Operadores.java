/***
 * Operadores básicos do java
 */


public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;
        float restoDiv = (21%2);
        //System.out.println("Resto da divisão "+ (21%2));
        if (restoDiv == 0){
            System.out.println("O numero é par");

        }else {
            System.out.println("O numero é impar");
        }
        System.out.println(numeroFloat);
    }
}
