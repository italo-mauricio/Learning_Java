package Aulas;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 11;

        System.out.println("Contando até " + max);

        while (i < max){
            System.out.println(i);
            i++;
        }

        do {
            i++;
            System.out.println(i);
        }while (i < 30);
        System.out.println(i);
    }
}
