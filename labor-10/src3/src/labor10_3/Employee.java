package labor10_3;


public class Employee {
    private int ID;
    private String firstName;
    private String LastName;
    private double salary;
    private MyDate birthDate;

    public Employee(String firstName, String lastName, double salary, MyDate date) {
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
    }

    private static int counter;
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public static int getCounter() {
        return counter;
    }


}
