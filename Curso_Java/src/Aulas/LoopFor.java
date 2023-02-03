package Aulas;

public class LoopFor {
    public static void main(String[] args) {
        // loop de repetição normal
        for (int i=0;i<10;i++){
            System.out.println("I tem o valor de: " + i);
        }
        for (int i = 5; i > 0; i--){
            System.out.println("I tem o valor de: " + i);
        }
        // loop de repetição com mais de uma variável
        for (int i = 0, j = 10; i < j; i++, j-- ){
            System.out.println("I tem o valor de: " + i + " J tem o valor de: " + j);
        }
    }
}
