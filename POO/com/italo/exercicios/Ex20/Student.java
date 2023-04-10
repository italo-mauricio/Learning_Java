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

    public String obterInfo(){

        String info = "\nStudent Name: " + nameStudent + "; ";
        info += "\nRegistration: " + registration + "; ";
        info += "\nNotes: ";

        double sum = 0;
        for (double notes : note){
            sum += notes;
            info += notes + " | ";
        }
        double average = sum/4;
        info += "\n" + "Average: " + average + " - ";

        if(average >= 7){
            info += "Approved!";
        }else if (average >= 5){
            info += "Recovery!";
        }else if (average < 3){
            info += "Disaproved!";
        }
        return info;
    }

    public double obterMedia(){
        double soma = 0;
        for (double nota : note){
            soma += nota;
        }
        return soma / 4;
    }

}
