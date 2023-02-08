package Curso_Java.src.Aulas;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];     // <--- boa prática ||indicando o número de posições
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.6;
        temperaturas[2] = 32.0;
        temperaturas[3] = 32.5;
        System.out.println(temperaturas[2]);
        System.out.println("O tamanho do array: " + temperaturas.length);
        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }

        // for melhorado eu consigo acessar os valores do array diretamente
        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }

}
