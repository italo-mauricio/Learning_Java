package POO.com.italo.exercicios.Ex19;

public class Schedule {
    private String nameDiary;
    private Contact[] contacts;

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getNameDiary() {
        return nameDiary;
    }

    public void setNameDiary(String nameDiary) {
        this.nameDiary = nameDiary;
    }

    public String obterInfo(){
        String info = "Name Diary = " + nameDiary + "\n";


        if(contacts != null){
            for (Contact c : contacts){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }
}
