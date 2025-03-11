package module7;

public class Array_of_Object {
    public static void main(String[] args) {
        Object [] arr = {"mayur",33,33.51,'M'};

        for(Object x : arr){
            System.out.println(x);
        }

        //2D array of object
        //consider an array of profile

        Object [][] arr_profile = {{"Mayur",'M', 30,"London"}, {"Shilpa", 'F', 28, "Glasgow"}};

        for (Object [] x : arr_profile){
            for (Object y : x){
                System.out.print(y+"   ");
            }
            System.out.println("\n");
        }
    }
}
