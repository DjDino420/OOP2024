package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\ncourses: \n");
        ArrayList<Course> courses = readFromCSVFile("curses.csv");
        for(Course p : courses){
            System.out.println(p);
        }
        System.out.println("\nstudents: \n");
        ArrayList<Student> students = readFromCSVFile2("students.csv");
        for(Student p : students){
            System.out.println(p);
        }


    }

    public static ArrayList<Course> readFromCSVFile(String fileIn) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileIn))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String name = items[0].trim();
                String Description = items[1].trim();

                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, Description, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public static ArrayList<Student> readFromCSVFile2(String fileIn) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileIn))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();

                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }



}
