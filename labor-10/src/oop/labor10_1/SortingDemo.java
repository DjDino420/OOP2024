package oop.labor10_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Collections;

public class SortingDemo {
    private ArrayList<String> fruits;

    // Constructor to read fruits from the CSV file
    public SortingDemo(String filename) {
        fruits = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Assuming fruits are separated by commas
                for (String part : parts) {
                    fruits.add(part.trim()); // Trim whitespace from each fruit
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to sort fruits alphabetically
    public void sortAlphabetically() {
        Collections.sort(fruits);
    }

    // Method to sort fruits reverse alphabetically
    public void sortReverseAlphabetically() {
        Collections.sort(fruits, Collections.reverseOrder());
    }

    // Method to print fruits separated by spaces
    public void printFruits() {
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println(); // Print a new line at the end
    }
}