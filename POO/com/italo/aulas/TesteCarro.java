package POO.com.italo.aulas;

public class TesteCarro {
    public static void main(String[] args) {

        PrincipalCarro van = new PrincipalCarro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        double autonomia = van.obterAutonomia();
        double qtdCombustivel10 = van.calcularCombustivel(10);


        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println("Autonomia da van: " + autonomia + " km");
        System.out.println("Para 10 km pecorridos a Van consome: " + qtdCombustivel10 + " Litros");


        PrincipalCarro fusca = new PrincipalCarro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numPassageiros);
        System.out.println(fusca.capCombustivel);
        System.out.println(fusca.consumoCombustivel);



    }
}
