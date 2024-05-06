package oop.labor10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo = new SortingDemo("D:\\Github\\BamboPeter\\OOP2024\\labor-10\\src\\oop\\labor10_1\\fruits.csv");
        System.out.println("Original order:");
        demo.printFruits();

        demo.sortAlphabetically();
        System.out.println("Sorted alphabetically:");
        demo.printFruits();

        demo.sortReverseAlphabetically();
        System.out.println("Sorted reverse alphabetically:");
        demo.printFruits();
    }
}
