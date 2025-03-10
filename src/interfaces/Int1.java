package interfaces;

public interface Int1 {
    int a = 0; //by default static and final


    void doThis(); //no need to add abstract keyword. No need of implementation

    static void xyz(){
        System.out.println("Static xyz from INT1");
    }

    default void uvw(){
        System.out.println("default uvw from INT1");
    }
}
