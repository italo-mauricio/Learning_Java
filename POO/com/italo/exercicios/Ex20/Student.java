package POO.com.italo.exercicios.Ex20;

public class Student {
    private String nameStudent;
    private String registration;
    private double[] note;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double[] getNote() {
        return note;
    }

    public void setNote(double[] note) {
        this.note = note;
    }

    public String getInfo(){
        String info = "Student Name = " + nameStudent + "; ";
        info += "Registration = " + registration + "; ";
        info += "Notes: ";
        for (double notes : note){
            info += notes + " ";
        }
        return info;
    }

}
