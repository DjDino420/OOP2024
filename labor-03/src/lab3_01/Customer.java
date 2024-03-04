package lab3_01;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    @Override
    public String toString(){
        return "Nev: "+firstName+" "+lastName;
    }
    public BankAccount getAccount(){
        return this.account;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void closeAccount(){
        this.account=null;
    }
}
