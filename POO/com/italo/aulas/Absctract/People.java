package POO.com.italo.aulas.Absctract;

public class People {
    private String name;
    private String address;
    private String phone;
    private String cpf;
    private String privateNumber;
    protected String nomeVisibilidade;
    public People(){
    }
    public People(String name, String address, String phone) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getPrivateNumber() {
        return privateNumber;
    }

    public void setPrivateNumber(String privateNumber) {
        this.privateNumber = privateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddressLabel(){
        return address;
    }
    public String getNameLabel(){
        return name;
    }
    public String getCpfLabel(){
        return cpf;
    }
    public String getNumberLabel(){
        return phone;
    }
}
