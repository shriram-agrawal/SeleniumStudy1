package pkg1;

public class Road_Toll {
    String type;
    int tiresCount;

    public void calToll(){
        if(tiresCount == 2){
            System.out.println("Your toll amount is 0" );
        }
        else if (tiresCount == 4){
            System.out.println("Your toll amount is 10");
        } else if (tiresCount > 4 ) {
            System.out.println("Your toll amount is 20");
        }
        else {
            System.out.println("Get in touch with the operator");
        }

    }

    public Road_Toll(){
        System.out.println("Constructos is called");
    }

    public Road_Toll(String type, int tiresCount){
        this.type   = type;
        this.tiresCount = tiresCount;
    }
}
