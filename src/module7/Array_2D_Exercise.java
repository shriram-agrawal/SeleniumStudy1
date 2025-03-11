package module7;

public class Array_2D_Exercise {
    public static void main(String[] args) {
        /* write a prgram to add tables of 2-6 in the rows of 2-D array*/
        int [][] arr_tables = new int[5][10];

        for (int i = 2 ; i <=6 ; i++){
            for (int j = 1; j<=10 ; j++){
                arr_tables[i-2][j-1] = i*j;
            }
        }

        for (int []x : arr_tables){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }

    }
}
