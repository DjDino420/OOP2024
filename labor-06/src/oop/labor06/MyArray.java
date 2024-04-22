package oop.labor06;

import java.util.Random;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(MyArray otherArray) {
        this.length = otherArray.length;
        this.elements = new double[length];
        System.arraycopy(otherArray.elements, 0, this.elements, 0, length);
    }

    public MyArray(double[] elements) {
        this.length = elements.length;
        this.elements = new double[length];
        System.arraycopy(elements, 0, this.elements, 0, length);
    }

    public MyArray(String str) {
        String[] strArray = str.split("\\s+");
        this.length = strArray.length;
        this.elements = new double[length];
        for (int i = 0; i < length; i++) {
            this.elements[i] = Double.parseDouble(strArray[i]);
        }
    }

    public void fillRandom(double a, double b) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            elements[i] = a + (b - a) * random.nextDouble();
        }
    }

    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        double[] newArray = new double[length - 1];
        for (int i = 0, j = 0; i < length; i++) {
            if (i != index) {
                newArray[j++] = elements[i];
            }
        }
        length--;
        elements = newArray;
    }
    public double get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return elements[index];
    }
}
