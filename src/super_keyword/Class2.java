package super_keyword;

public class Class2 extends Class1{ //When we tried to create the Object of Class2, first thing gets executed is the Constructor.
    //Then argument passed to the Class2 constructor will go to Class1 Constructor by Super.keyword


    //class2 needs to create a constructor if there is a parameterised constructor in the Super Class Class1
    public Class2(int a) {
        super(a);
    }
}
