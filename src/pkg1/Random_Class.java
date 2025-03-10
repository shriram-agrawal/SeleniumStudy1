package pkg1;

import java.util.Random;

public class Random_Class {
    public static void main(String[] args) {
        Random r1 = new Random();
       // System.out.println(r1.nextInt(1000));

        //let's create 100 random numbers using this class
        for (int i = 1; i <= 100; i++){
            //System.out.println(r1.nextInt(1000)); //generate the random numbers between 0-1000
            System.out.println(r1.nextInt(1000)+1000); //gnerate random numbers from 1000-2000
        }



    }
}
