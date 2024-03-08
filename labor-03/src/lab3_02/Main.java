package lab3_02;

import lab3_01.BankAccount;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John", "BLACK");

        // Create and add accounts to the customer
        customer.addAccount(new BankAccount("OTP00001"));
        customer.addAccount(new BankAccount("OTP00002"));

        // Print customer's data
        System.out.println(customer);
    }
}
