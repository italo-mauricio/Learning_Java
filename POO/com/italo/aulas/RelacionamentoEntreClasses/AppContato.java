package POO.com.italo.aulas.RelacionamentoEntreClasses;

public class AppContato {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Italo");
        contato.setEndereco("Rua tal");
        contato.setTelefone("9884434439");


        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());
    }
}
