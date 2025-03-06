package pkg1;

public class Student {

    static String name = "ABC"; //changing the name to be a static variable
    byte age = 6;
    String grade = "1st";

    public void studentInfo(){
        System.out.println("Student "+name+" is "+age+" years old and in "+grade+" grade");
    }
    public static void  doThis(){
        System.out.println("do this");
    }

}
