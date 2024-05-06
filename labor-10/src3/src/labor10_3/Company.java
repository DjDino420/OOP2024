package labor10_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee employee){
        employees.add(employee);
    }
    public void hireAll(String de){

    }
    public void fire(int index){
        employees.remove(index);
    }
    public void printAll(PrintStream ps){
        for (Employee e: employees){
            ps.println(e);
        }
    }
    public void printManagers(PrintStream ps){
        for (Employee e : employees){
            if (e instanceof Manager){
                ps.println(e);
            }
        }
    }
    public void sortbyComparator(Comparator<Employee> comp){
        Collections.sort(employees,comp);
    }
}