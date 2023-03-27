package POO.com.italo.aulas.RelacionamentoEntreClasses;



public class AppContato {
    public static void main(String[] args) {
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
        contato.setEndereco(end);
        // aqui precisamos setar o objeto
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getNomeRua());
        }

        // cria o objeto para telefone 1

        Telefone tel = new Telefone();
        tel.setDdd("081");
        tel.setTipo("Celular");
        tel.setNumero("8323-8899");

        // cria o objeto para o telefone 2

        Telefone tel2 = new Telefone();
        tel2.setDdd("081");
        tel2.setTipo("Celular");
        tel2.setNumero("8899-9888");

        // instancia o array para os dois objetos criados anteriormente

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel2;
        telefones[1] = tel;

        // seta o array
        contato.setTelefones(telefones);

        // verifica se tanto a classe conato, quanto os telefones são null

        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }








    }
}
