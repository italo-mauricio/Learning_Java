package POO.com.italo.aulas.Super;

public class Student extends People {

    private String course;
    private double[] notes;

    public Student(){
        super();
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
}
