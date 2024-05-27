package oop.labor13;
import oop.labor13.Date.InvalidDateException;
import oop.labor13.Date.MyDate;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        readCsv("students.csv");
    }
    public static ArrayList<Student>readCsv(String filename){
        ArrayList<Student>students=new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while(scanner.hasNextLine()){
                String s=scanner.nextLine();
                System.out.println(s);
                String[] array=s.split(",");
                try {
                    String neptunId=array[0].trim();
                    String firstName=array[1].trim();
                    String lastName=array[2].trim();
                    int credit=Integer.parseInt(array[3].trim());
                    MyDate date=new MyDate(Integer.parseInt(array[4].trim()),Integer.parseInt(array[5].trim()),Integer.parseInt(array[6]));
                    Student student = new Student(neptunId,firstName,lastName,credit,date);
                    students.add(student);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("incomplete line:"+s);
                }
                catch (NumberFormatException e){
                    System.out.println("number format exception" + s);
                }
                catch (InvalidDateException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        return students;
    }
}
