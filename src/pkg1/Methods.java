package pkg1;

public class Methods {
    public static void main(String[] args) {
        //learn methods
        Methods m1 = new Methods();
        m1.doThis();
        m1.addition(100,200);
        int x = m1.multiply(10,20);
        System.out.println(x);
    }

    public void doThis(){
        System.out.println("Do this Method");
    }

    public void addition (int num1, int num2){
        System.out.println("Addition of the numbers "+num1+" and "+num2+" is "+(num1+num2));
    }

    public int multiply(int num1, int num2){
        int num3 = num1 * num2;
        return num3;
    }

}
