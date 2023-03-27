package POO.com.italo.exercicios.Ex19;

public class Schedule {
    private String name;
    private Contact[] contacts;
    private Address addres;
    private Phone cellPhone;

    public Phone getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Phone cellPhone) {
        this.cellPhone = cellPhone;
    }

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

    public String info(){
        String information = "Name Diary: " + name + "\n";

        if (contacts != null){
            for(Contact c : contacts){
                information += c.obterInfo() + "zn";
            }
        }
        return information;
    }
}
