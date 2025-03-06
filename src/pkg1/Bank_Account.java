package pkg1;

public class Bank_Account {
    /*
    1. Create a clss with name Bank Account
    2. Private member variable for acct num, name and balance
    3. create method to deposit and withdraw amount and display current balance
    4. create  a constuctor with arguments to give Acct Num, name and balance
    5. create an oject of bank_Account class
    6. call the methods
     */
    private long acctNumber ; //created as private just to avoid anyone modifying htese values after teh constructor is ceated
    private String acctName ;
    private double acctBalance ;

    public void depositAmount(double amtDeposit) {
        //if condition to avoid negative entry
        if (amtDeposit > 0) {
            acctBalance = acctBalance + amtDeposit;
            System.out.println("Successfully deposited $ " + amtDeposit);
        } else {
            System.out.println("Cannot deposit " + amtDeposit);
        }
    }

    public void withdrawAmount(double amtWithdraw){
        if (amtWithdraw > 0) {
            acctBalance = acctBalance - amtWithdraw;
            System.out.println("Successfully withdrawn $"+amtWithdraw);
        }else {
            System.out.println("Cannot withdraw $"+amtWithdraw);
        }
    }

    public void displayBalance(){
        System.out.println("your account balance is $"+acctBalance);
    }


    public Bank_Account( long acctNumber, String acctName,double acctBalance){
            System.out.println("Constructor is called");
            this.acctNumber = acctNumber;
            this.acctName = acctName;
            this.acctBalance = acctBalance;
        }


    }
