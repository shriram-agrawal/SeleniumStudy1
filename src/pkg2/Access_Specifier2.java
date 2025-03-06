package pkg2;

import pkg1.Access_specifier; //we will create the object of the class from other package. Hence, import the package first

public class Access_Specifier2 {
    public static void main(String[] args) {
        Access_specifier as2 = new Access_specifier(); //object of the public class created in other package

        as2.doThisPublic();
       // as2.doThisDefault(); //default can not be accessed out of the package

    }
}
