package pkg1;

public class bank_Account_Main {
    public static void main(String[] args) {
        Bank_Account ba1 = new Bank_Account(123456789,"Ram Agrawal", 10000);
        ba1.displayBalance();

        ba1.withdrawAmount(2000);

        ba1.displayBalance();

        ba1.depositAmount(-1000);

        ba1.displayBalance();

        ba1.depositAmount(1000);

        ba1.displayBalance();

    }
}
