package oop.labor07.lab7_1.account;
import oop.labor07.lab7_1.account.BankAccount;
import oop.labor07.lab7_1.account.SavingsAccount;
public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double interestRate){
        super();
        this.interestRate=interestRate;
    }
    public SavingsAccount(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
            return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterest(){
        this.balance=interestRate*balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount"+ accountNumber + "interestRate=" + interestRate;
    }
}
