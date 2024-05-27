package oop.labor13;

import oop.labor13.Date.MyDate;

public class Student {
    private String neptunId;
    private String firstName;
    private String LastName;
    private int credits;
    private MyDate birthDate;


    public Student(String neptunId, String firstName, String lastName, int credits, MyDate birhDate) {
        this.neptunId = neptunId;
        this.firstName = firstName;
        this.LastName = lastName;
        this.credits = credits;
        this.birthDate=birhDate;
    }@Override
    public String toString() {
        return "Student{" +
                "neptunId='" + neptunId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", credits=" + credits +
                ", birthDate=" + birthDate +
                '}';
    }
}
