package POO.com.italo.aulas.Validators;

public class CPF {
    public static boolean isCPF(String cpf) {
        // Remove caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos do CPF são iguais
        boolean todosIguais = true;
        for (int i = 0; i < 10; i++) {
            if (cpf.charAt(i) != cpf.charAt(i + 1)) {
                todosIguais = false;
                break;
            }
        }
        if (todosIguais) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (10 - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        // Cálculo do segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (11 - i) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        if (cpf.charAt(9) - '0' != digito1 || cpf.charAt(10) - '0' != digito2) {
            return false;
        }

        return true;
    }

}
