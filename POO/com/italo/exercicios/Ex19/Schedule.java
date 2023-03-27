package POO.com.italo.exercicios.Ex19;

public class Schedule {
    private String name;
    private Contact[] contacts;
    private Address addres;


    public Address getAddres() {
        return addres;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
