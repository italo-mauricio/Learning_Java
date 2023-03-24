package POO.com.italo.exercicios.Ex18;

public class Somatorio {

    public static int fibonacci(int num){

        if(num < 2){
            return 1;
        }
        return fibonacci(num-1) + fibonacci((num -2));
    }
    public static int somatorio(int num){

        if (num == 1){
            return 1;
        }
        return num + somatorio(num -1);
    }
}

