package POO.com.italo.exercicios.Ex16;


// programa básico de fatorial em java

public class Fatorial {
    public static int fatorialNaoRecursivo(int num){
        if(num == 0){
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }
        return total;
    }

    public static int fatorialRecursivo(int num){

        if(num == 0){
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }
}
