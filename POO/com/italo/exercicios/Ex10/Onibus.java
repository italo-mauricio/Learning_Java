package POO.com.italo.exercicios.Ex10;

public class Onibus {

    private int bancoReclinaveis;
    private String marca;
    private String modelo;
    private int numPassageiros;
    private int numPoltronas;
    private double capCombustivel;

    public int getBancoReclinaveis(){
        return this.bancoReclinaveis;
    }

    public void setBancoReclinaveis(int bancoReclinaveis){
        this.bancoReclinaveis = bancoReclinaveis;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public int getNumPoltronas(){
        return this.numPoltronas;
    }

    public void setNumPoltronas(int numPoltronas){
        this.numPoltronas = numPoltronas;
    }

    public double getCapCombustivel(){
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }
}
