package inheritance;

public class Poly_Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setBaseandHeight(10.0,20.0);
        t1.calculateAre();

        Rectangle r1 = new Rectangle();
        r1.setBaseandHeight(20.20,34.00);
        r1.calculateArea();


    }
}
