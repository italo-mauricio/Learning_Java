package Curso_Java.src.Aulas;


/***
 * Mostrando como é a verificação de break com rótulos
 */
public class BreakComRotulos {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3:{
                            if (i == 1){
                                break rotulo1;
                            }
                            if (i == 2){
                                break rotulo2;
                            }
                            if (i == 3){
                                break rotulo3;
                            }
                        System.out.println("Rotulo 3");
                     }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }
    }

}