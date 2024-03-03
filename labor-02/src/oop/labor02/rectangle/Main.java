package oop.labor02.rectangle;
import java.util.Random;
public class Main {
    public static void main(String args[]){
        int numberOfRectangles = 10;
        double totalArea=0;

        Rectangle[] rectangles = new Rectangle[numberOfRectangles];

        Random rand = new Random();

        for (int i = 0; i < numberOfRectangles; i++) {

            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Rectangle " + i + ": Length = " + rectangles[i].getLength());
            System.out.println("Rectangle " + i + ": Width = " + rectangles[i].getWidth());
            System.out.println("Rectangle " + i + ": Area = " + rectangles[i].area());
            System.out.println("Rectangle " + i + ": Perimeter = " + rectangles[i].perimeter());
            totalArea=totalArea+rectangles[i].area();
        }
        System.out.println("Total Area: "+totalArea);

    }
}
