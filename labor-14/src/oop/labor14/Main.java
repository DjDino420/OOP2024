package oop.labor14;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 9.00);
        Point point2 = new Point(4, 6);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
        System.out.println("Distance : " + point1.distance(point2));
    }
}
