package oop.labor04;

import java.util.Random;
//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
public class MyArray {
    private int lenght;
    private double[] elements;

    public MyArray(int lenght) {
        this.lenght = lenght;
    }

    public MyArray(MyArray ) {

    }
    public MyArray(double[] elements) {

    }
    public MyArray(String ) {

    }


    public void fillRandom(double a, double b) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (b - a) * random.nextDouble();
        }
    }

}