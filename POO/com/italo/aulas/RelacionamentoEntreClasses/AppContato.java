package POO.com.italo.aulas.RelacionamentoEntreClasses;

import java.util.Scanner;

public class AppContato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contato contato = new Contato();

        contato.setNome("Italo");
        //contato.setEndereco("Rua tal");
        contato.setTelefone("9884434439");

        // criar o objeto endereço

        Endereco end = new Endereco();
        end.setNomeRua("Rua tal");
        end.setCidade("Caicó");
        end.setCep("53442322");
        end.setComplemento("-");
        end.setNumero("7");
        end.setEstado("RN");

        contato.setEndereco(end); // aqui precisamos setar o objeto

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getNomeRua());
        }else{
            System.out.println("Is Null");
        }

    }
}
