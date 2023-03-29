package POO.com.italo.exercicios.Ex19;

public class Contact {
    private String name;
    private String email;
    private String age;
    private String phone;
    private String nameStreet;
    private String cep;
    private String numberStreet;
    private String city;
    private String state;

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumberStreet() {
        return numberStreet;
    }

    public void setNumberStreet(String numberStreet) {
        this.numberStreet = numberStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String obterInfo(){
        return "Name = " + name + "\n" +
                "\n" +
                "Phone = " + phone + "\n" +
                "Email = " + email + "\n" +
                "Age = " + age + "\n" +
                "City: " + city + "\n" +
                "Street: " + nameStreet + "\n" +
                "Statement: " + state + "\n" +
                "Number Street: " + numberStreet + "\n" +
                "CEP: " + cep + "\n";

    }


}
