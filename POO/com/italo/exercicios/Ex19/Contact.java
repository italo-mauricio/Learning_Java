package POO.com.italo.exercicios.Ex19;

public class Contact {
    private String name;
    private String email;
    private String age;

    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
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
        return "Name: " + name + ";" +
                "Phone: " + phone + ";" +
                "Email: " + email + ";" +
                "Age: " + age + ";";
    }
}
