package oop.labor02.bank;

import oop.labor02.bank.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor02");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            BankAccount account=new BankAccount("OTP"+i);
            account.deposit(1+rand.nextDouble(100));
        }
        new BankAccount("OTP1");

        double total=0;

        for (int i = 0; i < 10; i++) {

            double sum = 1 + rand.nextInt(10);

            System.out.println("OTP" + i);

            total=total+sum;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(OTP[i].getBalance());
        }
    }
}
