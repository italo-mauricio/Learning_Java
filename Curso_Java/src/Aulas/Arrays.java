package Curso_Java.src.Aulas;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];     // <--- boa prática ||indicando o número de posições
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.6;
        temperaturas[2] = 32.0;
        temperaturas[3] = 32.5;
        System.out.println(temperaturas[2]);

    }

}
