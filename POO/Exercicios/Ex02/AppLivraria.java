package POO.Exercicios.Ex02;


import java.util.Date;

public class AppLivraria {
    String nomeLivro;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;
    double precoLivro;
    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;

    public static void main(String[] args) {
        AppLivraria LivroLivraria = new AppLivraria();

        LivroLivraria.precoLivro = 15.0;
        LivroLivraria.autor = "Pedro";
        LivroLivraria.nomeLivro = "O livro";
        LivroLivraria.emprestado = false;
        LivroLivraria.dataEntrega = new Date();
        LivroLivraria.emprestadoA = "Italo";
        String statusLivro;

        if (LivroLivraria.emprestado) {  // faço a inserção da String a partir do valor booleano. Através do value.of
            statusLivro = String.valueOf(LivroLivraria.emprestado);
            statusLivro = "Emprestado";
        } else {
            statusLivro = "Não emprestado";
        }
        System.out.println("Preço do livro é: " + LivroLivraria.precoLivro);
        System.out.println("Nome do livro: " + LivroLivraria.nomeLivro);
        System.out.println("Autor: " + LivroLivraria.autor);
        System.out.println("Status emprestado do livro: " + statusLivro);
        System.out.println("Cliente atual: " + LivroLivraria.emprestadoA);
    }
}


