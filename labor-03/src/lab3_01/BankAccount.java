package lab3_01;

public class BankAccount {
    //attributes:
    private String accountNumber;
    private double balance;
    //methods
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;

    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        if(amount>0)
            this.balance=this.balance+amount;
    }
    public boolean withdraw(double amount){
        if(this.balance<amount || amount<0)
            return false;
        else
            return true;
    }
    public String toString() {
        return "Account number: "+accountNumber+"\n"+balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
}
