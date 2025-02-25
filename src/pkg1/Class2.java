package pkg1;

public class Class2 {
    public static void main(String[] args) {
        int a = 50;
        while (a > 50) {
            System.out.println(a);
            a -= 10;
        }
        System.out.println("Loop end");

        do {
            System.out.println(a);
            a -= 10;
            System.out.println(a);
        } while (a > 50);


        System.out.println("break ");
        int b =100;
        while (b > 50){
            b-=10;
            if (b == 70){
                break;
            }
            System.out.println(b);
        }

        System.out.println("continue");
        int c =100;
        while (c > 50){
            c-=5;
            if (c == 75){
                continue;
            }
            System.out.println(c);
        }



    }
}
