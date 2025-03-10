package super_keyword;

public class B extends A{
    int num1 = 200;


    public void doThis(){
        System.out.println("Do this from B");
    }

    public void xyz(){
        doThis(); //if we run the Main_Class. The doThis fun from B will run not from A
        super.doThis(); //hence adding the Super keyword. This will execute from Class A as the A Class is the Super Class
        System.out.println(num1);
        System.out.println(super.num1);
        System.out.println("xyz executed");
    }
}
