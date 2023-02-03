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
        // isso
        int count = 0;
        for ( ; count < 10 ;){
            System.out.println("Valor de count: " + count);
            count += 2;
        }
        // é a mesma coisa que isso
        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("Valor de count: " + cont);
        }
    }
}
