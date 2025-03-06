package pkg1;

public class Math_Class {
    public static void main(String[] args) {
        int a = 150;
        int b = 500;

        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.abs(a));
        System.out.println(Math.PI);
        System.out.println(Math.E);


        System.out.println(Math.pow(1,2));
        System.out.println(Math.sqrt(200));
        System.out.println(Math.cbrt(27));

        double x = 12.98;
        double y = 15.60;

        System.out.println(Math.ceil(x)); //upper round up
        System.out.println(Math.floor(y)); //lower round up
        System.out.println(Math.round(x)); //round up

        System.out.println("-------------------------");

        System.out.println(Math.random());
    }
}
