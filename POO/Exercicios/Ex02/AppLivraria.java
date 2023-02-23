package POO.Exercicios.Ex02;


public class AppLivraria {
    String nomeLivro;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;
    double precoLivro;

    public static void main(String[] args) {
        AppLivraria LivroLivraria = new AppLivraria();

        LivroLivraria.precoLivro = 15.0;
        LivroLivraria.autor = "Pedro";
        LivroLivraria.nomeLivro = "O livro";

        System.out.println("Preço do livro é: " + LivroLivraria.precoLivro);
        System.out.println("Nome do livro: " + LivroLivraria.nomeLivro);
        System.out.println("Autor: " + LivroLivraria.autor);
    }
}


