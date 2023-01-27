public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro; // aqui o java vai verificar toda a expressão mesmo sabendo que é falsa
        boolean resultado2 = falso &&
                verdadeiro; // aqui ele já vai pular direto no inicio do falso
        System.out.println(resultado1);
        System.out.println(resultado2);

        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }
}
