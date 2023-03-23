package POO.com.italo.exercicios.Ex17;

public class Fibonacci {
    public static int fibonacci(int num){

        if(num < 2){
            return 1;
        }
        return fibonacci(num-1) + fibonacci((num -2));
    }
}
