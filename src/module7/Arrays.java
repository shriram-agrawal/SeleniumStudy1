package module7;

public class Arrays {
    public static void main(String[] args) {
        String [] DaysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "SAT", "Sun"}; //created an array of the data type string and declared the values
        System.out.println(DaysOfWeek.length);
        System.out.println(DaysOfWeek[2]); //read the value at particular index

        DaysOfWeek[2] = "WEDNESDAY"; //update the value at a particular index
        System.out.println(DaysOfWeek[2]);
        //System.out.println(DaysOfWeek[7]); array out of boud exception

        for (int i = 0 ; i <= DaysOfWeek.length - 1 ; i++){
            System.out.println(DaysOfWeek[i]);
        }

        int [] arr1 = {1,2,3,4,5,7,8,9,10};
        char [] arr2 = {'a', 'b', 'c'};



    }
}
