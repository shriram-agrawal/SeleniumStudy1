package pkg1;

public class Classroom {
    private String sub;
    private int stdCount;

    public String getSubject() {
        return sub;
    }

    public void setSubject(String subject) {
        this.sub = subject;
    }

    public int getStudentsCount() {
        return stdCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.stdCount = studentsCount;
    }

    public void displayMethod(){
        System.out.println("This is a "+sub+" classroom and it has "+stdCount+" students");
    }
}
