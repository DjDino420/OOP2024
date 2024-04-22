package oop.labor06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 150; i++) {
            customers.add(new Customer("fdgd", "dsfds"));
        }
            BankAccount account = new BankAccount();
            String accountNumber = account.getAccountNumber();
            System.out.println("Account Number: " + accountNumber);
        }
    public static void main(String[] args) {
        // Create an ArrayList to hold customers
        ArrayList<Customer> customers = new ArrayList<>();

        // Create and add three customers
        Customer customer1 = new Customer("John", "Doe");
        customer1.addAccount(new BankAccount(customer1, 1000.0));
        customers.add(customer1);

        Customer customer2 = new Customer("Alice", "Smith");
        customer2.addAccount(new BankAccount(customer2, 2000.0));
        customer2.addAccount(new BankAccount(customer2,1));
        customers.add(customer2);

        Customer customer3 = new Customer("Bob", "Johnson");
        customer3.addAccount(new BankAccount(customer3, 1500.0));
        customers.add(customer3);

        // Print details of each customer along with their associated account numbers
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Account numbers:");
            ArrayList<String> accountNumbers = customer.getAccountNumbers();
            for (String accountNumber : accountNumbers) {
                System.out.println(accountNumber);
            }
            System.out.println();
        }
    }
    }
}
