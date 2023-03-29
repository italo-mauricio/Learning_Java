package POO.com.italo.exercicios.Ex20;

public class Course {
    private String nameCourse;
    private String time;
    private Teacher teacher;
    private Student[] students;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getInfo(){
        String info = "Course Name" + nameCourse + "\n";
        if (teacher != null){
            info += teacher.getInfo();
        }
        if (teacher != null){
            System.out.println("    Students    ");
            for(Student student : students){
                info += student.getInfo();
            }
        }
        return info;
    }
}
