public class CuriosidadeInt {
    public static void main(String[] args) {
        int var1 = 2147483647;

        int var2 = 100;

        System.out.println(var1 + var2);

        // Não vai dar estouro pois os números no java funcionam igual uma roleta
        // quando eu somar com o máximo do inteiro, ele vai voltar para os números negativos
    }
}
