package pkg1;

public class Temp {
    public static void main(String[] args) {
        //using it from another class
        Cars c1 = new Cars(); //declaring the object from the class and instantiating it
        //ClassName Object = New means we are instantiating the Object and Cars() is the constructor
        c1.displayDetails();
        c1.color = "Red";
        c1.make  = "Tesla";
        c1.type = "Model Y";

        c1.displayDetails();


        Cars c2 = new Cars();
        //created another object

        c2.color    =   "Orange";
        c2.make     =   "Toyota";
        c2.type     =   "Truck";

        c2.displayDetails();

        Method_Overloading mo1 = new Method_Overloading();
        mo1.addition(10,20);
        mo1.addition(12.12, 12.12);
        mo1.addition(10,010.12);
        mo1.addition(10.12,10.12,10);

        //calling public/private/default methods from the Access_specifier class
        Access_specifier as1 = new Access_specifier();
        as1.doThisPublic();
        as1.doThisDefault();
        //as1.doThisPrivate(); Do not work as it is private

    }
}
