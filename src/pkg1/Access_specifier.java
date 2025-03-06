package pkg1;

public class Access_specifier {
    /**
     Public Access
     default / no access
     Private
     Protected
     */
    public int a =200;
    int b = 300;
    private int c = 400;


    public void doThisPublic(){
        System.out.println("Public method");
    }

    private void doThisPrivate(){
        System.out.println("Private method");
    }

    void doThisDefault(){
        System.out.println("Default method");
    }
}
