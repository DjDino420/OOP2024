package oop.labor07.lab7_1;
import oop.labor07.lab7_1.account.BankAccount;
import oop.labor07.lab7_1.account.CheckingAccount;
import oop.labor07.lab7_1.account.SavingsAccount;
import oop.labor07.lab7_1.people.Bank;
import oop.labor07.lab7_1.people.Customer;

public class Main {
    public static void main(String[] args){
        SavingsAccount account1 = new SavingsAccount(0,8);
        System.out.println(account1);
        CheckingAccount account2 = new CheckingAccount(50);
        account2.deposit(100);
        System.out.println(account2);
        account2.withdraw(150);
        System.out.println(account2);


        Bank BT = new Bank("BancaTransilvania");
        Customer customer1 = new Customer("Bambo","Peter");
        BT.addCustomer(customer1);
        BT.addCustomer(customer1);
        for (int i = 0; i < BT.getNumberOfCustomers(); i++) {
            Customer save = BT.getCustomer(i);
        }
    }
}
