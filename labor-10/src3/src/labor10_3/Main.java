package labor10_3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("HalaMadriiid");
        Employee e1 = new Employee("Ambarus","Balazs",1000,new MyDate(2004,06,02));
        Employee e2 = new Employee("Lacko","Adorjan",4231,new MyDate(1997,01,06));
        Employee e3 = new Employee("Marton","Kund",121,new MyDate(2001,03,05));
        Manager m1 = new Manager("Bambo","Peter",1500,new MyDate(2004,03,30),"WebDev");
        company1.hire(e1);
        company1.hire(e2);
        company1.hire(e3);
        company1.hire(m1);
        System.out.println("Abc sorrend:\n");
        company1.sortbyComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getFirstName().equals(o2.getFirstName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        company1.printAll(System.out);
        System.out.println("Fizetes szeritn csokkeno:\n");
        company1.sortbyComparator((Employee o1, Employee o2)->{
            return Double.compare(o2.getSalary(),o1.getSalary());
        });
        /*

        Ez ugyan az mint 30-32 sor

        ompany1.sortbyComparator(( o1,  o2)->
             Double.compare(o2.getSalary(),o1.getSalary())
        );*/
        company1.printAll(System.out);
    }
}