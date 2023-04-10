package POO.com.italo.exercicios.Ex20;

public class Teacher {
    private String nameTeacher;
    private String email;
    private String department;

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String obterInfo(){
        return "Teacher = " + nameTeacher;
    }
}
