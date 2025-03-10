package inheritance;

public class Animal_Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.whoAmI();

        Cat c = new Cat();
        c.whoAmI(); //here whoAmI method is common between Prent and Child class. Everything is same except the implementation
            //in this case, method name, type, return, parameters all are same between Animal and Cat
            //if we run this program, method in child class will be executed as it overrides the implementation of parent class
    }
}
