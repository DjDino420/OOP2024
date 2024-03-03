package oop.labor02.date;
import java.util.Random;
public class Main {

    public static void main(String args[]){
        Random rand = new Random();
        int incorrect = 0;

        for (int i = 0; i < 1000; i++) {
            int randomYear = rand.nextInt(3000);
            int randomMonth = rand.nextInt(12);
            int randomDay = rand.nextInt(31);

            MyDate date = new MyDate(randomYear, randomMonth, randomDay);

            if (DateUtil.isValidDate(date)) {
                System.out.println(date);
            } else {
                incorrect++;
            }
        }

        System.out.println("Number of incorrect dates: " + incorrect);
    }
}