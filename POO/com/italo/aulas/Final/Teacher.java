package POO.com.italo.aulas.Final;

public class Teacher{

    private double salary;
    private String nameCourse;

    public void verifyAcess(){
       // this.nomeVisibilidade = "sadasd";
      //  super.nomeVisibilidade = "dasdasdas";
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
        //  s += this.getAddress();
        return "Teacher's Address: ";
    }

    //@Override
    public void displayAddressLabel() {
        System.out.println("Display Addres's Teacher");
        System.out.println(this.getAddressLabel());
    }

    public String getNameLabel(){
        // s += this.getName();
        return "Teacher's Name: ";
    }
    public String getCpfLabel(){
        // s += this.getCpf();
        return "Teacher's CPF: ";
    }

}
