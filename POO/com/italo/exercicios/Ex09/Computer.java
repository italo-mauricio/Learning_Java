package POO.com.italo.exercicios.Ex09;

public class Computer {
    String cpu;
    String process;
    double memoryRam;
    String marca;
    double armazenamento;


    public Computer(String cpu, String process, double memoryRam, String marca, double armazenamento){
        this.cpu = cpu;
        this.process = process;
        this.memoryRam = memoryRam;
        this.marca = marca;
        this.armazenamento = armazenamento;

    }

    public Computer(){}

    public Computer(String cpu, String process){
        this(cpu, process, 0.0, "Intel", 0.0);
        System.out.println("Chamando o construtor com 2 parâmentros");
    }

    public Computer(double memoryRam, double armazenamento, String marca){
        this("intel", "amd", 10.0, "AMD", 1.0 );
        System.out.println("Chamando construtor com 3 parâmetros");
    }
}
