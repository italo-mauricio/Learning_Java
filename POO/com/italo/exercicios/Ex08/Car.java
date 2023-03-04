package POO.com.italo.exercicios.Ex08;

public class Car {
    String marca;
    String modelo;
    int numPassageiros;

    Car(){
        System.out.println("Entrou!");
        System.out.println("Classe carro foi instanciada");
    }
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + (capCombustivel * consumoCombustivel) + "km");
    }

    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel (double km){
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
