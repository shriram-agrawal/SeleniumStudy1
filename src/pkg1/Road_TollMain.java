package pkg1;

public class Road_TollMain {
    public static void main(String[] args) {
        Road_Toll rt1 = new Road_Toll();
        Road_Toll rt2 = new Road_Toll("Truck", 6);
        rt2.calToll();
        rt1.type = "Sedan";
        rt1.tiresCount = 4;
        rt1.calToll();
    }
}
