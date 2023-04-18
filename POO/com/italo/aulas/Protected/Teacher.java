package POO.com.italo.aulas.Protected;

public class Teacher extends People {

    private double salary;
    private String nameCourse;

    public void verifyAcess(){
        this.nomeVisibilidade = "TESTE";
        super.nomeVisibilidade = "TESTE";
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
}
