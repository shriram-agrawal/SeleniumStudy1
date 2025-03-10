package pkg1;

import inheritance.Cars;

public class Japanese_Cars extends Cars {

    public void setCarDetails(){
        make = "Tesla";
        //model = "Y"; won't work as it is not accessible outside package
        //year = 2025; won't work as it is not accessible outside package
    }
}
