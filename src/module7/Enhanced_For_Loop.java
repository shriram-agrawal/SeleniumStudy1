package module7;

import java.util.Scanner;

public class Enhanced_For_Loop {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num1 = s1.nextInt();

        int [] arr = new int [10];

        for (int i = 1; i<=10 ; i++){
            arr[i-1] = num1* i; // here i =  0 is not used because the formula will fail. hence we started from 1 and set the values from i-1 i.e. 0
        }
        //modified for loop
        System.out.println("---------------------------------------------------");
        for(int n : arr){  //for every iteration of n from the collection of arr. So it will iterate for all the indexes of arr
            System.out.println(n);
        }
    }
}
