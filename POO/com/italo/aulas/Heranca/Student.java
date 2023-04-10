package POO.com.italo.aulas.Heranca;

public class Student extends People{

    private String course;
    private double[] notes;


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
}
