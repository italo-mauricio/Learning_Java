package POO.com.italo.aulas.Final;

public class Student  {

    private String course;
    private double[] notes;

    public Student(){
        super();
    }

    public void verifyAcess(){
        //this.nomeVisibilidade = "italo";
        //super.nomeVisibilidade = "pablo";
    }

    public Student(String name, String address, String phone, String course) {
        //super(name, address, phone);
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
      //  super.setCpf("21321321312");
      //  this.setCpf("23123123123");
    }
    public String getAddressLabel(){
        String s = "Student's Address: ";
       // s += this.getAddress();
        return s;
    }

   //@Override
    public void displayAddressLabel() {
        System.out.println(this.getAddressLabel());
    }

    public String getNameLabel(){
        //   s += this.getName();
        return "Student's Name: ";
    }
    public String getCpfLabel(){
        //   s += this.getCpf();
        return "Student's CPF: ";
    }
}
