package pkg1;

public class Student_Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        //s1.name = "Rob"; got the warning for this to make a change as Class.variable as the variable is a static variable
        Student.name = "Ross";
        s1.grade = "2nd";
        s1.age  = 7;

        s2.name = "Bob";
        s1.grade = "3rd";
        s1.age  = 8;

        s1.studentInfo();
        s2.studentInfo();
        Student.doThis();
    }
}
