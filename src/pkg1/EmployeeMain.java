package pkg1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.empName = "Sudhir Chaudhary";
        e1.empID = 111;
        e1.empSalary = 5000000;

        e1.calcBonus();

        Employee e2 = new Employee("Sneha");

        e2.empName = "Sandeep";
        e2.empSalary = 1000000;
        e2.empID    = 2222;

        e2.calcBonus();
    }
}
