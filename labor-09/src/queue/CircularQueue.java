package queue;

import java.util.ArrayList;

public class CircularQueue implements IQueue {
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;

    }

    @Override
    public boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % CAPACITY == front;
    }

    @Override
    public void enQueue(Object object) {
        if (isFull()) {
            System.out.println("A sor tele van");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % CAPACITY;
        }
        items[rear] = object;
    }

    @Override
    public Object deQueue() {
        Object aux = items[front];
        if (isEmpty()) {
            System.out.println("a sor ures");
            return null;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else front = (front + 1) % CAPACITY;
        return aux;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("ures");
        } else {
            for (Object item : items) {
                System.out.println(item);
            }
        }
    }
}
