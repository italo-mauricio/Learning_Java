package Curso_Java.src.Aulas;



public class ConverteGaloes {
    public static void main(String[] args) {
        double gallons, litters;
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + litters + " litters.");
            counter ++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}