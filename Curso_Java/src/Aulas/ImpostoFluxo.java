package Aulas;

public class ImpostoFluxo {
    public static void main(String[] args) {
        double salario = 95000000;
        double novoSalario, porcento;

        if(salario < 1000){
            System.out.println("Você deverá pagar 10% de imposto\n");
            porcento = 10.0/100;
            novoSalario = salario * porcento;
            salario -= novoSalario;
            System.out.println("Seu novo saldo é de: " + salario);
        }else if (salario >= 1000 && salario <= 2000){
            System.out.println("Você deverá pagar 15% de imposto\n");
            porcento = 15.0/100;
            novoSalario = salario * porcento;
            salario -= novoSalario;
            System.out.println("Seu novo saldo é de: " + salario);
        }else if (salario > 2000){
            System.out.println("Você deverá pagar 25% de imposto\n");
            porcento = 25.0/100;
            novoSalario = salario * porcento;
            salario -= novoSalario;
            System.out.println("Seu novo saldo é de: " + salario);
        }else{
            System.out.println("Valor informado inválido!\n");
        }
    }
}
