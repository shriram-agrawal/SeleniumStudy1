package pkg1;


import javax.swing.*;
import java.sql.SQLOutput;

public class StringsBasics {
    public static void main(String[] args) {
        String str1 = "Nalanda";
        String str2 = "University";

        System.out.println("Concatenation");
        String str3 = str1+str2;
        System.out.println(str3);
        String str4 = str1.concat(str2);
        System.out.println(str4);

        int num1 = 100;
        System.out.println(str1+num1);

        System.out.println("Length");
        int num2 = str1.length();
        System.out.println(num2);

        String str5 = "     trim the redundant spaces        ";
        System.out.println(str5);
        System.out.println(str5.trim());

        System.out.println((str5.trim()).toUpperCase());

        System.out.println(str5.isEmpty());

        String str6 = "";
        System.out.println(str6.isEmpty());

        System.out.println("String Comparision");
        str1.equals(str2);
        String str7 = "Nalanda";
        String str8 = "nalanda";

        System.out.println(str1.equals(str7));
        System.out.println(str1.equals(str8));

        System.out.println(str1.equalsIgnoreCase(str8));

        if (str1.equals(str7)) {
            System.out.println("It's equal");
        }

        System.out.println(str1.compareTo(str7));
        System.out.println(str1.compareTo(str8));
        System.out.println(str1.compareToIgnoreCase(str8));

        System.out.println("matches - used when we want to match the string with regex");

        String str9 = "[A-Z]";
        System.out.println((str1.toLowerCase()).matches(str8));

        System.out.println("Search, index of string");

        String str10 = "I love Java and Selenium";
        String str11 = "Java";
        String str12 = "selenium";

        System.out.println(str10.contains(str11));
        System.out.println(str10.contains(str12));
        System.out.println((str10.toLowerCase()).contains(str12));

        System.out.println(str10.startsWith("I"));
        System.out.println(str10.endsWith("nium"));

        System.out.println(str10.indexOf("love"));

        String str13 = "I love Java and Selenium love";
        System.out.println(str13.indexOf("love"));
        System.out.println(str13.indexOf("love", 6));

        System.out.println("** -- Strings SLICE -- ** char at, substring, split");
        String str21 = "ABCDEFG";
        System.out.println(str21.charAt(5));
        //System.out.println(str21.charAt(12));

        System.out.println("** -- Write a program to reverse a string -- **");
        String str22 = "HRIDHAAN";
        int num5 = str22.length();
        //System.out.println(num5);
        for (int a = num5 - 1 ; a >=0 ; a--){
            System.out.print(str22.charAt(a));
        }
        System.out.println("\n");
        String temp = "";
        System.out.println("another way");
        for (int a = 0 ; a <= num5 - 1 ; a ++){
            temp =  str22.charAt(a) + temp ;
        }
        System.out.println(temp);

        System.out.println(str22.substring(2));
        System.out.println(str22.substring(2,num5-1));
        System.out.println(str22.substring(2,5));

        System.out.println("We can use split for removing deliminator");
        String str24 = "A_B_C_D_";
        String str25 = "_";
        String[] arr = str24.split(str25);
        for (String x : arr) {
            System.out.println(x);
        }

        System.out.println(" ** -- Replace and Replace ALl -- **");
        String str31 = "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
        String str32 = "1234";
        String str33 = "I";

        System.out.println(str31.replace("1234","I"));
        System.out.println(str31.replace(str32,str33));

        String str34 = "E#@I£$THER YO%^U D^&O I^&T O*(R I DO I#|T";
        String str35 = "[^A-Za-z0-9\\s]";

        System.out.println(str34.replaceAll(str35,""));

        System.out.println(" **  __ Type Conversion for String __   ***");
        int num10 = 100;

        System.out.println(Integer.toString(num10));
        System.out.println(Integer.toBinaryString(num10));
        System.out.println(Integer.toHexString(num10));
        System.out.println(Integer.toOctalString(num10));

        String str36 = "100";
        String str37 = "1100100";
        String str38 = "64";
        String str39 = "144";

        System.out.println(Integer.parseInt(str36));
        System.out.println(Integer.parseInt(str37,2));
        System.out.println(Integer.parseInt(str38, 16));
        System.out.println(Integer.parseInt(str39, 8));




    }
}
