package inheritance;

public class German_Cars extends Cars{
    public void setCardetails(){
        make = "BMW";
        model = "S6";
        //years = 2025;  not working as year is private
        System.out.println("The car is "+make+" and "+model);
    }
}
