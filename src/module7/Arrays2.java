package module7;

public class Arrays2 {
    public static void main(String[] args) {
        int [] arr1 = new int [10];

        for(int i = 0; i <= arr1.length - 1 ; i++){
            System.out.println(arr1[i]);
        }

        arr1[0] = 10;
        arr1[2] = 30;

        for(int i = 0; i <= arr1.length - 1 ; i++){
            System.out.println(arr1[i]);
        }

    }
}
