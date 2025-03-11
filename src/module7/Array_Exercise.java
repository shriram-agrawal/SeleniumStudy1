package module7;

public class Array_Exercise {
    public static void main(String[] args) {
        /* write a program to reverse the content of an Array*/
        int [] arr = {10,20,30,40,50,60,70,80};
        for (int n : arr){
            System.out.println(n);
        }
        //the below logic only display the array in reverse
        System.out.println("-------------------------------------");
        for (int i = arr.length - 1 ; i >=0; i--){
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------------");
        //the below logic reverse the contents of the array
        int j = arr.length-1;
        int temp = 0;
        for (int i = 0; i<= (arr.length-1)/2; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for (int n : arr){
            System.out.println(n);
        }
    }
}
