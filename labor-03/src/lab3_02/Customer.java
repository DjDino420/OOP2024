package lab3_02;

import lab3_01.BankAccount;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    private BankAccount[] accounts;
    private int numAccounts;
    public static final int MAX_ACCOUNTS = 10;
    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accounts = new BankAccount[MAX_ACCOUNTS];
        this.numAccounts = 0;
    }
    public int getNumAccounts() {
        return numAccounts;
    }
    public void addAccount(BankAccount account) {
            accounts[numAccounts] = account;
            numAccounts++;
        }
    @Override
    public String toString() {
        StringBuilder customerInfo = new StringBuilder("Nev: " + firstName + " " + lastName + "\nAccounts:\n");
        for (int i = 0; i < numAccounts; i++) {
            customerInfo.append(accounts[i]).append("\n");
        }
        return customerInfo.toString();
    }
    public BankAccount getAccount(){
        return this.account;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void closeAccount(){
        this.account=null;
    }
}
