package queue;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(ArrayList<Object> items, int CAPACITY) {
        this.items = new ArrayList<>(CAPACITY);
        this.CAPACITY = CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        /*if(items.size()==0)
            return true;
        else
            return false;*/
        /*return items.size()==0;*/
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        if (items.size()>=CAPACITY)
            return true;
        else
            return false;
    }

    @Override
    public void enQueue(Object object) {
        if(isFull()){
            System.out.println("a sor tele van");
            return;
        }
        else {
            items.add(object);
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            System.out.println("a sor ures");
            return null;
        }
        else return items.remove(0);
    }

    @Override
    public void printQueue() {
        for (Object object : items){
            System.out.println(object);        }
    }
}
