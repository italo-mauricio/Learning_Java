package Curso_Java.src.Exercicios.Matrizes;


import java.util.Scanner;

/***
 * Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre
 * a quantidade de números pares, a quantidade de números ímpares
 */
public class Exercicio5 {
    public static void main(String[] args) {

        int [][] matriz = new int[3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){
            for (int j =0; j < matriz[i].length; j++){
                System.out.println("Digite os valores da posição [" + i + "," + j + "]");
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i =0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("ímpares: " + impares);

    }
}
