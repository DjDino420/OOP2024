package oop.labor07.lab7_1.people;

import java.io.PrintStream;
import java.util.ArrayList;
import oop.labor07.lab7_1.people.Customer;
import oop.labor07.lab7_1.account.BankAccount;
public class Bank {
    public String name;

    public Bank(String bank) {
        this.
    }

    private void printCustomers(PrintStream ps) {
        private ArrayList<Customer> customers = new ArrayList<>();
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : customers){
            ps.println(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getLastName() + ", " + customer.getNumAccounts());
        }
        ps.close();
    }

    public void printCustomersToStdout() {
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename) {
        try {
            printCustomers(new PrintStream(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  int getNumberOfCustomers(){
        return ;
    }
    public void addCustomer(Customer customer) {0
    }

    public Customer getCustomer(int i) {
        return this
    }
}
