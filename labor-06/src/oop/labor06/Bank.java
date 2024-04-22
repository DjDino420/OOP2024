package oop.labor06;

import java.io.PrintStream;

public class Bank {
    public String name;

    private void printCustomers(PrintStream ps) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : customers) {
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
}
