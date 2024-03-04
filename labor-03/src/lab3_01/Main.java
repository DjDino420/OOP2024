package lab3_01;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        customer1.setAccount(new BankAccount("43dfs2"));
        System.out.println(customer1.getAccount());
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
    }
}

