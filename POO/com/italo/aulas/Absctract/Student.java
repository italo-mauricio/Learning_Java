package POO.com.italo.aulas.Absctract;

public class Student extends People {

    private String course;
    private double[] notes;

    public Student(){
        super();
    }

    public void verifyAcess(){
        this.nomeVisibilidade = "italo";
        super.nomeVisibilidade = "pablo";
    }

    public Student(String name, String address, String phone, String course) {
        super(name, address, phone);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public double calculateAverage(){
        return 0;
    }

    public boolean chekAproved(){
        return true;
    }

    public void testingMethod(){
        super.setCpf("21321321312");
        this.setCpf("23123123123");
    }
    public String getAddressLabel(){
        String s = "Student's Address: ";
        s += this.getAddress();
        return s;
    }

    public String getNameLabel(){
        String s = "Student's Name: ";
        s += this.getName();
        return s;
    }
    public String getCpfLabel(){
        String s = "Student's CPF: ";
        s += this.getCpf();
        return s;
    }
}
