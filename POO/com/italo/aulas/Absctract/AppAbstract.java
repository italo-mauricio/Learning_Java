package POO.com.italo.aulas.Absctract;

public class AppAbstract {
    public static void main(String[] args) {

       // People people = new People();
        People student = new Student();
        People teacher = new Teacher();

       // people.setAddress("Rua 1");
        student.setAddress("Rua 2");
        teacher.setAddress("Rua 3");

        student.displayAddressLabel();
        teacher.displayAddressLabel();
    }
}
