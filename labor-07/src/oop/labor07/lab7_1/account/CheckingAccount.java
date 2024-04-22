package oop.labor07.lab7_1.account;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public  String toString(){
        return "ez egy folyoszamla: "+ accountNumber + ", egyenleg: "+ balance;
    }
    @Override
    public boolean withdraw(double money){
        if (balance+overdraftLimit>=money){
            balance -= money;
            return true;
        }
        else {
            return false;
        }

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

}
