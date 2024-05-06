package labor10_2;
import java.util.ArrayList;
import java.util.Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024,05,02);
        List<MyDate> dates = new ArrayList<>();
        dates.add(date);
        dates.add(new MyDate(2024,05,01));
        dates.add(new MyDate(2023,05,01));
        dates.add(new MyDate(2004,03,30));
        dates.add(new MyDate(2023,03,30));
        Collections.sort(dates);
        System.out.println("Datum novevkoben:");
        for (MyDate d: dates){
            System.out.println(d);
        }
        System.out.println("\nDatum csokkenoben:");
        Collections.sort(dates,Collections.reverseOrder());
        for (MyDate d : dates){
            System.out.println(d);
        }
    }
}