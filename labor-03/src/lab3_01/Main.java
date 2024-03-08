package lab3_01;

public class Main {
    public static void main(String[] args) {
        Customer john = new Customer("John", "BLACK");
        john.setAccount(new BankAccount("OTP00001"));
        john.getAccount().deposit(1000);
        System.out.println(john);
        Customer mary = new Customer("Mary", "WHITE");
        mary.setAccount(new BankAccount("OTP00002"));
        System.out.println("Mary's data before operations:");
        // Perform some operations with Mary's account
        BankAccount maryAccount = mary.getAccount();
        if (maryAccount != null) {
            maryAccount.deposit(1000.0);  // Deposit some amount
            maryAccount.withdraw(500.0);  // Withdraw some amount
        }
        System.out.println(mary);
        mary.setAccount(john.getAccount());
        System.out.println("\nJohn's and Mary's data after sharing account:");
        System.out.println(john);
        System.out.println(mary);
    }
}

