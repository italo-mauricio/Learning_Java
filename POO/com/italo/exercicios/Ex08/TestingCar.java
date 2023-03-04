package POO.com.italo.exercicios.Ex08;

public class TestingCar {
    public static void main(String[] args) {
        Car van = new Car("Fiat", "Ducato", 10, 5, 10);
        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
    }
}
