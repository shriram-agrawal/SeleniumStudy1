package pkg1;

import java.util.Scanner;
//scanner class used to get the data from user and reverse the string
public class Scanner_Class {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str1 = sc1.nextLine();
        System.out.println(str1);
        String temp = "";
        for (int i = 0 ; i <= str1.length()-1 ; i++){
            temp = str1.charAt(i) + temp;
        }
        System.out.println(temp);
    }
}
