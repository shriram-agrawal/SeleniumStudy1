package module7;

public class Arrays_2D {
    public static void main(String[] args) {
        String [][] arr_week = {{"M", "O", "N"}, {"T","U","E"}, {"W", "E", "D"}};
/* this will not work as there are 2 arrays now
    for(String n : arr_week) {
        System.out.println(n);
  */
        System.out.println(arr_week.length);
        System.out.println(arr_week[0].length);

        System.out.println(arr_week[0][0]);
        System.out.println(arr_week[2][0]);

        arr_week[1][1] = "H";
        arr_week[1][2] = "U";

        // System.out.println(arr_week[1]); will not work

        for(String[] x : arr_week){
            for (String y : x){
                System.out.println(y);
            }
            System.out.println("-------------");
        }
    }
}
