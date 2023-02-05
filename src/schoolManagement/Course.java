package schoolManagement;

public class Course {
    /*
    Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
     */
    private Teacher teacher;
    private String name, code, prefix;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    private double note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.getBranch())) {
            this.teacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.getName() + " Akademisyeni bu dersi veremez.");
        }
        printTeacher(t);
    }

    private void printTeacher(Teacher t) {
        t.print();
    }
}
