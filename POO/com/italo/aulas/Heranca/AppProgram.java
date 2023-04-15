package POO.com.italo.aulas.Heranca;

public class AppProgram {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        People people = new People();

        student.setName("italo");
        System.out.println(student.getName());
        teacher.setPrivateNumber("1232132121");
        System.out.println(teacher.getPrivateNumber());

;    }
}
