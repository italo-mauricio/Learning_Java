package POO.com.italo.aulas.Polimorfismo;

public class AppPolimorfismo {
    public static void main(String[] args) {
        People people = new People();
        People student = new Student();
        People teacher = new Teacher();

        people.setAddress("Street One, Number 1");
        student.setAddress("Street Two, Number 2");
        teacher.setAddress(("Street Third, Number 3"));

        System.out.println(people.getAddressLabel());
        System.out.println(student.getAddressLabel());
        System.out.println(teacher.getAddressLabel());
    }
}
