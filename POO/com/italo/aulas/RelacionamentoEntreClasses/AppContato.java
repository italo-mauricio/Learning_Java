package POO.com.italo.aulas.RelacionamentoEntreClasses;

import java.util.Scanner;

public class AppContato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contato contato = new Contato();

        contato.setNome("Italo");
        //contato.setEndereco("Rua tal");

        // criar o objeto endereço

        Endereco end = new Endereco();
        end.setNomeRua("Rua tal");
        end.setCidade("Caicó");
        end.setCep("53442322");
        end.setComplemento("Rua de tal");
        end.setNumero("7");
        end.setEstado("RN");
        contato.setEndereco(end); // aqui precisamos setar o objeto
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getNomeRua());
        }

        // criar o objeto para telefone

        Telefone tel = new Telefone();
        tel.setDdd("081");
        tel.setTipo("Celular");
        tel.setNumero("832344232324");

        contato.setTelefone(tel);
        if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd());
            System.out.println(contato.getTelefone().getNumero());
            System.out.println(contato.getTelefone().getTipo());

        }





    }
}
