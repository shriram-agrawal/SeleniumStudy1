package pkg1;

public class Employee {
    String empName = "FistName Surname";
    int empID = 1;
    float empSalary = 0.0F;
    float bonus = 0;

    public Employee(){
        System.out.println("Constructor");
    }

    public Employee(String str1){
        System.out.println("String "+str1);
    }

    public void calcBonus(){
        bonus = (float) (empSalary * 0.2);
        System.out.println("Employee "+empName+" with Employee ID "+empID+" and Salary "+empSalary+" gets a Bonus of "+bonus);
    }
}
