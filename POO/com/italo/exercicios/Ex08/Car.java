package POO.com.italo.exercicios.Ex08;

public class Car {
    String marca;
    String modelo;
    int numPassageiros;

    Car(String marca_, String modelo_, int numPassageiros_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
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
