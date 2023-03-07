package POO.com.italo.exercicios.Ex11;

public class ExemploSobrecarga {


    // o nome disso é sobrecarga de métodos, é um tipo de polimorfismo em tempo de compilação

    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1, double num2){  // ele não permite um método totalmente igual ao outro
        return num1 + num2;
    }

    public  int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros){
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }

        return total;
    }
}
