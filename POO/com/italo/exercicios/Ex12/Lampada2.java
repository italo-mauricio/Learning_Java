package POO.com.italo.exercicios.Ex12;

public class Lampada2 {
    private String modelo;
    private String tensao;
    private int potencia;
    private String corLuz;
    private String cor;
    private int garantiaMeses;
    private String [] tipos;
    private boolean tipoAbajur;
    private boolean ligado;

    public Lampada2(String modelo, String tensao, int potencia, String corLuz,
                    String cor, int garantiaMeses, String[] tipos,
                    boolean tipoAbajur, boolean ligado) {

        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.corLuz = corLuz;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligado = ligado;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCorLuz() {
        return corLuz;
    }

    public void setCorLuz(String corLuz) {
        this.corLuz = corLuz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void mostrarEstado(){
        if(isLigado()){
            System.out.println("A lâmpada está Ligada");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }

    public void mudarEstado(){
        if(isLigado()){
            desligar();
        }else{
            ligar();
        }
    }

}
