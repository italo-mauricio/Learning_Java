package POO.com.italo.aulas.Polimorfismo;

public class Teacher extends People {

    private double salary;
    private String nameCourse;

    public void verifyAcess(){
        this.nomeVisibilidade = "sadasd";
        super.nomeVisibilidade = "dasdasdas";
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public double calculateLiquidSalary(){
        return 0;
    }

    public String getAddressLabel(){
        String s = "Teacher's Address: ";
        s += this.getAddress();
        return s;
    }

    public String getNameLabel(){
        String s = "Teacher's Name: ";
        s += this.getName();
        return s;
    }
    public String getCpfLabel(){
        String s = "Teacher's CPF: ";
        s += this.getCpf();
        return s;
    }

}
