package POO.com.italo.aulas.Polimorfismo;

public class TestPolimorfismo {
    public static void main(String[] args) {
        People people = new People();
        People student = new Student();
        People teacher = new Teacher();

        people.setName("italo");
        people.setPhone("398823912");
        people.setPrivateNumber("321321312");
        people.setCpf("23123923129");
        people.setAddress("Street One, Number 1");

        student.setName("Pedro");
        student.setCpf("9585943439");
        student.setPhone("2321392312");
        student.setPrivateNumber("239231932");
        student.setAddress("Street Two, Number 2");

        teacher.setName("Paulo");
        teacher.setCpf("2321354232");
        teacher.setPhone("323123432");
        teacher.setPrivateNumber("23244832833");
        teacher.setAddress(("Street Third, Number 3"));

        System.out.println(people.getNameLabel());
        System.out.println(people.getCpfLabel());
        System.out.println(people.getAddressLabel());
        System.out.println(student.getNameLabel());
        System.out.println(student.getCpfLabel());
        System.out.println(student.getAddressLabel());
        System.out.println(teacher.getNameLabel());
        System.out.println(teacher.getCpfLabel());
        System.out.println(teacher.getAddressLabel());
    }
}
