package oop.labor02.bank;

import oop.labor02.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor02");
        BankAccount account1 = new BankAccount("OTP00001");
        BankAccount account2 = new BankAccount("OTP00001");
        System.out.println(account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getBalance());

    }
}
