package POO.Exercicios.Ex02;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nomeLivro = "A batalha do apocalipse";
        livro.autor = "Eduardo Spohr";
        livro.anoLancamento = 2008;
        livro.isbn = "2312312";
        livro.qtdPaginas = 500;


        System.out.println("Nome do livro: " + livro.nomeLivro);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de lançamento: " + livro.anoLancamento);
        System.out.println("ISBN: " + livro.isbn);
        System.out.println("Quantidade de páginas: " + livro.qtdPaginas);

    }
}
