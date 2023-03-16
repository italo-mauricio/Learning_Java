package POO.com.italo.exercicios.Ex13;

public class ContaBanco {

   private String numConta;
   private String agencia;
   private String cvv;
   private boolean especial;
   private double limiteEspecial;
   private double saldo;
   private boolean emprestimoAtivo;
   private double valorEspecialUsado;
   private String senha;

    public ContaBanco(String numConta, String agencia, String cvv, boolean especial, double limiteEspecial,
                      double saldo, boolean emprestimoAtivo, double valorEspecialUsado, String senha) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.cvv = cvv;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
        this.emprestimoAtivo = emprestimoAtivo;
        this.valorEspecialUsado = valorEspecialUsado;
        this.senha = senha;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEmprestimoAtivo() {
        return emprestimoAtivo;
    }

    public void setEmprestimoAtivo(boolean emprestimoAtivo) {
        this.emprestimoAtivo = emprestimoAtivo;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean realizarSaque(double quantidadeSaque){
        // tem saldo na conta?
        if (saldo >= quantidadeSaque){
            saldo -= quantidadeSaque;
            return true;
        }else {
            // não tem saldo na conta
            if (especial){
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantidadeSaque){
                    saldo -= quantidadeSaque;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;   // não é conta espcial, não tem saldo suficiente
            }
        }
    }

}
