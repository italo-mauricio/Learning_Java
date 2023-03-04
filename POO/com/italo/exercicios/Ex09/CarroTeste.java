package POO.com.italo.exercicios.Ex09;

public class CarroTeste {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public CarroTeste(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    }

    public CarroTeste(String marca, String modelo){
        this("Ferrari", "Spider", 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }



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
