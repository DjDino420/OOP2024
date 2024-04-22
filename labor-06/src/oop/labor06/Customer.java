package oop.labor06;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=++numCustomers;
    }

    public int getNumAccounts(){
        return accounts.size();
    }


    public void addAccount(BankAccount account){
        accounts.add(account);
    }


    public BankAccount getAccount(String accountNumber){
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public int getId() {
        return id;
    }
    public ArrayList<String> getAccountNumbers() {
        List<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts) {
            accountNumbers.add(account.getAccountNumber());
        }
        return (ArrayList<String>) accountNumbers;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void closeAccount(String accountNumber){
        boolean found = false;
        for (BankAccount acc : accounts){
            if (acc.getAccountNumber().equals(accountNumber)){
                accounts.remove(acc);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Non-existent account number");
        }
    }
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(id + ":"+ firstName + ' ' + lastName + " " + id + " accounts:\n");
        for(int i=0; i<accounts.size(); ++i){
            result.append( "\t" + accounts.get(i) +"\n");
        }
        return result.toString();
    }
}