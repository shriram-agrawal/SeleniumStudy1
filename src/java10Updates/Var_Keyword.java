package java10Updates;

public class Var_Keyword {
    public static void main(String[] args) {
        int x = add(500,600); //way 1 to call the method
        var y = add(500,600);//using var

        int [] arr = new int[10];
        var arr2 = new int [10];
        //but
        int [] arr3 = {1,2,3};
         //var arr4 = {1,2,3}; this will not work
        //also
        //var is not be used in the class for the same functions only in methods
        //can't use var in declaring array, class methods, arguments

    }
    public static int add(int a , int b){
        return a+b;
    }
}
