package oop.labor06;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private static int numAccount= 0;
    private static final int ACCOUNT_NUMBER_LENGTH = 10;
    //methods
    public BankAccount(){

        this.accountNumber = createAccountNumber();
    }
    static String createAccountNumber() {
        String r = "OTP";
        ++numAccount;
        int zeros = ACCOUNT_NUMBER_LENGTH- r.length()-String.valueOf(numAccount).length();
        for (int i = 0; i < zeros; i++) {
            r=r+"0";
        }
        r=r+numAccount;
        return r;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double money){
        if (money>0){
            balance += money;
        }
    }
    public boolean withdraw(double money){
        if (balance>money){
            balance -= money;
            return true;
        }
        else {
            return false;
        }

    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public  String toString(){
        return "ez egy bankszamla: "+ accountNumber + ", egyenleg: "+ balance;
    }


}