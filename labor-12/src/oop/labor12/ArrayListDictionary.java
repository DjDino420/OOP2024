package oop.labor12;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;
    private static ArrayListDictionary instance;

    private ArrayListDictionary(){

    }

    @Override
    public int size() {
        return words.size();
    }

    @Override
    public boolean add(String s) {
        return words.add(s);
    }

    @Override
    public boolean find(String s) {

    }

    public static IDictionary newInstance() {
        return new ArrayListDictionary(new ArrayList<>());
    }
}